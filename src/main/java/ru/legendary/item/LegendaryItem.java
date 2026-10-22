package ru.legendary.item;

import org.bukkit.Material;
import java.util.List;

public record LegendaryItem(
        String id,
        String displayName,
        Material material,
        Category category,
        String modelNamespace,
        List<String> lore
) {
    public String itemModelKey() {
        return modelNamespace + ":" + id;
    }
}



