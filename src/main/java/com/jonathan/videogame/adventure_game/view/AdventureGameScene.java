package com.jonathan.videogame.adventure_game.view;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class AdventureGameScene extends Scene {
    private Pane pane;
    
    public AdventureGameScene() {
        super( new AdventurePane() );
        pane = ( AdventurePane ) getRoot();
    }
}