package com.jonathan.videogame;

import javafx.stage.Stage;

public class GameStageSingleton {
    private static GameStageSingleton instance;
    private Stage stage;
    
    private GameStageSingleton() {}
    
    public static GameStageSingleton getInstance() {
        if ( instance == null ) {
            instance = new GameStageSingleton();
        }
        return instance;
    }
    
    public Stage getStage() {
        return stage;
    }
    
    public void setStage( Stage stage ) {
        this.stage = stage;
    }
}
