package com.jonathan.videogame.abstractions;

import javafx.scene.Scene;

import java.io.IOException;

public abstract class View {
    protected Model model;
    protected Controller controller;
    
    protected View( Controller controller, Model model ) {
        this.controller = controller;
        this.model = model;
    }
    
    protected Scene scene;
    
    public abstract void createView() throws IOException;
    
    public Scene getScene() {
        return scene;
    }
}
