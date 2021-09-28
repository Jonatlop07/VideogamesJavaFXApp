package com.jonathan.videogame.adventure_game.core.entities.character;

public class Vector2 {
    private double x;
    private double y;
    
    public static Vector2 up = new Vector2( 0, -1 );
    public static Vector2 down = new Vector2( 0, 1 );
    public static Vector2 left = new Vector2( -1, 0 );
    public static Vector2 right = new Vector2( 1, 0 );
    public static Vector2 one = new Vector2( 1, 1 );
    public static Vector2 zero = new Vector2( 0, 0 );
    
    public Vector2( double x, double y ) {
        this.x = x;
        this.y = y;
    }
    
    public Vector2 add( Vector2 other ) {
        return new Vector2( x + other.x, y + other.y );
    }
    
    public Vector2 neg() {
        return new Vector2( -x, -y );
    }
    
    public Vector2 scale( double factor ) {
        return new Vector2( factor * x, factor * y );
    }
    
    public Vector2 prod( Vector2 other ) {
        return new Vector2( x * other.y, -1 * other.x * y );
    }
    
    public double dot( Vector2 other ) {
        return x * other.x + y * other.y;
    }
    
    public double magnitude() {
        return Math.sqrt( x * x + y * y );
    }
    
    public double angle( Vector2 other ) {
        return Math.acos(
            ( x * other.x + y * other.y )
                /
                (
                    Math.sqrt( x * x + y * y )
                        * Math.sqrt( other.x * other.x + other.y * other.y )
                )
        );
    }
    
    public boolean equals( Vector2 other ) {
        return x == other.x && y == other.y;
    }
    
    public void set( double x, double y ) {
        this.x = x;
        this.y = y;
    }
}
