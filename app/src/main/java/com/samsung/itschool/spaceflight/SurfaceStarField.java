package com.samsung.itschool.spaceflight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SurfaceStarField extends SurfaceView implements SurfaceHolder.Callback {
    Stars stars = new Stars();
    SurfaceHolder holder;
    DrawThread thread;
    class DrawThread extends Thread {
        boolean isRunning = true;
        @Override
        public void run() {
            super.run();

            while (isRunning) {
                try { sleep(50); } catch (InterruptedException e) {}
                Canvas c = holder.lockCanvas();
                // проверить, существует ли канва
                if (c != null) {
                    c.drawColor(Color.rgb(0,0,30));
                    stars.draw(c);
                    holder.unlockCanvasAndPost(c);
                }
                stars.moveStars();
            }
        }
    }

    public SurfaceStarField(Context context, AttributeSet attrs) {
        super(context, attrs);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        holder = surfaceHolder;
        thread = new DrawThread();
        thread.start();
        Log.d("mytag", "Surface Created");
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
