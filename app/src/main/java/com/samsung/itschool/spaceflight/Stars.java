package com.samsung.itschool.spaceflight;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

public class Stars {
    public Stars() {
        for (int i = 0; i < 100; i++) {
            stars.add(new Star());
        }
    }

    Paint p = new Paint();
    ArrayList<Star> stars;
    public void draw(Canvas c) {
        for (Star s: stars) {
            p.setColor(s.color);
            c.drawCircle(s.getX(), s.getY(), 10, p);
        }

    }
    public void moveStars() {
        for (Star s: stars) {
            s.move();
        }
        // 1 передвигает каждую "звезду"
        // 2 если звезда вышла за границы экрана
        // создать её заново
    }
}
