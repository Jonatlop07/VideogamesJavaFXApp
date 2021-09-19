package com.jonathan.videogame.adventure_game.controller;

import com.jonathan.videogame.adventure_game.model.AdventureGameModelInterface;
import com.jonathan.videogame.adventure_game.view.AdventureGameView;

import java.io.IOException;

public class AdventureGameController extends AdventureGameControllerInterface {
    private AdventureGameModelInterface model;
    
    public AdventureGameController( AdventureGameModelInterface model ) throws IOException {
        this.model = model;
        view = new AdventureGameView( this, model );
        view.createView();
    }
}
