package com.danizml.RaftPlugin.RaftWorlds;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RaftWorldStart implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("raftworld")) {
            if (args[0].equalsIgnoreCase("create")) {
                if (sender.hasPermission("raft.world.create")) {
                    Player player = (Player) sender;
                    RaftWorldCreator.createWorld(player.getName());
                    Location location = new Location(Bukkit.getWorld(player.getName()), 1, 63, 1);
                    player.teleport(location);
                }
            }
        }return true;
    }
}
