package com.jonathan.videogame.menu.view;

import com.jonathan.videogame.CustomEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MenuPane extends AnchorPane {
    private Button startAdventureGameButton;
    private Button startPlatformGameButton;
    
    public MenuPane() {
        init();
    }
    
    private void init() {
        setBackground( 
            new Background( 
                new BackgroundFill( 
                    Color.valueOf( "#e6e1f0" ), 
                    CornerRadii.EMPTY, 
                    Insets.EMPTY 
                ) 
            )
        );
        getChildren().addAll( getStartAdventureGameButton(), getStartPlatformGameButton() );
    }
    
    private Button getStartAdventureGameButton() {
        if ( startAdventureGameButton == null ) {
            startAdventureGameButton = new Button( "Start Adventure Game" );
            startAdventureGameButton.setAlignment( Pos.CENTER );
            startAdventureGameButton.setContentDisplay( ContentDisplay.CENTER );
            startAdventureGameButton.setLayoutX( 270.0 );
            startAdventureGameButton.setLayoutY( 188.0 );
            startAdventureGameButton.setFont( Font.font( 22 ) );
            startAdventureGameButton.setOnAction( ( e ) -> {
                fireEvent( new CustomEvent( CustomEvent.START_ADVENTURE_GAME ) );
            } );
        }
        return startAdventureGameButton;
    }
    
    private Button getStartPlatformGameButton() {
        if ( startPlatformGameButton == null ) {
            startPlatformGameButton = new Button( "Start Platform Game" );
            startPlatformGameButton.setAlignment( Pos.CENTER );
            startPlatformGameButton.setContentDisplay( ContentDisplay.CENTER );
            startPlatformGameButton.setLayoutX( 280.0 );
            startPlatformGameButton.setLayoutY( 248.0 );
            startPlatformGameButton.setFont( Font.font( 22 ) );
            startPlatformGameButton.setOnAction( ( e ) -> {
                fireEvent( new CustomEvent( CustomEvent.START_PLATFORM_GAME ) );
            } );
        }
        return startPlatformGameButton;
    }
}
