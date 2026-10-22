package ru.legendary.item;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;

public final class PDCKeys {
    private PDCKeys() {}

    public static NamespacedKey LEGENDARY_ID;
    public static NamespacedKey CATEGORY;
    public static NamespacedKey COOLDOWN;

    public static void init(Plugin plugin) {
        LEGENDARY_ID = new NamespacedKey(plugin, "legendary_id");
        CATEGORY = new NamespacedKey(plugin, "category");
        COOLDOWN = new NamespacedKey(plugin, "cooldown");
    }
}
