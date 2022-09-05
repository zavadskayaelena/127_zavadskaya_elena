package com.example.gameObject.base.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseGameObjectTest {

    @Test
    void getX() {
        BaseGameObject baseGameObject=new BaseGameObject(0,0);
        assertEquals(0,baseGameObject.getX());
    }

    @Test
    void getY() {
        BaseGameObject baseGameObject=new BaseGameObject(0,0);
        assertEquals(0,baseGameObject.getY());
    }

    @Test
    void getSymbol() {
    }
}