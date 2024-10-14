package fr.heriamc.games.spleef.player;

import fr.heriamc.games.engine.player.GamePlayer;

import java.util.UUID;

public class SpleefPlayer extends GamePlayer<SpleefTeam> {

    private int lives;

    public SpleefPlayer(UUID uuid, int kills, int deaths, int lives, boolean spectator) {
        super(uuid, kills, deaths, spectator);
        this.lives = lives;
    }

    public void removeLive() {
        this.lives -= 1;
    }

}