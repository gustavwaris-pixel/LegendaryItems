package ru.hoplitelegends.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import ru.hoplitelegends.utils.ItemBuilder;

import java.util.ArrayList;
import java.util.List;

public class MiniItemRegistry {

    /**
     * Возвращает список всех маленьких вещей (3 шт.)
     */
    public static List<ItemStack> getAll() {
        List<ItemStack> items = new ArrayList<>();

        items.add(plavilnajaKirkа());
        items.add(airDrop());
        items.add(knigaRetseptov());

        return items;
    }

    private static ItemStack plavilnajaKirkа() {
        return new ItemBuilder(Material.NETHERITE_PICKAXE)
                .name("§6Плавильная Кирка")
                .lore("§7Автоматически переплавляет добычу",
                      "§7(железо → слиток, золото → слиток и т.д.)")
                .unbreakable().glow().build();
    }

    private static ItemStack airDrop() {
        return new ItemBuilder(Material.CHEST)
                .name("§eАир Дроп")
                .lore("§7ПКМ: вызывает аир дроп",
                      "§7Сундук с лутом падает с неба")
                .glow().build();
    }

    private static ItemStack knigaRetseptov() {
        return new ItemBuilder(Material.BOOK)
                .name("§bКнига Рецептов")
                .lore("§7ПКМ: открывает GUI со всеми крафтами",
                      "§7(справочник легендарок)")
                .glow().build();
    }
}
