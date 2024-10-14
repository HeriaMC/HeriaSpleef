package fr.heriamc.games.spleef;

import fr.heriamc.games.api.addon.GameAddon;
import fr.heriamc.games.spleef.pool.SpleefPool;

public class SpleefAddon extends GameAddon<SpleefPool> {

    public SpleefAddon() {
        super(new SpleefPool());
    }

    @Override
    public void enable() {
        pool.loadDefaultGames();
    }

    @Override
    public void disable() {

    }

}