package com.example.gameObject.move.impl;

import com.example.gameObject.base.impl.BaseGameObject;
import com.example.gameObject.move.Movable;

public class Player extends BaseGameObject implements Movable {
    // Должен изменять координаты объекта.

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

}
