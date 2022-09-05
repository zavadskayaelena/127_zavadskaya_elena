package com.example.gameObject.move;

import com.example.gameObject.base.GameObject;

public interface Movable extends GameObject {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
