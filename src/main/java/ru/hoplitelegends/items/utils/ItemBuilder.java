package ru.hoplitelegends.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemBuilder {

    private final ItemStack item;
    private final ItemMeta meta;

    public ItemBuilder(Material material) {
        this.item = new ItemStack(material);
        this.meta = item.getItemMeta();
    }

    public ItemBuilder(Material material, int amount) {
        this.item = new ItemStack(material, amount);
        this.meta = item.getItemMeta();
    }

    public ItemBuilder name(String name) {
        meta.displayName(Component.text(name)
                .color(NamedTextColor.GOLD)
                .decoration(TextDecoration.ITALIC, false));
        return this;
    }

    public ItemBuilder name(Component name) {
        meta.displayName(name.decoration(TextDecoration.ITALIC, false));
        return this;
    }

    public ItemBuilder lore(String... lines) {
        List<Component> loreList = new ArrayList<>();
        for (String line : lines) {
            loreList.add(Component.text(line)
                    .color(NamedTextColor.GRAY)
                    .decoration(TextDecoration.ITALIC, false));
        }
        meta.lore(loreList);
        return this;
    }

    public ItemBuilder lore(List<String> lines) {
        List<Component> loreList = new ArrayList<>();
        for (String line : lines) {
            loreList.add(Component.text(line)
                    .color(NamedTextColor.GRAY)
                    .decoration(TextDecoration.ITALIC, false));
        }
        meta.lore(loreList);
        return this;
    }

    public ItemBuilder enchant(Enchantment enchantment, int level) {
        meta.addEnchant(enchantment, level, true);
        return this;
    }

    public ItemBuilder flags(ItemFlag... flags) {
        meta.addItemFlags(flags);
        return this;
    }

    public ItemBuilder unbreakable() {
        meta.setUnbreakable(true);
        return this;
    }

    public ItemBuilder glow() {
        meta.addEnchant(Enchantment.UNBREAKING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return this;
    }

    public ItemBuilder customModelData(int data) {
        meta.setCustomModelData(data);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }
}





