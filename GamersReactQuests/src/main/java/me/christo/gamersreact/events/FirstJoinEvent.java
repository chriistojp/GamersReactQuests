package me.christo.gamersreact.events;

import me.christo.gamersreact.Quests;
import me.christo.gamersreact.interfaces.ClassSelectionGUI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.File;
import java.io.IOException;

public class FirstJoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) throws IOException {



        File playerDataFolder = new File(Quests.getInstance().getDataFolder() + File.separator + "players");
        File file = new File(playerDataFolder.getAbsoluteFile() + File.separator + e.getPlayer().getUniqueId().toString() + ".yml");
        if (!playerDataFolder.exists()) {
            playerDataFolder.mkdirs();
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        ClassSelectionGUI.openSelectionGUI(e.getPlayer());

    }


}

