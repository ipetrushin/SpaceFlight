package com.samsung.itschool.spaceflight;

import android.graphics.Color;

public class Star {
    float angle, radius, velocity;
    int color;

    public Star() {
        // создаёт объекс со случайными параметрами
        reset();
    }
    public void move() {
        // передвигает "звезду" на один шаг
        radius += velocity;
    }

    public float getX() {
        return (float) (Math.cos(angle)*radius);
    }
    public float getY() {
        return (float) (Math.sin(angle)*radius);
    }
    public void reset() {
        velocity = (float) (0.01 + Math.random()*0.01);
        radius = (float) (Math.random()*0.5);
        angle = (float) (Math.random()*Math.PI*2);
        int rg = (int) (Math.random()*55 + 200);
        color = Color.rgb(rg,rg, 255);
    }
}
