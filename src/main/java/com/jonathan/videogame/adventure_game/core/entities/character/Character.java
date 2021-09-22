package com.jonathan.videogame.adventure_game.core.entities.character;

public abstract class Character {
    protected CharacterState state;
    private CharacterSprite sprite;
    
    public abstract void walk();
    
    public abstract void stop();
    
    protected void changeStateTo( CharacterState newState ) {
        this.state = newState;
        this.state.onEnterState();
    }
    
    public void setSprite( CharacterSprite sprite ) {
        this.sprite = sprite;
    }
    
    public CharacterSprite getSprite() {
        return sprite;
    }
}
