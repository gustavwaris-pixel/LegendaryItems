package ru.hoplitelegends.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import ru.hoplitelegends.utils.ItemBuilder;

import java.util.ArrayList;
import java.util.List;

public class LegendaryRegistry {

    /**
     * Возвращает список всех обычных легендарок (51 шт.)
     */
    public static List<ItemStack> getAll() {
        List<ItemStack> items = new ArrayList<>();

        // ===== ТВОИ 15 ЛЕГЕНДАРОК =====
        items.add(klinoBoga());
        items.add(klinoVizera());
        items.add(posohVizera());
        items.add(posohZhitelja());
        items.add(shhitAtlanta());
        items.add(lunoSolnechnyjMech());
        items.add(pauchijKlino());
        items.add(azartnyjMech());
        items.add(moroznyjMech());
        items.add(svetovojMech());
        items.add(magmovajaPushka());
        items.add(ledjanajaBulava());
        items.add(ognennajaBulava());
        items.add(ljogkajaBulava());
        items.add(klinoKoshki());

        // ===== АКТУАЛЬНЫЕ 2026 (9 шт.) =====
        items.add(katalizatorPlameniDrakona());
        items.add(vampirskajaSablja());
        items.add(skipetrArahny());
        items.add(okoStarzaVselenija());
        items.add(sakuraTessen());
        items.add(trezubecPosejdona());
        items.add(zvukovojArbalet());
        items.add(enderLuk());
        items.add(gruntilda());

        // ===== КЛАССИКА (21 шт.) =====
        items.add(boevajaKirkа());
        items.add(izumrudnyjKlinok());
        items.add(pchelinyjBlaster());
        items.add(posohGipnoza());
        items.add(dzheraldNjuhach());
        items.add(pushkaStrazha());
        items.add(garpunajaUstanovka());
        items.add(molotGolema());
        items.add(hronoMech());
        items.add(mechMIdasa());
        items.add(lukArtemidy());
        items.add(kosaZhnеса());
        items.add(mjolnir());
        items.add(drakonjaKatana());
        items.add(pushkaRibaFugu());
        items.add(magmovyjKlub());
        items.add(klinokTeni());
        items.add(ledjanojChakram());
        items.add(detonatorBronenostsa());
        items.add(bagrovyjTsepnojMech());
        items.add(lukOrlinogoGlaza());

        // ===== ДОПОЛНИТЕЛЬНЫЕ (6 шт., Джим убран) =====
        items.add(ekskalibur());
        items.add(oblachnyjMech());
        items.add(ajglos());
        items.add(fonarVardena());
        items.add(rogZimy());
        items.add(posohLicha());

        return items;
    }

    // ===== ТВОИ 15 ЛЕГЕНДАРОК =====

