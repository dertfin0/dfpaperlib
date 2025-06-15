package ru.dfhub;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Performing an action on all online players
 */
public class Global {

    /**
     * Kick all players
     * @param reason Reason
     */
    public static void kickAll(Component reason) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.kick(reason);
        }
    }

    /**
     * Kick players that pass the filter from the server
     * @param reason Reason
     * @param filter Filter (check README.md)
     */
    public static void kick(Component reason, PlayerFilter filter) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (filter.apply(player)) {
                player.kick(reason);
            }
        }
    }

    /**
     * Broadcast message to all players
     * @param message Message
     */
    public static void broadcastAll(Component message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(message);
        }
    }

    /**
     * Send message to players that pass the filter
     * @param message Message
     * @param filter Filter (check README.md)
     */
    public static void broadcast(Component message, PlayerFilter filter) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (filter.apply(player)) {
                player.sendMessage(message);
            }
        }
    }

    /**
     * Send message to players that have permission
     * @param message Message
     * @param permission Permission
     */
    public static void broadcast(Component message, String permission) {
        broadcast(message, player -> player.hasPermission(permission));
    }
}
