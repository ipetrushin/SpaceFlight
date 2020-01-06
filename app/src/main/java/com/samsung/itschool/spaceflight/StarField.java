package com.samsung.itschool.spaceflight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class StarField extends View {
    Stars stars = new Stars();
    public StarField(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.rgb(0,0,30));
        stars.draw(canvas);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        stars.moveStars();
        invalidate();
        return true;
    }
}
