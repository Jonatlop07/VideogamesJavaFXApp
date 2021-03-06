package com.jonathan.videogame;

import com.jonathan.videogame.adventure_game.core.interactors.AdventureGameRunner;
import com.jonathan.videogame.adventure_game.presentation.controller.AdventureGameController;
import com.jonathan.videogame.adventure_game.presentation.controller.AdventureGameControllerInterface;
import com.jonathan.videogame.adventure_game.presentation.model.AdventureGameModel;
import com.jonathan.videogame.adventure_game.presentation.model.AdventureGameModelInterface;
import com.jonathan.videogame.adventure_game.presentation.view.AdventureGamePane;
import com.jonathan.videogame.adventure_game.presentation.view.AdventureGameScene;
import com.jonathan.videogame.menu.controller.MenuController;
import com.jonathan.videogame.menu.controller.MenuControllerInterface;
import com.jonathan.videogame.menu.model.MenuModel;
import com.jonathan.videogame.menu.model.MenuModelInterface;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
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
                    AdventureGameScene adventureGameScene = ( AdventureGameScene ) adventureGameController.getViewScene();
                    AdventureGamePane adventureGamePane = ( AdventureGamePane ) adventureGameScene.getPane();
                    GraphicsContext drawer = adventureGamePane.getCanvas().getGraphicsContext2D();
                    adventureGamePane.getCanvas().setWidth( 800 );
                    adventureGamePane.getCanvas().setHeight( 600 );
                    AdventureGameRunner animation = new AdventureGameRunner( adventureGameScene, drawer );
                    animation.start();
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