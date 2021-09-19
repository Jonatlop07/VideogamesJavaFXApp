package com.jonathan.videogame.adventure_game.view;

import com.jonathan.videogame.abstractions.View;
import com.jonathan.videogame.adventure_game.controller.AdventureGameControllerInterface;
import com.jonathan.videogame.adventure_game.model.AdventureGameModelInterface;

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
