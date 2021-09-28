package com.jonathan.videogame.adventure_game.core.entities.character;

import javafx.geometry.Dimension2D;
import javafx.scene.canvas.GraphicsContext;

public abstract class Character {
    protected CharacterState state;
    protected CharacterSprite sprite;
    
    protected Vector2 position;
    protected Vector2 velocity;
    
    public void render( GraphicsContext drawer ) {
        Dimension2D spriteDimension = sprite.getDimension();
        drawer.drawImage( sprite.getImage(), 0, 0 );
    }
    
    public void handleInput( String code ) {
        state.handleInput( this, code );
    }
    
    public void update() {
        state.update( this );
    }
    
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
