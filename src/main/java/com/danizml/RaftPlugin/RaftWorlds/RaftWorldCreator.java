package com.danizml.RaftPlugin.RaftWorlds;

import com.danizml.RaftPlugin.RaftManagers.RaftWorldManager;

public class RaftWorldCreator {
    public static void createWorld(String name) {
        RaftWorldManager.RaftWorldDownload(name);
    }
}
