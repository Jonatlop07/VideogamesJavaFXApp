package com.jonathan.videogame.adventure_game.core.entities.character;

import javafx.geometry.Dimension2D;
import javafx.scene.canvas.GraphicsContext;

public abstract class Character {
    protected CharacterState state;
    protected CharacterSprite sprite;
    
    public void render( GraphicsContext drawer ) {
        Dimension2D spriteDimension = sprite.getDimension();
        drawer.drawImage( sprite.getImage(), 0, 0 );
    }
    
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
