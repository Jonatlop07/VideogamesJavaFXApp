package com.jonathan.videogame;

import javafx.event.Event;
import javafx.event.EventType;

public class CustomEvent extends Event {
    public CustomEvent( EventType<? extends Event> eventType ) {
        super( eventType );
    }
    
    public static final EventType<CustomEvent> START_THE_GAME = new EventType<>("START_THE_GAME");
}
