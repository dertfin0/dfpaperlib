package ru.dfhub;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.util.CachedServerIcon;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Server MOTD change: description, icon, player list, etc.
 */
public class CustomMotd {

    private static List<Component> motds = null;
    private static Integer maxPlayers = null;
    private static Integer onlinePlayers = null;
    private static List<String> customPlayerList = null;
    private static CachedServerIcon icon = null;

    /**
     * Set new server description
     * @param motd New description or {@code null} to reset
     */
    public static void setMotd(Component motd) {
        CustomMotd.motds = List.of(motd);
    }

    /**
     * Set new server descriptions. Randomly selected with server list ping
     * @param motds List of descriptions or {@code null} to reset
     */
    public static void setMotds(List<Component> motds) {
        CustomMotd.motds = motds;
    }

    /**
     * Set new server descriptions. Randomly selected with server list ping
     * @param motds List of descriptions or {@code null} to reset
     */
    public static void setMotds(Component... motds) {
        CustomMotd.motds = List.of(motds);
    }

    /**
     * Set max-players only in server list
     * @param maxPlayers New value or {@code null} to reset
     */
    public static void setMaxPlayers(int maxPlayers) {
        CustomMotd.maxPlayers = maxPlayers;
    }

    /**
     * Set online-players value (only in server list)
     * @param onlinePlayers New value or {@code null} to reset
     */
    public static void setOnlinePlayers(int onlinePlayers) {
        CustomMotd.onlinePlayers = onlinePlayers;
    }

    /**
     * Change online player list / set custom text instead
     * @param customPlayerList String row list or {@code null} to reset
     */
    public static void setCustomPlayerList(List<String> customPlayerList) {
        CustomMotd.customPlayerList = customPlayerList;
    }

    /**
     * Change server icon
     * @param file PNG-file, max resolution - 64x64px, or {@code null} to reset
     */
    public static void setServerIcon(File file) {
        if (file == null) {
            icon = null;
            return;
        }
        try {
            icon = Bukkit.loadServerIcon(file);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static class Handler implements Listener {

        @EventHandler
        public void onServerListPing(PaperServerListPingEvent e) {
            if (motds != null) {
                int index = Math.round(new Random().nextFloat() * motds.size());
                if (index >= motds.size()) { index = 0; }
                e.motd(motds.get(index));
            }
            if (maxPlayers != null) {
                e.setMaxPlayers(maxPlayers);
            }
            if (onlinePlayers != null) {
                e.setNumPlayers(onlinePlayers);
            }
            if (customPlayerList != null) {
                List<PaperServerListPingEvent.ListedPlayerInfo> players = e.getListedPlayers();
                players.clear();
                for (String name : customPlayerList) {
                    players.add(new PaperServerListPingEvent.ListedPlayerInfo(name, UUID.randomUUID()));
                }
            }
            if (icon != null) {
                e.setServerIcon(icon);
            }
        }
    }
}
