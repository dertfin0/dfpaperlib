package ru.dfhub;

import com.destroystokyo.paper.event.server.PaperServerListPingEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.util.CachedServerIcon;

import java.io.File;
import java.util.List;
import java.util.UUID;

public class CustomMotd {

    private static Component motd = null;
    private static Integer maxPlayers = null;
    private static Integer onlinePlayers = null;
    private static List<String> customPlayerList = null;
    private static CachedServerIcon icon = null;

    /**
     * Установить новое описание сервера
     * @param motd Новое описание или {@code null} для сброса
     */
    public static void setMotd(Component motd) {
        CustomMotd.motd = motd;
    }

    /**
     * Установить максимальное количество игроков
     * @param maxPlayers Новое значение или {@code null} для сброса
     */
    public static void setMaxPlayers(int maxPlayers) {
        CustomMotd.maxPlayers = maxPlayers;
    }

    /**
     * Установить количество онлайн-игроков
     * @param onlinePlayers Новое значение или {@code null} для сброса
     */
    public static void setOnlinePlayers(int onlinePlayers) {
        CustomMotd.onlinePlayers = onlinePlayers;
    }

    /**
     * Изменить список игрков при наведении на описание сервера
     * @param customPlayerList Новый список или {@code null} для сброса
     */
    public static void setCustomPlayerList(List<String> customPlayerList) {
        CustomMotd.customPlayerList = customPlayerList;
    }

    /**
     * Изменить аватарку сервера
     * @param file PNG-файл с аватаркой сервера, разрешением не более 64x64 пикселя, или {@code null} для сброса
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
            if (motd != null) {
                e.motd(motd);
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
