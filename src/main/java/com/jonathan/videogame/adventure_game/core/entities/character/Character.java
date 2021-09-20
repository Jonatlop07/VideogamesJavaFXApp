package com.jonathan.videogame.adventure_game.core.entities.character;

public abstract class Character {
    protected CharacterState state;
    
    public abstract void walk();
    
    public abstract void stop();
    
    protected abstract void changeStateTo( CharacterState newState );
}
