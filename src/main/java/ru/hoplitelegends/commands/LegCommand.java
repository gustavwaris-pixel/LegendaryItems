package ru.hoplitelegends.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.hoplitelegends.items.LegendaryRegistry;

import java.util.List;

public class LegCommand implements CommandExecutor {

    @id86240433 (@Override)
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Проверка: только игрок
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§cЭта команда только для игроков!");
            return true;
        }

        // Проверка: только OP
        if (!player.isOp()) {
            player.sendMessage("§cУ тебя нет прав на эту команду!");
            return true;
        }

        // Получаем все легендарки
        List<ItemStack> items = LegendaryRegistry.getAll();

        // Выдаём в инвентарь
        for (ItemStack item : items) {
            player.getInventory().addItem(item);
        }

        player.sendMessage("§aВыдано §e" + items.size() + " §aобычных легендарок!");
        return true;
    }
}
