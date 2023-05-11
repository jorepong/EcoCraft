package com.jorepong.ecocraft.economy;

import com.jorepong.ecocraft.EcoCraft;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.HashMap;
import java.util.UUID;

public class MoneyCommandHandler implements CommandExecutor {
    private EcoCraft plugin;
    private MoneyShowCommand moneyShowCommand;

    public MoneyCommandHandler(EcoCraft plugin) {
        moneyShowCommand = new MoneyShowCommand(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0) {
            return moneyShowCommand.onCommand(sender, command, label, args);
        }
        return false;
    }
}
