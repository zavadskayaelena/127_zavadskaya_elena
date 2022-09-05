package com.example.gameObject.wall.impl;

import com.example.gameObject.base.impl.BaseGameObject;
import com.example.gameObject.wall.Walkable;

public class Floor extends BaseGameObject implements Walkable {
    public Floor(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isWalkable() {
        return true;
    }

    @Override
    public char getSymbol() {
        return '=';
    }
}
