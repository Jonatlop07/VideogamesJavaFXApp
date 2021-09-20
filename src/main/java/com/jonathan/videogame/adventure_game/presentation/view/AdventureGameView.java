package com.jonathan.videogame.adventure_game.presentation.view;

import com.jonathan.videogame.abstractions.View;
import com.jonathan.videogame.adventure_game.presentation.controller.AdventureGameControllerInterface;
import com.jonathan.videogame.adventure_game.presentation.model.AdventureGameModelInterface;

import java.io.IOException;

public class AdventureGameView extends View {
    public AdventureGameView( AdventureGameControllerInterface controller, AdventureGameModelInterface model ) {
        super( controller, model );
    }
    
    @Override
    public void createView() throws IOException {
        scene = new AdventureGameScene();
    }
}
