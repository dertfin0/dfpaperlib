package ru.dfhub;

import org.bukkit.Material;

/**
 * Simplifications in the use of materials
 */
public class MaterialUtil {

    /**
     * Get material by name, allowing any case and spaces
     * @param name Material name
     * @return Material
     */
    public Material get(String name) {
        return Material.getMaterial(name.toUpperCase().replace(" ", "_"));
    }
}
