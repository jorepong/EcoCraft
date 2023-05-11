package com.jorepong.ecocraft;

import com.jorepong.ecocraft.economy.EconomyManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class EcoCraft extends JavaPlugin {

    private EconomyManager mm;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("money").setExecutor(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(args.length == 0) {
            player.sendMessage("test");
        }
        return super.onCommand(sender, command, label, args);
    }

    public EconomyManager getEconomyManager() {
        return mm;
    }
}
