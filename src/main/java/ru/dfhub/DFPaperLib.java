package ru.dfhub;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class DFPaperLib {

    protected static JavaPlugin PLUGIN;

    public static void init(JavaPlugin plugin) {
        PLUGIN = plugin;

        List.of(
                Vanish.Handler.INSTANCE = new Vanish.Handler()
        ).forEach(handler -> plugin.getServer().getPluginManager().registerEvents(handler, plugin));

        System.out.println("dfpaperlib enabled!");
    }
}
