package com.jonathan.videogame.menu.view;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class MenuScene extends Scene {
    private Pane pane;
    
    public MenuScene() {
        super( new MenuPane() );
        pane = ( MenuPane ) getRoot();
    }
}
