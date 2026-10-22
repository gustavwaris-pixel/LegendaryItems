package ru.hoplitelegends.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.hoplitelegends.items.MiniItemRegistry;

import java.util.List;

public class MiniLegCommand implements CommandExecutor {

    @id86240433 (@Override)
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("§cЭта команда только для игроков!");
            return true;
        }

        if (!player.isOp()) {
            player.sendMessage("§cУ тебя нет прав на эту команду!");
            return true;
        }

        List<ItemStack> items = MiniItemRegistry.getAll();

        for (ItemStack item : items) {
            player.getInventory().addItem(item);
        }

        player.sendMessage("§aВыдано §e" + items.size() + " §aмаленьких вещей!");
        return true;
    }
}
