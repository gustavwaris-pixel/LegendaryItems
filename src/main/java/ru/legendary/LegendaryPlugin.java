package ru.legendary;

import org.bukkit.plugin.java.JavaPlugin;
import ru.legendary.config.LegendaryRegistry;
import ru.legendary.item.PDCKeys;

public final class LegendaryPlugin extends JavaPlugin {

    private LegendaryRegistry registry;

    @id86240433 (@Override)
    public void onEnable() {
        PDCKeys.init(this);
        registry = LegendaryRegistry.defaults();

        getLogger().info("LegendaryItems включён. Предметов: " + registry.all().size());
    }

    @id86240433 (@Override)
    public void onDisable() {
        getLogger().info("LegendaryItems выключен.");
    }

    public LegendaryRegistry getRegistry() {
        return registry;
    }
}
