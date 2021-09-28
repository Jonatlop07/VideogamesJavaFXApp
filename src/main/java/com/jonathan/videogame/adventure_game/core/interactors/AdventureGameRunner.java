package com.jonathan.videogame.adventure_game.core.interactors;

import com.jonathan.videogame.adventure_game.core.entities.character.Character;
import com.jonathan.videogame.adventure_game.core.entities.character.human.HumanFactory;
import com.jonathan.videogame.adventure_game.core.entities.character.human.knight.KnightFactory;
import com.jonathan.videogame.adventure_game.core.scenarios.InitialScenario;
import com.jonathan.videogame.adventure_game.core.scenarios.Scenario;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class AdventureGameRunner extends AnimationTimer {
    private final Scene scene;
    private final GraphicsContext drawer;
    
    private final List<Character> characters;
    
    private HumanFactory humanFactory;
    
    private Scenario scenario;
    
    private final Queue<String> keysPressed;
    
    public AdventureGameRunner( Scene scene, GraphicsContext graphicsContext ) {
        this.scene = scene;
        this.drawer = graphicsContext;
        this.characters = new ArrayList<>();
        keysPressed = new SynchronousQueue<>();
        setup();
    }
    
    @Override
    public void handle( long l ) {
        render();
    }
    
    private void setup() {
        this.scene.setOnKeyPressed( e -> {
            String code = e.getCode().toString();
            keysPressed.add( code );
        } );
        this.scenario = new InitialScenario( "initial.png" );
        humanFactory = new KnightFactory();
        characters.add( humanFactory.create() );
    }
    
    private void render() {
        drawer.clearRect( 0, 0, 800, 600 );
        scenario.render( drawer );
        characters.forEach( character -> {
            character.render( drawer );
            Iterator<String> iterator = keysPressed.iterator();
            while ( iterator.hasNext() ) character.handleInput( keysPressed.remove() );
            character.update();
        } );
    }
}
