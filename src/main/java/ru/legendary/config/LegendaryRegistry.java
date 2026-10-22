package ru.legendary.config;

import org.bukkit.Material;
import ru.legendary.item.Category;
import ru.legendary.item.LegendaryItem;

import java.util.*;

public class LegendaryRegistry {

    private final Map<String, LegendaryItem> byId = new LinkedHashMap<>();
    private final Map<Category, List<LegendaryItem» byCategory = new EnumMap<>(Category.class);

    public LegendaryRegistry() {
        for (Category c : Category.values()) {
            byCategory.put(c, new ArrayList<>());
        }
    }

    public void register(LegendaryItem item) {
        byId.put(item.id().toLowerCase(), item);
        byCategory.get(item.category()).add(item);
    }

    public LegendaryItem get(String id) {
        return byId.get(id.toLowerCase());
    }

    public List<LegendaryItem> getByCategory(Category category) {
        return byCategory.get(category);
    }

    public Collection<LegendaryItem> all() {
        return byId.values();
    }

    public static LegendaryRegistry defaults() {
        LegendaryRegistry reg = new LegendaryRegistry();

        reg.register(new LegendaryItem("katana_dragon", "Катана дракона",
                Material.NETHERITE_SWORD, Category.LEG, "legendary",
                List.of("Обычная легендарка", "Способность: рывок")));

        reg.register(new LegendaryItem("aiglos", "Айглос",
                Material.TRIDENT, Category.LEG, "legendary",
                List.of("Обычная легендарка", "Дальний бой")));

        reg.register(new LegendaryItem("smelting_pickaxe", "Плавильная кирка",
                Material.DIAMOND_PICKAXE, Category.MINILEG, "legendary",
                List.of("Маленькая вещь")));

        reg.register(new LegendaryItem("r_katana_dragon", "Катана дракона (Пробуждённая)",
                Material.NETHERITE_SWORD, Category.LEGR, "legendary_awakened",
                List.of("Пробуждённая легендарка", "Усиленная версия")));

        return reg;
    }
}
