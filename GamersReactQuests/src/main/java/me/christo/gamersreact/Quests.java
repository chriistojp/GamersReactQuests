package me.christo.gamersreact;

import me.christo.gamersreact.events.FirstJoinEvent;
import me.christo.handler.handler.Gui;
import org.bukkit.plugin.java.JavaPlugin;


public final class Quests extends JavaPlugin {


    public static Quests instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        this.getServer().getPluginManager().registerEvents(new FirstJoinEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Quests getInstance() {
        return instance;
    }
}
