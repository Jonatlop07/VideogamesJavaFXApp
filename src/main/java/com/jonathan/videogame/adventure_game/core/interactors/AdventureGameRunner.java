package com.jonathan.videogame.adventure_game.core.interactors;

import com.jonathan.videogame.Game;
import com.jonathan.videogame.adventure_game.core.entities.character.Character;
import com.jonathan.videogame.adventure_game.core.entities.character.human.HumanFactory;
import com.jonathan.videogame.adventure_game.core.entities.character.human.knight.KnightFactory;
import com.jonathan.videogame.adventure_game.core.scenarios.InitialScenario;
import com.jonathan.videogame.adventure_game.core.scenarios.Scenario;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AdventureGameRunner extends AnimationTimer {
    private final Scene scene;
    private final GraphicsContext drawer;
    
    private final List<Character> characters;
    
    private HumanFactory humanFactory;
    
    private Scenario scenario;
    
    public AdventureGameRunner( Scene scene, GraphicsContext graphicsContext ) {
        this.scene = scene;
        this.drawer = graphicsContext;
        this.characters = new ArrayList<>();
        setup();
    }
    
    @Override
    public void handle( long l ) {
        try {
            render();
        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        }
    }
    
    private void setup() {
        this.scenario = new InitialScenario( "initial.png" );
        humanFactory = new KnightFactory();
        characters.add( humanFactory.create() );
    }
    
    private void render() throws FileNotFoundException {
        drawer.clearRect( 0, 0, 800, 600 );
        scenario.render( drawer );
        characters.forEach( character -> character.render( drawer ) );
    }
}
