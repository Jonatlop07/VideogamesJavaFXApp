package com.jonathan.videogame.adventure_game;

import com.jonathan.videogame.adventure_game.core.interactors.AdventureGameInteractor;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;

public class AdventureGameAnimation extends AnimationTimer {
    private Scene scene;
    private GraphicsContext drawer;
    private AdventureGameInteractor adventureGame;
    
    public AdventureGameAnimation( Scene scene, GraphicsContext drawer ) {
        this.scene = scene;
        this.drawer = drawer;
    }
    
    @Override
    public void handle( long l ) {
        
    }
}
