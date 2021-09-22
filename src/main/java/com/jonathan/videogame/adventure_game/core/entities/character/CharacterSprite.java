package com.jonathan.videogame.adventure_game.core.entities.character;

import javafx.geometry.Dimension2D;
import javafx.scene.image.Image;

public class CharacterSprite {
    private Image image;
    private Dimension2D dimension;
    
    private static String sourcePath = "src/main/resources/com/jonathan/videogame/sprites/adventure_game/";
    
    public CharacterSprite( double width, double height, String imageRelativePath ) {
        dimension = new Dimension2D( width, height );
        image = new Image( sourcePath + imageRelativePath, dimension.getWidth(), dimension.getHeight(), true, true );
    }
    
    public Dimension2D getDimension() {
        return dimension;
    }
    
    public Image getImage() {
        return image;
    }
}
