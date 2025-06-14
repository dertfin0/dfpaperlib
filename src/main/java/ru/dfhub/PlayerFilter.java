package ru.dfhub;

import org.bukkit.entity.Player;

@FunctionalInterface
public interface PlayerFilter {
    boolean apply(Player player);
}
