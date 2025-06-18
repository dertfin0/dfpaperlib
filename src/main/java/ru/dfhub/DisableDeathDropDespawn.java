package ru.dfhub;

import io.papermc.paper.event.player.PlayerPickItemEvent;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerAttemptPickupItemEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class DisableDeathDropDespawn {

    public static void enable() {
        DFPaperLib.PLUGIN.getServer().getPluginManager().registerEvents(
                Handler.INSTANCE = new Handler(), DFPaperLib.PLUGIN
        );
    }

    public static void disable() {
        HandlerList.unregisterAll(Handler.INSTANCE);
    }

    public static class Handler implements Listener {

        protected static Listener INSTANCE;

        @EventHandler
        public void onItemDespawn(ItemDespawnEvent e) {
            if (e.getEntity().getItemStack().getItemMeta().getPersistentDataContainer().has(getKey())) e.setCancelled(true);
        }

        @EventHandler
        public void onPlayerDied(PlayerDeathEvent e) {
            for (int i = 0; i < e.getDrops().size(); i++) {
                ItemMeta meta = e.getDrops().get(i).getItemMeta();
                meta.getPersistentDataContainer().set(getKey(), PersistentDataType.BOOLEAN, true);
                e.getDrops().get(i).setItemMeta(meta);
            }
        }

        @EventHandler
        public void onItemPickup(EntityPickupItemEvent e) {
            if (e.getItem().getItemStack().getItemMeta().getPersistentDataContainer().has(getKey())) {
                ItemMeta meta = e.getItem().getItemStack().getItemMeta();
                meta.getPersistentDataContainer().remove(getKey());
                e.getItem().getItemStack().setItemMeta(meta);
            }
        }

        private static NamespacedKey getKey() {
            InitializationException.check();
            return new NamespacedKey(DFPaperLib.PLUGIN, "dfpaperlib.deathdrop");
        }
    }
}
