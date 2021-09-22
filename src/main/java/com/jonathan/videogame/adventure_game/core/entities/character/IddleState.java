package com.jonathan.videogame.adventure_game.core.entities.character;

public class IddleState implements CharacterState {
    private Character character;
    
    public IddleState( Character character ) {
        this.character = character;
    }
    
    @Override
    public void handleInput() {
        
    }
    
    @Override
    public void onEnterState() {
        
    }
    
    @Override
    public void observe() {
        
    }
}
