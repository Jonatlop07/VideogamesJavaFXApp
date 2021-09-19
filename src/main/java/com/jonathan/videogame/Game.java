package com.jonathan.videogame;

import com.jonathan.videogame.adventure_game.controller.AdventureGameController;
import com.jonathan.videogame.adventure_game.controller.AdventureGameControllerInterface;
import com.jonathan.videogame.adventure_game.model.AdventureGameModel;
import com.jonathan.videogame.adventure_game.model.AdventureGameModelInterface;
import com.jonathan.videogame.menu.controller.MenuController;
import com.jonathan.videogame.menu.controller.MenuControllerInterface;
import com.jonathan.videogame.menu.model.MenuModel;
import com.jonathan.videogame.menu.model.MenuModelInterface;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Game extends Application {
    private Stage primaryStage;
    
    public static void main( String[] args ) {
        launch();
    }
    
    @Override
    public void start( Stage stage ) throws IOException {
        primaryStage = stage;
        MenuModelInterface menuModel = new MenuModel();
        MenuControllerInterface menuController = new MenuController( menuModel );
        Scene menuScene = menuController.getViewScene();
        menuScene.addEventFilter( CustomEvent.START_ADVENTURE_GAME,
            ( e ) -> {
                try {
                    AdventureGameModelInterface adventureGameModel = new AdventureGameModel();
                    AdventureGameControllerInterface adventureGameController = new AdventureGameController( adventureGameModel );
                    Scene adventureGameScene = adventureGameController.getViewScene();
                    primaryStage.setTitle( "Adventure Videogame" );
                    primaryStage.setScene( adventureGameScene );
                    primaryStage.show();
                } catch ( IOException ex ) {
                    ex.printStackTrace();
                }
            } );
        stage.setTitle( "Videogame" );
        stage.setScene( menuController.getViewScene() );
        stage.setWidth( 800 );
        stage.setHeight( 600 );
        stage.show();
    }
}