package com.danizml.RaftPlugin.RaftManagers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderManager {
    public static void createFolder(Path directory, String folderName) {
        try {
            Files.createDirectories(Paths.get(directory + "/" + folderName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFolder(Path directory, String folderName) {
        try {
            Files.delete(Paths.get(directory + "/" + folderName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
