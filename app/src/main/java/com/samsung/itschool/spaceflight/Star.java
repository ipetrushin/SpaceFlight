package com.samsung.itschool.spaceflight;

import android.graphics.Color;

public class Star {
    float angle, radius, velocity;
    int color;

    public Star() {
        // создаёт объекс со случайными параметрами
        velocity = 0.01f;
        radius = (float) (Math.random()*0.5);
        angle = (float) (Math.random()*Math.PI*2);
        color = Color.WHITE;
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
}
