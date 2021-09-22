package com.jonathan.videogame.adventure_game.core.entities.character;

public interface CharacterState {
    void handleInput();
    void onEnterState();
    void observe();
}
