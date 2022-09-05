package com.example.gameObject.base.impl;

import com.example.gameObject.base.GameObject;

public class BaseGameObject implements GameObject {
    protected int x;
    protected int y;

    public BaseGameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public BaseGameObject() {
    }

    // Возвращает текущие координаты x, y
    // и их символьное представление.
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public char getSymbol() {
        return (char)(x+y);
    }
}
