package com.example.gameObject.wall.impl;

import com.example.gameObject.base.impl.BaseGameObject;
import com.example.gameObject.wall.Walkable;

public class Wall extends BaseGameObject implements Walkable {
    // Должен возвращать объект из массива com.example.gameObject.wall.Walkable
    // и объект com.example.gameObject.move.impl.Player. Обработка исключений - через консоль.


    public Wall(int x, int y) {
        super(x, y);
    }


    @Override
    public boolean isWalkable() {
        return false;
    }

    @Override
    public char getSymbol() {
        return '|';
    }
}