    private static ItemStack klinoBoga() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§6Клинок Бога")
                .lore("§7Самое сильное оружие", "§7Пассивка: §c+50% урона",
                      "§7ПКМ: §eСтолб света", "§7Shift+ПКМ: §eКара небес")
                .enchant(Enchantment.SHARPNESS, 10)
                .unbreakable().glow().build();
    }

    private static ItemStack klinoVizera() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§8Клинок Визера")
                .lore("§7Пассивка: §8Иссушение I", "§7ПКМ: §8Взрыв черепа")
                .enchant(Enchantment.SHARPNESS, 7)
                .unbreakable().glow().build();
    }

    private static ItemStack posohVizera() {
        return new ItemBuilder(Material.STICK)
                .name("§8Посох Визера")
                .lore("§7ПКМ: §8Армия тьмы", "§7Пассивка: §8Иммунитет к Иссушению")
                .unbreakable().glow().build();
    }

    private static ItemStack posohZhitelja() {
        return new ItemBuilder(Material.STICK)
                .name("§aПосох Жителя")
                .lore("§7ЛКМ: §aЗолотой луч (5❤)", "§7Пассивка: §a+10% опыта")
                .unbreakable().glow().build();
    }

    private static ItemStack shhitAtlanta() {
        return new ItemBuilder(Material.SHIELD)
                .name("§bЩит Атланта")
                .lore("§7ПКМ в блоке: §bВолна Атланта", "§7Пассивк


а: §b+20% к взрывам")
                .unbreakable().glow().build();
    }

    private static ItemStack lunoSolnechnyjMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§eЛуно-Солнечный Меч")
                .lore("§7Shift+ПКМ: §eСмена фаз", "§eСолнце: §c+30% днём, поджог",
                      "§bЛуна: §b+30% ночью, замедление")
                .enchant(Enchantment.SHARPNESS, 7)
                .unbreakable().glow().build();
    }

    private static ItemStack pauchijKlino() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§5Паучий Клинок")
                .lore("§7ЛКМ: §5Паучье гнездо", "§7Пассивка: §5Лазание по стенам")
                .enchant(Enchantment.SHARPNESS, 6)
                .unbreakable().glow().build();
    }

    private static ItemStack azartnyjMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§6Азартный Меч")
                .lore("§7ЛКМ: §6Рулетка легендарок (15 сек)", "§7КД: §660 сек")
                .enchant(Enchantment.SHARPNESS, 6)
                .unbreakable().glow().build();
    }

    private static ItemStack moroznyjMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§bМорозный Меч")
                .lore("§7Пассивка: §b35% заморозка в лёд", "§7Замедление II")
                .enchant(Enchantment.SHARPNESS, 7)
                .unbreakable().glow().build();
    }

    private static ItemStack svetovojMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§fСветовой Меч")
                .lore("§7ПКМ: §fВспышка", "§7Пассивка: §fДинамический свет")
                .enchant(Enchantment.SHARPNESS, 7)
                .unbreakable().glow().build();
    }

    private static ItemStack magmovajaPushka() {
        return new ItemBuilder(Material.DISPENSER)
                .name("§cМагмовая Пушка")
                .lore("§7ПКМ: §cОгненный шар", "§7Пассивка: §cИммунитет к огню")
                .unbreakable().glow().build();
    }

    private static ItemStack ledjanajaBulava() {
        return new ItemBuilder(Material.MACE)
                .name("§bЛедяная Булава")
                .lore("§7ПКМ: §bЛедяной порыв", "§7Порыв ветра III + Плотность IV")
                .enchant(Enchantment.WIND_BURST, 3)
                .unbreakable().glow().build();
    }

    private static ItemStack ognennajaBulava() {
        return new ItemBuilder(Material.MACE)
                .name("§cОгненная Булава")
                .lore("§7ПКМ: §cОгненный порыв", "§7Порыв ветра III + Плотность IV")
                .enchant(Enchantment.WIND_BURST, 3)
                .unbreakable().glow().build();
    }

    private static ItemStack ljogkajaBulava() {
        return new ItemBuilder(Material.MACE)
                .name("§fЛёгкая Булава")
                .lore("§7ЛКМ: §fДвойной прыжок (5 блоков)", "§7КД: §f40 сек")
                .enchant(Enchantment.WIND_BURST, 2)
                .unbreakable().glow().build();
    }

    private static ItemStack klinoKoshki() {
        return new ItemBuilder(Material.NETHERITE_SWORD)
                .name("§dКлинок Кошки")
                .lore("§7ПКМ: §dКошачья грация", "§7Пассивка: §dБесшумная ходьба")
                .enchant(Enchantment.SHARPNESS, 6)
                .unbreakable().glow().build();
    }

    // ===== АКТУАЛЬНЫЕ 2026 =====
    private static ItemStack katalizatorPlameniDrakona() {
        return new ItemBuilder(Material.BLAZE_ROD).name("§6Катализатор Пламени Дракона")
                .lore("§7Дыхание дракона + лечащие кристаллы").glow().build();
    }
    private static ItemStack vampirskajaSablja() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§4Вампирская Сабля")
                .lore("§7Вампиризм + летучая мышь").glow().build();
    }
    private static ItemStack skipetrArahny() {
        return new ItemBuilder(Material.STICK).name("§5Скипетр Арахны")
                .lore("§7Паутина +


призыв пауков").glow().build();
    }
    private static ItemStack okoStarzaVselenija() {
        return new ItemBuilder(Material.NETHERITE_HELMET).name("§5Око Старца Вселения")
                .lore("§7Контроль разума").glow().build();
    }
    private static ItemStack sakuraTessen() {
        return new ItemBuilder(Material.PAPER).name("§dСакура Тессен")
                .lore("§7Урон лепестками + отталкивание").glow().build();
    }
    private static ItemStack trezubecPosejdona() {
        return new ItemBuilder(Material.TRIDENT).name("§bТрезубец Посейдона")
                .lore("§7Риптайд + Дельфин").glow().build();
    }
    private static ItemStack zvukovojArbalet() {
        return new ItemBuilder(Material.CROSSBOW).name("§eЗвуковой Арбалет")
                .lore("§7Звуковые волны").glow().build();
    }
    private static ItemStack enderLuk() {
        return new ItemBuilder(Material.BOW).name("§5Эндер-Лук")
                .lore("§7Телепортация стрел").glow().build();
    }
    private static ItemStack gruntilda() {
        return new ItemBuilder(Material.STICK).name("§aГрунтильда")
                .lore("§7(уточнить)").glow().build();
    }

    // ===== КЛАССИКА =====
    private static ItemStack boevajaKirkа() {
        return new ItemBuilder(Material.NETHERITE_PICKAXE).name("§cБоевая Кирка")
                .lore("§7Взрывы при добыче").glow().build();
    }
    private static ItemStack izumrudnyjKlinok() {
        return new ItemBuilder(Material.EMERALD_SWORD).name("§aИзумрудный Клинок")
                .lore("§7Усиливается изумрудами").glow().build();
    }
    private static ItemStack pchelinyjBlaster() {
        return new ItemBuilder(Material.DISPENSER).name("§eПчелиный Бластер")
                .lore("§7Стреляет роем пчёл").glow().build();
    }
    private static ItemStack posohGipnoza() {
        return new ItemBuilder(Material.STICK).name("§dПосох Гипноза")
                .lore("§7Мобы становятся союзниками").glow().build();
    }
    private static ItemStack dzheraldNjuhach() {
        return new ItemBuilder(Material.SNIFFER_EGG).name("§2Джеральд Нюхач")
                .lore("§7Призывает нюхача с легендаркой").glow().build();
    }
    private static ItemStack pushkaStrazha() {
        return new ItemBuilder(Material.DISPENSER).name("§bПушка Стража")
                .lore("§7Стреляет лазером").glow().build();
    }
    private static ItemStack garpunajaUstanovka() {
        return new ItemBuilder(Material.CROSSBOW).name("§3Гарпунная Установка")
                .lore("§7Притягивает врагов").glow().build();
    }
    private static ItemStack molotGolema() {
        return new ItemBuilder(Material.MACE).name("§7Молот Голема")
                .lore("§7Мощный удар с воздуха").glow().build();
    }
    private static ItemStack hronoMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§eХроно-Меч")
                .lore("§7Откат во времени").glow().build();
    }
    private static ItemStack mechMIdasa() {
        return new ItemBuilder(Material.GOLDEN_SWORD).name("§6Меч Мидаса")
                .lore("§7Острота до XVI при убийствах").glow().build();
    }
    private static ItemStack lukArtemidy() {
        return new ItemBuilder(Material.BOW).name("§aЛук Артемиды")
                .lore("§7Мультивыстрел / самонаводка").glow().build();
    }
    private static ItemStack kosaZhnеса() {
        return new ItemBuilder(Material.NETHERITE_HOE).name("§4Коса Жнеца")
                .lore("§7Похищение здоровья").glow().build();
    }
    private static ItemStack mjolnir() {
        return new ItemBuilder(Material.MACE).name("§bМьёльнир")
                .lore("§7Молнии + возврат в руку").glow().build();
    }
    private static ItemStack drakonjaKatana() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§4Драконья Катана")
                .lore("§7Драконье дыхание").glow().build();
    }
    private static ItemStack pushkaRibaFugu() {
        return new ItemBuilder(Material.DISPE


NSER).name("§eПушка-Рыба Фугу")
                .lore("§7Стреляет рыбами фугу").glow().build();
    }
    private static ItemStack magmovyjKlub() {
        return new ItemBuilder(Material.MACE).name("§cМагмовый Клуб")
                .lore("§7Магмовый удар").glow().build();
    }
    private static ItemStack klinokTeni() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§8Клинок Тени")
                .lore("§7Невидимость / удар из тени").glow().build();
    }
    private static ItemStack ledjanojChakram() {
        return new ItemBuilder(Material.SNOWBALL).name("§bЛедяной Чакрам")
                .lore("§7Ледяной бумеранг").glow().build();
    }
    private static ItemStack detonatorBronenostsa() {
        return new ItemBuilder(Material.FIRE_CHARGE).name("§cДетонатор Броненосца")
                .lore("§7Взрывы").glow().build();
    }
    private static ItemStack bagrovyjTsepnojMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§4Багровый Цепной Меч")
                .lore("§7Кровотечение").glow().build();
    }
    private static ItemStack lukOrlinogoGlaza() {
        return new ItemBuilder(Material.BOW).name("§6Лук Орлиного Глаза")
                .lore("§7Прицельный выстрел").glow().build();
    }

    // ===== ДОПОЛНИТЕЛЬНЫЕ =====
    private static ItemStack ekskalibur() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§eЭкскалибур")
                .lore("§7ЛКМ: §eНеуязвимость 10 сек", "§7После 4 ударов снимается").glow().build();
    }
    private static ItemStack oblachnyjMech() {
        return new ItemBuilder(Material.NETHERITE_SWORD).name("§fОблачный Меч")
                .lore("§7ПКМ: §fСнежный след + подъём 5 сек").glow().build();
    }
    private static ItemStack ajglos() {
        return new ItemBuilder(Material.TRIDENT).name("§bАйглос")
                .lore("§7Древнее копьё", "§7ПКМ: §bМетание + взрыв", "§7Урон: §c8❤").glow().build();
    }
    private static ItemStack fonarVardena() {
        return new ItemBuilder(Material.SOUL_LANTERN).name("§3Фонарь Вардена")
                .lore("§7ПКМ: §3Превращение в Вардена (25 сек)", "§7КД: §390 сек").glow().build();
    }
    private static ItemStack rogZimy() {
        return new ItemBuilder(Material.GOAT_HORN).name("§bРог Зимы")
                .lore("§7ПКМ: §bЗимний рёв", "§7Замедление III + Слабость II").glow().build();
    }
    private static ItemStack posohLicha() {
        return new ItemBuilder(Material.STICK).name("§4Посох Лича")
                .lore("§7ПКМ: §4Похищение жизни", "§7Shift+ПКМ: §4Армия мёртвых").glow().build();
    }
}





