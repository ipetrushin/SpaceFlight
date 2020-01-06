package com.samsung.itschool.spaceflight;

public class Star {
    float angle, radius, velocity;
    int color;

    public Star() {
        // создаёт объекс со случайными параметрами
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
