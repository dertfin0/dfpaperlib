package ru.dfhub;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.persistence.PersistentDataType;

/**
 * Basic functionality for vanishing players
 */
public class Vanish {

    /**
     * Vanish player to all players
     * @param player Player to vanish
     */
    public static void vanish(Player player) {
        InitializationException.check();
        player.getPersistentDataContainer().set(getKey(), PersistentDataType.BOOLEAN, true);

        for (Player p : Bukkit.getOnlinePlayers()) {
            p.hidePlayer(DFPaperLib.PLUGIN, player);
        }
    }

    /**
     * Vanish player to players that pass the filter
     * @param player Player to vanish
     * @param filter Filter (check README.md)
     */
    public static void vanish(Player player, PlayerFilter filter) {
        InitializationException.check();
        player.getPersistentDataContainer().set(getKey(), PersistentDataType.BOOLEAN, true);
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (filter.apply(p)) {
                p.hidePlayer(DFPaperLib.PLUGIN, player);
            }
        }
    }

    /**
     * Unvanish player
     * @param player Player
     */
    public static void unvanish(Player player) {
        InitializationException.check();
        player.getPersistentDataContainer().remove(getKey());
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.showPlayer(DFPaperLib.PLUGIN, player);
        }
    }

    /**
     * Check if player is vanished
     * @param player Player
     * @return Is player vanished
     */
    public static boolean isVanished(Player player) {
        InitializationException.check();
        return player.getPersistentDataContainer().has(getKey());
    }

    /**
     * Get namespaced key containing vanish status
     * @return Namespaced key
     */
    private static NamespacedKey getKey() {
        InitializationException.check();
        return new NamespacedKey(DFPaperLib.PLUGIN, "dfpaperlib.vanish");
    }

    /**
     * Additional vanish features
     */
    public static class Handler implements Listener {

        protected static Handler INSTANCE;

        /**
         * Remove some vanish features, like saving vanish on rejoin and restarts and hide join/quit messages
         */
        public static void unregister() {
            HandlerList.unregisterAll(INSTANCE);
        }

        @EventHandler
        public void onJoin(PlayerJoinEvent e) {
            Player player = e.getPlayer();
            if (isVanished(player)) {
                vanish(player);
                e.joinMessage(null);
            }
        }

        @EventHandler
        public void onQuit(PlayerQuitEvent e) {
            Player player = e.getPlayer();
            if (isVanished(player)) {
                e.quitMessage(null);
            }
        }

        @EventHandler
        public void onEntityTarget(EntityTargetEvent e) {
            if (!(e.getTarget() instanceof Player player)) return;
            if (isVanished(player)) {
                e.setCancelled(true);
            }
        }

        @EventHandler
        public void onPlayerInteract(PlayerInteractEntityEvent e) {
            if (!(e.getRightClicked() instanceof Player player)) return;
            if (isVanished(player)) {
                e.setCancelled(true);
            }
        }
    }
}
