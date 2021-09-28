package com.jonathan.videogame.adventure_game.core.entities.character.human.knight;

import com.jonathan.videogame.adventure_game.core.entities.character.CharacterSprite;
import com.jonathan.videogame.adventure_game.core.entities.character.human.HumanFighterFactory;

public class KnightFactory extends HumanFighterFactory {
    @Override
    public Knight create() {
        return new SwordKnight( new CharacterSprite( 100, 200, "knight/png/Idle (1).png" ) );
    }
}
