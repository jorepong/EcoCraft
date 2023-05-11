package com.jorepong.ecocraft.economy;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class EconomyManager {
    private HashMap<UUID, Integer> money = new HashMap<>();
    public int getMoney(Player player) {
        return money.getOrDefault(player.getUniqueId(), 0);
    }
}
