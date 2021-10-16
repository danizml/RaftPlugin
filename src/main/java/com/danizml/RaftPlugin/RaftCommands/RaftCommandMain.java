package com.danizml.RaftPlugin.RaftCommands;

import com.danizml.RaftPlugin.RaftPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class RaftCommandMain implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("RaftPlugin.reload")) {
                    RaftPlugin.plugin.reloadConfig();
                    sender.sendMessage(ChatColor.GREEN + "Config Reloaded");
                }
            }
        }return true;
    }
}