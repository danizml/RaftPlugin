package com.danizml.RaftPlugin.RaftManagers;


import com.danizml.RaftPlugin.RaftPlugin;
import com.danizml.RaftPlugin.RaftUtils.RaftUnzipUtility;

import java.io.IOException;
import java.nio.file.Paths;

public class RaftWorldManager {

    public static void RaftWorldRandomizer(String name) {
        if (RaftPlugin.plugin.getConfig().getInt("Randomizer") == 1) {
            try {
                FolderManager.createFolder(Paths.get(RaftPlugin.plugin.getDataFolder().getPath()), "worlds");
                RaftDownloadManager.downloadUsingNIO("https://files.tonimatasmc.com/index.php/s/vi1TNmvuvcjrNBn/download", Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
                RaftDownloadManager.downloadUsingStream("https://files.tonimatasmc.com/index.php/s/vi1TNmvuvcjrNBn/download", Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
            } catch (IOException e) {
                e.printStackTrace();
            }

            RaftUnzipUtility unzipper = new RaftUnzipUtility();
            try {
                unzipper.unzip(Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name, Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            RaftPlugin.plugin.getConfig().set("Randomizer", 2);
        }

        if (RaftPlugin.plugin.getConfig().getInt("Randomizer") == 2) {
            try {
                FolderManager.createFolder(Paths.get(RaftPlugin.plugin.getDataFolder().getPath()), "worlds");
                RaftDownloadManager.downloadUsingNIO("https://files.tonimatasmc.com/index.php/s/qCPNYLXin2786V1/download", Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
                RaftDownloadManager.downloadUsingStream("https://files.tonimatasmc.com/index.php/s/qCPNYLXin2786V1/download", Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
            } catch (IOException e) {
                e.printStackTrace();
            }

            RaftUnzipUtility unzipper = new RaftUnzipUtility();
            try {
                unzipper.unzip(Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name, Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            RaftPlugin.plugin.getConfig().set("Randomizer", 3);
        }

        if (RaftPlugin.plugin.getConfig().getInt("Randomizer") == 3) {
            try {
                FolderManager.createFolder(Paths.get(RaftPlugin.plugin.getDataFolder().getPath()), "worlds");
                RaftDownloadManager.downloadUsingNIO("https://files.tonimatasmc.com/index.php/s/kIocyB8XbtVxIy1/download", Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
                RaftDownloadManager.downloadUsingStream("https://files.tonimatasmc.com/index.php/s/kIocyB8XbtVxIy1/download", Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
            } catch (IOException e) {
                e.printStackTrace();
            }

            RaftUnzipUtility unzipper = new RaftUnzipUtility();
            try {
                unzipper.unzip(Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name, Paths.get(RaftPlugin.plugin.getDataFolder().getPath()) + "/worlds" + "/" + name);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            RaftPlugin.plugin.getConfig().set("Randomizer", 1);
        }
    }

    public static void RaftWorldDownload(String randomizer) {
        RaftWorldRandomizer(randomizer);
    }
}
