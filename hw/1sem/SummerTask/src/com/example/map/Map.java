package com.example.map;

import com.example.gameObject.move.Movable;
import com.example.gameObject.wall.Walkable;

public interface Map {
    public Walkable getWalkable(int x, int y); // Должен возвращать com.example.gameObject.wall.Walkable. (???)
    public Movable getPlayer();                // Должен возвращать com.example.gameObject.move.Movable.
}
