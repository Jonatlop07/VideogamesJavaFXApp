package com.jonathan.videogame.adventure_game.core.entities.character.human.knight;

import com.jonathan.videogame.adventure_game.core.entities.character.Character;
import com.jonathan.videogame.adventure_game.core.entities.character.CharacterState;

public class SwordKnightIddleState implements CharacterState {
    
    @Override
    public void handleInput( Character character, String code ) {
        if (code.equals( "D" )) {
            
        }
    }
    
    @Override
    public void update( Character character ) {
        
    }
    
    @Override
    public void onEnterState() {
        
    }
    
    @Override
    public void observe() {
        
    }
}
