package com.jorepong.ecocraft.economy;

import com.jorepong.ecocraft.EcoCraft;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MoneyShowCommand implements CommandExecutor {
    private final EconomyManager economyManager;

    public MoneyShowCommand(EcoCraft plugin) {
        this.economyManager = plugin.getEconomyManager();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if(label.equals("돈")) {
            int money = economyManager.getMoney(player);
            player.sendMessage(money + "원");
        }
        return false;
    }
}
