package com.example.map.impl;

import com.example.map.Map;
import com.example.gameObject.move.Movable;
import com.example.gameObject.wall.Walkable;
import com.example.gameObject.move.impl.Player;
import com.example.gameObject.wall.impl.Wall;

public class SimpleMap implements Map {
    private final Walkable[][] walkables;
    private final Player player;

    public SimpleMap(Walkable[][] walkables, Player player) {
        this.walkables = walkables;
        this.player = player;
    }

    @Override
    public Walkable getWalkable(int x, int y) {
        if(walkables.length<x || x<0 || y<0 || walkables[x].length<y){
            System.out.println("Конец карты");
            return new Wall(x,y);
        }
        return walkables[x][y];
    }

    @Override
    public Movable getPlayer() {
        return player;
    }
}
