package ru.dfhub;

import org.bukkit.Material;

public class MaterialUtil {

    public Material get(String name) {
        return Material.getMaterial(name.toUpperCase().replace(" ", "_"));
    }
}
