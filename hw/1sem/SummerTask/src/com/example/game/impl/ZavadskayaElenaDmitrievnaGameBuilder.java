package com.example.game.impl;

import com.example.game.GameBuilder;
import com.example.map.Map;

public class ZavadskayaElenaDmitrievnaGameBuilder implements GameBuilder {
    private Map map;

    public ZavadskayaElenaDmitrievnaGameBuilder() {
    }

    public ZavadskayaElenaDmitrievnaGameBuilder map(Map map) {
        this.map = map;
        return this;
    }

    @Override
    public ZavadskayaElenaDmitrievnaGame build() {
        return new ZavadskayaElenaDmitrievnaGame(map);
    }

    public String toString() {
        return "ZavadskayaElenaDmitrievnaGame.ZavadskayaElenaDmitrievnaGameBuilder(map=" + this.map + ")";
    }
}