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
        UICommandBuilder ui = new UICommandBuilder();
        ui.set("#LevelLabel.TextSpans", Message.raw("Level " + rpg.getLevel()));
        update(false, ui);
    }
}