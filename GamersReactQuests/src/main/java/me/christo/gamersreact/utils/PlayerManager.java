package me.christo.gamersreact.utils;

import me.christo.gamersreact.Quests;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class PlayerManager {

    public static FileConfiguration getPlayerFile(Player p) {



        File playerDataFolder = new File(Quests.getInstance().getDataFolder() + File.separator + "players");
        File file = new File(playerDataFolder.getAbsoluteFile() + File.separator + p.getUniqueId().toString() + ".yml");
        FileConfiguration f = YamlConfiguration.loadConfiguration(file);

        return f;

    }

}
