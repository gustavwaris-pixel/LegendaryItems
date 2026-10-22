package ru.hoplitelegends.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import ru.hoplitelegends.utils.ItemBuilder;

import java.util.ArrayList;
import java.util.List;

public class AwakenedRegistry {

    /**
     * Возвращает список всех пробуждённых легендарок (10 шт.)
     */
    public static List<ItemStack> getAll() {
        List<ItemStack> items = new ArrayList<>();

        items.add(probuzhdennajaKatanaDrakona());
        items.add(probuzhdennyjMoroznyjMech());
        items.add(probuzhdennyjPosohZhitelya());
        items.add(probuzhdennyjKlinokBoga());
        items.add(probuzhdennyjKlinokKoshki());
        items.add(probuzhdennyjTrezubecPosejdona());
        items.add(probuzhdennyjHronoMech());
        items.add(probuzhdennyjMechMidasa());
        items.add(probuzhdennyjAjglos());
        items.add(probuzhdennyjKlinokTeni());

        return items;
    }

    private static ItemStack probuzhdennajaKatanaDrakona() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§4§lПробуждённая Катана Дракона")
                .lore("§7+30% урона, поджог при ударе",
                      "§7ПКМ: §cДраконье дыхание",
                      "§7Shift+ПКМ: §cКрылья дракона")
                .enchant(Enchantment.SHARPNESS, 10)
                .enchant(Enchantment.FIRE_ASPECT, 3)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjMoroznyjMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§b§lПробуждённый Морозный Меч")
                .lore("§7+30% урона, 50% заморозка",
                      "§7ПКМ: §bЛедяная тюрьма",
                      "§7Shift+ПКМ: §bАбсолютный ноль")
                .enchant(Enchantment.SHARPNESS, 10)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjPosohZhitelya() {
        return new ItemBuilder(Material.STICK)
                .name("§a§lПробуждённый Посох Жителя")
                .lore("§7+30% урона, +20% опыта",
                      "§7ПКМ: §aЗолотой шторм",
                      "§7Shift+ПКМ: §aБлагословение торговца")
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjKlinokBoga() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§6§lПробуждённый Клинок Бога")
                .lore("§7+60% урона, иммунитет к иссушению",
                      "§7ПКМ: §eБожественный суд",
                      "§7Shift+ПКМ: §eКара небес",
                      "§7ЛКМ+Shift: §eБожественный щит")
                .enchant(Enchantment.SHARPNESS, 15)
                .enchant(Enchantment.UNBREAKING, 5)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjKlinokKoshki() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§d§lПробуждённый Клинок Кошки")
                .lore("§7+30% урона, +20% скорости",
                      "§7ПКМ: §dТень кошки",
                      "§7Shift+ПКМ: §dКошачья стая")
                .enchant(Enchantment.SHARPNESS, 10)
                .enchant(Enchantment.FEATHER_FALLING, 2)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjTrezubecPosejdona() {
        return new ItemBuilder(Material.TRIDENT)
                .name("§3§lПробуждённый Трезубец Посейдона")
                .lore("§7+30% урона, Риптайд + Дельфин",
                      "§7ПКМ: §3Волна цунами",
                      "§7Shift+ПКМ: §3Гнев моря")
                .enchant(Enchantment.LOYALTY, 3)
                .enchant(Enchantment.CHANNELING, 1)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjHronoMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§e§lПробуждённый Хроно-Меч")
                .lore("§7+30% урона, +10% скорости атаки",


"§7ПКМ: §eОткат",
                      "§7Shift+ПКМ: §eЗамедление времени")
                .enchant(Enchantment.SHARPNESS, 10)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjMechMidasa() {
        return new ItemBuilder(Material.GOLDEN_SWORD)
                .name("§6§lПробуждённый Меч Мидаса")
                .lore("§7+30% урона, Острота до XX",
                      "§7ПКМ: §6Золотая волна",
                      "§7Shift+ПКМ: §6Прикосновение Мидаса")
                .enchant(Enchantment.SHARPNESS, 10)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjAjglos() {
        return new ItemBuilder(Material.TRIDENT)
                .name("§b§lПробуждённый Айглос")
                .lore("§7+30% урона, +10% к взрыву",
                      "§7ПКМ: §bМетание",
                      "§7Shift+ПКМ: §bДревний зов")
                .enchant(Enchantment.LOYALTY, 3)
                .unbreakable().glow().build();
    }

    private static ItemStack probuzhdennyjKlinokTeni() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§8§lПробуждённый Клинок Тени")
                .lore("§7+30% урона, крит из невидимости ×2",
                      "§7ПКМ: §8Тень",
                      "§7Shift+ПКМ: §8Теневой клон")
                .enchant(Enchantment.SHARPNESS, 10)
                .unbreakable().glow().build();
    }
}





