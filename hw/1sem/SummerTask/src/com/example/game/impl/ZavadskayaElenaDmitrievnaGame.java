package com.example.game.impl;

import com.example.game.Game;
import com.example.map.Map;
import com.example.gameObject.move.Movable;
import com.example.gameObject.wall.Walkable;

import java.util.Objects;
import java.util.Scanner;


public class ZavadskayaElenaDmitrievnaGame implements Game {
    private  Map map;

    public ZavadskayaElenaDmitrievnaGame(Map map) {
        this.map = map;
    }

    public ZavadskayaElenaDmitrievnaGame() {
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите: вверх, вниз, влево, вправо или завершить игру.");
        String command = scanner.nextLine();

        while (!Objects.equals(command, "завершить игру")) {
            Movable movable = map.getPlayer();
            int x = movable.getX();
            int y = movable.getY();
            switch (command) {
                case "вверх": {
                    Walkable walkable = map.getWalkable(x, y + 1);
                    if (walkable.isWalkable()) {
                        movable.moveUp();
                    }
                    break;
                }
                case "влево": {
                    Walkable walkable = map.getWalkable(x-1, y );
                    if (walkable.isWalkable()) {
                        movable.moveLeft();
                    }
                    break;
                }
                case "вправо": {
                    Walkable walkable = map.getWalkable(x+1, y );
                    if (walkable.isWalkable()) {

                        movable.moveRight();
                    }
                    break;
                }
                case "вниз": {
                    Walkable walkable = map.getWalkable(x, y - 1);
                    if (walkable.isWalkable()) {
                        movable.moveDown();
                    }
                    break;
                }
                default: {
                    System.out.println("Вы ввели несуществующую команду.");
                    System.out.println("Введите: вверх, вниз, влево, вправо или завершить игру.");
                }
            }
            Walkable walkable= map.getWalkable(movable.getX(),movable.getY());
            System.out.println(walkable.getSymbol());
            command = scanner.nextLine();
        }
    }

}
