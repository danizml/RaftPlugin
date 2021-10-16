package com.danizml.RaftPlugin;

import com.danizml.RaftPlugin.RaftWorlds.RaftWorldStart;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.util.Objects;

public class RaftPlugin extends JavaPlugin {
    public static RaftPlugin plugin;
    public String rutaConfig;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + ("+----------------------------+"));
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + ("  RaftPlugin has been disable   "));
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + ("  version " + getDescription().getVersion()));
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_GREEN + ("+-------------------------+"));
        Objects.requireNonNull(getCommand("raftworld")).setExecutor(new RaftWorldStart());
        registerConfig();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + ("The RaftPlugin has been disable "));
    }

    public void registerConfig() {
        File config = new File(this.getDataFolder(), "config.yml");
        rutaConfig = config.getPath();
        if (!config.exists()) {
            this.getConfig().options().copyDefaults(true);
            saveConfig();
        }
    }

}
