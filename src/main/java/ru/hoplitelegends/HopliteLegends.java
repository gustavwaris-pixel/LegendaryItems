package ru.hoplitelegends;

import org.bukkit.plugin.java.JavaPlugin;
import ru.hoplitelegends.commands.LegCommand;
import ru.hoplitelegends.commands.MiniLegCommand;
import ru.hoplitelegends.commands.LegrCommand;

public class HopliteLegends extends JavaPlugin {

    private static HopliteLegends instance;

    @id86240433 (@Override)
    public void onEnable() {
        instance = this;

        // Регистрация команд
        getCommand("leg").setExecutor(new LegCommand());
        getCommand("minileg").setExecutor(new MiniLegCommand());
        getCommand("legr").setExecutor(new LegrCommand());

        getLogger().info("§aHopliteLegends успешно запущен!");
        getLogger().info("§aЛегендарки загружены. Команды: /leg, /minileg, /legr");
    }

    @id86240433 (@Override)
    public void onDisable() {
        getLogger().info("§cHopliteLegends выключен.");
    }

    public static HopliteLegends getInstance() {
        return instance;
    }
}
