package ru.dfhub;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class DFPaperLib {

    protected static JavaPlugin PLUGIN;

    /**
     * Register required events and set plugin
     * @param plugin Main plugin
     */
    public static void init(JavaPlugin plugin) {
        PLUGIN = plugin;
        List.of(
                Vanish.Handler.INSTANCE = new Vanish.Handler(),
                new CustomMotd.Handler()
        ).forEach(handler -> plugin.getServer().getPluginManager().registerEvents(handler, plugin));
    }
}
