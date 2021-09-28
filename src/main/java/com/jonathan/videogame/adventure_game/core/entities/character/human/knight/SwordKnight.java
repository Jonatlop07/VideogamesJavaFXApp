package com.jonathan.videogame.adventure_game.core.entities.character.human.knight;

import com.jonathan.videogame.adventure_game.core.entities.character.CharacterSprite;
import com.jonathan.videogame.adventure_game.core.entities.character.CharacterState;
import com.jonathan.videogame.adventure_game.core.entities.character.Vector2;
import com.jonathan.videogame.adventure_game.core.entities.character.human.knight.Knight;
import javafx.geometry.Dimension2D;
import javafx.scene.canvas.GraphicsContext;

public class SwordKnight extends Knight {
    public SwordKnight( CharacterSprite sprite ) {
        this.sprite = sprite;
        this.position = Vector2.zero;
        this.velocity = Vector2.zero;
    }
    
    @Override
    protected void changeStateTo( CharacterState newState ) {
        
    }
}
