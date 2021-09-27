package com.jonathan.videogame.adventure_game.core.scenarios;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.List;

public abstract class Scenario {
    protected Image background;
    protected List<ScenarioElement> elements;
    
    public Scenario( String imageRelativePath, double width, double height ) {
        String sourcePath = "file:src/main/resources/com/jonathan/videogame/adventure_game/scenarios/background/";
        this.background = new Image( sourcePath + imageRelativePath, width, height, true, true );
    }
    
    public void render( GraphicsContext graphicsContext ) {
        graphicsContext.drawImage( background, 0, 0 );
    }
    
    public void addElement( ScenarioElement element ) {
        elements.add( element );
    }
}
