package com.jonathan.videogame.adventure_game.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;

public class AdventureGamePane extends AnchorPane {
    private Canvas canvas;
    
    public AdventureGamePane() {
        super();
        getChildren().addAll( getCanvas() );
    }
    
    public Canvas getCanvas() {
        if (canvas == null) {
            canvas = new AdventureGameCanvas();
        }
        return canvas;
    }
}
