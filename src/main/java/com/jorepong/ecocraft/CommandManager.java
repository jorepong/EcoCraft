package com.jorepong.ecocraft;

import com.jorepong.ecocraft.economy.MoneyCommandHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager {
    private EcoCraft plugin;

    public CommandManager(EcoCraft plugin) {
        this.plugin = plugin;
    }

    public void registerCommands() {
        plugin.getCommand("money").setExecutor(new MoneyCommandHandler(plugin));
    }
}
