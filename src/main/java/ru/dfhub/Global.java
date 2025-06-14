package ru.dfhub;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Класс для работы со всеми игроками в сети
 */
public class Global {

    /**
     * Выкинуть всех игроков с сервера
     * @param reason Причина
     */
    public static void kickAll(Component reason) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.kick(reason);
        }
    }

    /**
     * Выкинуть игроков, удовлетворяющих условию, с сервера
     * @param reason Причина
     * @param filter Boolean-фильтр, принимает в себя игрока
     */
    public static void kick(Component reason, PlayerFilter filter) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (filter.apply(player)) {
                player.kick(reason);
            }
        }
    }

    /**
     * Отправить всем игрокам в сети сообщение
     * @param message Сообщение
     */
    public static void broadcastAll(Component message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(message);
        }
    }

    /**
     * Отправляет сообщение всем игрокам, удовлетворяющим условию
     * @param message Сообщение
     * @param filter Boolean-фильтр, принимает в себя игрока
     */
    public static void broadcast(Component message, PlayerFilter filter) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (filter.apply(player)) {
                player.sendMessage(message);
            }
        }
    }

    /**
     * Отправляет сообщение всем игрокам, имеющим право
     * @param message Сообщение
     * @param permission Право на получение сообщения
     */
    public static void broadcast(Component message, String permission) {
        broadcast(message, player -> player.hasPermission(permission));
    }
}
