package ru.legendary.item;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public final class ItemBuilder {
    private ItemBuilder() {}

    public static ItemStack build(LegendaryItem item) {
        ItemStack stack = new ItemStack(item.material());
        ItemMeta meta = stack.getItemMeta();

        meta.displayName(Component.text(item.displayName())
                .color(NamedTextColor.GOLD)
                .decoration(TextDecoration.ITALIC, false));

        List<Component> lore = new ArrayList<>();
        for (String line : item.lore()) {
            lore.add(Component.text(line)
                    .color(NamedTextColor.GRAY)
                    .decoration(TextDecoration.ITALIC, false));
        }
        meta.lore(lore);

        NamespacedKey modelKey = NamespacedKey.fromString(item.itemModelKey());
        if (modelKey != null) {
            meta.setItemModel(modelKey);
        }

        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ATTRIBUTES);

        PersistentDataContainer pdc = meta.getPersistentDataContainer();
        pdc.set(PDCKeys.LEGENDARY_ID, PersistentDataType.STRING, item.id());
        pdc.set(PDCKeys.CATEGORY, PersistentDataType.STRING, item.category().name());

        stack.setItemMeta(meta);
        return stack;
    }

    public static String getLegendaryId(ItemStack stack) {
        if (stack == null || !stack.hasItemMeta()) return null;
        return stack.getItemMeta().getPersistentDataContainer()
                .get(PDCKeys.LEGENDARY_ID, PersistentDataType.STRING);
    }

    public static boolean isLegendary(ItemStack stack) {
        return getLegendaryId(stack) != null;
    }
}
