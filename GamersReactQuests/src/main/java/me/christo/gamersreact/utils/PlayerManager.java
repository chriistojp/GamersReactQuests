package me.christo.gamersreact.utils;

import me.christo.gamersreact.Quests;
import me.christo.gamersreact.classes.ClassTypes;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class PlayerManager {

    private Player player;
    private File playerData;
    private FileConfiguration config;

    public PlayerManager(Player p) {

        this.player = p;

    }


    public void setClass(ClassTypes type) {
        getPlayerFile().set("class", type.toString());
        save();
    }

    public FileConfiguration getPlayerFile() {
        File playerDataFolder = new File(Quests.getInstance().getDataFolder() + File.separator + "players");
        playerData = new File(playerDataFolder.getAbsoluteFile() + File.separator + player.getUniqueId().toString() + ".yml");
        config = YamlConfiguration.loadConfiguration(playerData);
        return config;
    }
    public void save() {
        try {
            this.config.save(this.playerData);
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

}
