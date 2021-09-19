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
    private Button startButton;
    
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
        getChildren().addAll( getStartButton() );
    }
    
    private Button getStartButton() {
        if ( startButton == null ) {
            startButton = new Button( "Start" );
            startButton.setAlignment( Pos.CENTER );
            startButton.setContentDisplay( ContentDisplay.CENTER );
            startButton.setLayoutX( 352.0 );
            startButton.setLayoutY( 228.0 );
            startButton.setFont( Font.font( 22 ) );
            startButton.setOnAction( ( e ) -> {
                fireEvent( new CustomEvent( CustomEvent.START_THE_GAME ) );
            } );
        }
        return startButton;
    }
}
