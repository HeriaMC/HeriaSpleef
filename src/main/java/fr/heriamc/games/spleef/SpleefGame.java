package fr.heriamc.games.spleef;

import fr.heriamc.games.engine.Game;
import fr.heriamc.games.engine.team.GameTeamColor;
import fr.heriamc.games.engine.utils.GameSizeTemplate;
import fr.heriamc.games.spleef.player.SpleefPlayer;
import fr.heriamc.games.spleef.setting.SpleefSettings;
import fr.heriamc.games.spleef.player.SpleefTeam;

import java.util.UUID;

public class SpleefGame extends Game<SpleefPlayer, SpleefTeam, SpleefSettings> {

    public SpleefGame() {
        super("Spleef", new SpleefSettings(GameSizeTemplate.SIZE_5V5.toGameSize()));
    }

    @Override
    public SpleefTeam defaultGameTeam(int i, GameTeamColor gameTeamColor) {
        return null;
    }

    @Override
    public SpleefPlayer defaultGamePlayer(UUID uuid, boolean b) {
        return null;
    }

    @Override
    public void load() {

    }
}