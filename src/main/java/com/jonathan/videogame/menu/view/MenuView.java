package com.jonathan.videogame.menu.view;

import com.jonathan.videogame.abstractions.View;
import com.jonathan.videogame.menu.controller.MenuControllerInterface;
import com.jonathan.videogame.menu.model.MenuModelInterface;

import java.io.IOException;

public class MenuView extends View {
    public MenuView( MenuControllerInterface controller, MenuModelInterface model ) {
        super( controller, model );
    }
    
    @Override
    public void createView() throws IOException {
        // FXMLLoader menuFxmlLoader = new FXMLLoader( Game.class.getResource( "menu-view.fxml" ) );
        // menuFxmlLoader.load()
        scene = new MenuScene();
    }
}
