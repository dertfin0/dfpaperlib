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

public class Vanish {

    public static void vanish(Player player) {
        InitializationException.check();
        player.getPersistentDataContainer().set(getKey(), PersistentDataType.BOOLEAN, true);

        for (Player p : Bukkit.getOnlinePlayers()) {
            p.hidePlayer(DFPaperLib.PLUGIN, player);
        }
    }

    public static void vanish(Player player, PlayerFilter filter) {
        InitializationException.check();
        player.getPersistentDataContainer().set(getKey(), PersistentDataType.BOOLEAN, true);
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (filter.apply(p)) {
                p.hidePlayer(DFPaperLib.PLUGIN, player);
            }
        }
    }

    public static void unvanish(Player player) {
        InitializationException.check();
        player.getPersistentDataContainer().remove(getKey());
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.showPlayer(DFPaperLib.PLUGIN, player);
        }
    }

    public static boolean isVanished(Player player) {
        InitializationException.check();
        return player.getPersistentDataContainer().has(getKey());
    }

    private static NamespacedKey getKey() {
        InitializationException.check();
        return new NamespacedKey(DFPaperLib.PLUGIN, "dfpaperlib.vanish");
    }

    public static class Handler implements Listener {

        protected static Handler INSTANCE;

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
