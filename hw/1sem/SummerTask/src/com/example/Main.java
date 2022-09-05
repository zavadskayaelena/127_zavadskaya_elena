package com.example;

import com.example.game.Game;
import com.example.game.GameBuilder;
import com.example.gameObject.wall.Walkable;
import com.example.gameObject.wall.impl.Floor;
import com.example.gameObject.move.impl.Player;
import com.example.gameObject.wall.impl.Wall;
import com.example.game.impl.*;
import com.example.map.Map;
import com.example.map.impl.SimpleMap;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Map map = new SimpleMap(new Walkable[][]
                {
                        {new Floor(0,0), new Floor(0,1), new Wall(0,2)},
                        {new Floor(1,0), new Wall(1,1), new Wall(1,2)},
                        {new Wall(2,0), new Wall(2,1), new Wall(2,2)}
                }, player
        );
        GameBuilder gameBuilder = new ZavadskayaElenaDmitrievnaGameBuilder().map(map);
        Game game = gameBuilder.build();
        game.run();
    }
}
