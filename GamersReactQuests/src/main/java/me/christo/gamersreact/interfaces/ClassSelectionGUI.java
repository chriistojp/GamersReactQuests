package me.christo.gamersreact.interfaces;

import me.christo.handler.handler.Gui;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.concurrent.ThreadLocalRandom;

public class ClassSelectionGUI {

    //adventurer
    //hunter
    //farmer
    //chemist

    public static void openSelectionGUI(Player p) {

        Gui gui = new Gui("Choose your class!", 45);

        gui.i(10, Material.VINE, "&a&lAdventurer", "", "&7Perfect for players looking to explore", "&7the world" +
                ", conquer new places, and", "&7discover new lands.");
        gui.i(12, Material.DIAMOND_SWORD, "&b&lHunter", "", "&7Ideal for those who are searching for a fight, and", "&7" +
                "enjoy fighting difficult battles. Many challenges", "&7lie ahead.");
        gui.i(14, Material.GOLDEN_HOE, "&e&lFarmer", "", "&7This class targets players who seek a laid back lifestyle.", "&7Staying at home and building farms",
                "&7is something most players in this class do.");
        gui.i(16, Material.POTION, "&d&lChemist", "", "&7Finding the formula for the strongest potions is what", "" +
                "&7chemists are known for. Able to defeat almost anything.");

        gui.i(31, Material.PLAYER_HEAD, "&c&lClasses", "", "&7Classes are player specific and grant certain abilities.",
                "&7These can be levelled up for higher tier abilities, and you",
                "&7should choose your class based off of your",
                "&7preferred play style.");

        for(int i = 0; i < 45; i++) {

            int random = ThreadLocalRandom.current().nextInt(0, 2);
            if(i == 10) {
                continue;
            }
            if(i == 12) {
                continue;
            }
            if(i == 14) {
                continue;
            }
            if(i == 16) {
                continue;
            }
            if(i == 31) {
                continue;
            }
            if(random == 0) {
                gui.i(i, Material.RED_STAINED_GLASS_PANE, " ");
            } else {
                gui.i(i, Material.WHITE_STAINED_GLASS_PANE, " ");
            }

        }

        gui.onClick(e -> {
            e.setCancelled(true);
        });

        gui.show(p);

    }


}
