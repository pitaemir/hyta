package com.troubledev.ui;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.player.hud.CustomUIHud;
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.troubledev.components.PlayerRPGComponent;

public class RpgXPHud extends CustomUIHud {

    private static final int BAR_MAX_WIDTH = 290;

    public RpgXPHud(PlayerRef playerRef) {
        super(playerRef);
    }

    @Override
    protected void build(UICommandBuilder uiCommandBuilder) {
        uiCommandBuilder.append("RpgXPHud.ui");
    }

    public void refresh(PlayerRPGComponent rpg) {
        int current = (int) rpg.getCurrentLevelXP();
        int remaining = (int) rpg.getXPToNextLevel();
        int totalInLevel = rpg.isMaxLevel() ? current : current + remaining;

        int fillWidth = rpg.isMaxLevel()
                ? BAR_MAX_WIDTH
                : Math.max(0, Math.min(BAR_MAX_WIDTH, Math.round(BAR_MAX_WIDTH * rpg.getProgress())));

        UICommandBuilder ui = new UICommandBuilder();

        ui.set("#LevelLabel.TextSpans", Message.raw("LV " + rpg.getLevel()));
        ui.set("#XpText.TextSpans", Message.raw(current + " / " + totalInLevel + " XP"));

        // estes caminhos são os que eu testaria primeiro na sua versão:
        ui.set("#XpBarFill.Anchor.Width", fillWidth);
        ui.set("#XpBarHighlight.Anchor.Width", fillWidth);

        update(false, ui);
    }
}