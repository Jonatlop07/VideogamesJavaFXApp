package com.jonathan.videogame.adventure_game.core.entities.character;

public interface CharacterState {
    void handleInput( Character character, String code );
    
    void update( Character character );
    
    void onEnterState();
    
    void observe();
}
