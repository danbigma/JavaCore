package com.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MassFileExtensionChange {
    private static final Logger logger = LogManager.getLogger(MassFileExtensionChange.class);

    public static void main(String[] args) {
        String directoryPath = "/Users/danbigma/Downloads/aud";
        String oldExtension = ".jfif";
        String newExtension = ".jpeg";
        String newDirectoryPath = "/Users/danbigma/Downloads/aud-renamed";

        File directory = new File(directoryPath);
        File newDirectory = new File(newDirectoryPath);
        newDirectory.mkdirs();

        changeFileExtensionsInParallel(directory, newDirectory, oldExtension, newExtension);
    }

    private static void changeFileExtensionsInParallel(File directory, File newDirectory, String oldExtension, String newExtension) {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        processFiles(directory, newDirectory, oldExtension, newExtension, executor);
        executor.shutdown();
    }

    private static void processFiles(File directory, File newDirectory, String oldExtension, String newExtension, ExecutorService executor) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        File newSubdirectory = new File(newDirectory, file.getName());
                        newSubdirectory.mkdirs();
                        processFiles(file, newSubdirectory, oldExtension, newExtension, executor);
                    } else {
                        String fileName = file.getName();
                        if (fileName.endsWith(".txt") || fileName.endsWith(".jpeg")) {
                            executor.execute(() -> copyFile(file, newDirectory));
                        } else if (fileName.endsWith(oldExtension)) {
                            executor.execute(() -> renameFile(file, newDirectory, oldExtension, newExtension));
                        }
                    }
                }
            }
        }
    }

    private static void renameFile(File file, File newDirectory, String oldExtension, String newExtension) {
        String newFileName = file.getName().replace(oldExtension, newExtension);
        File newFile = new File(newDirectory, newFileName);

        if (file.renameTo(newFile)) {
            logger.info("Archivo renombrado: {} -> {}", file.getName(), newFileName);
        } else {
            logger.warn("No se pudo renombrar el archivo: {}", file.getName());
        }
    }

    private static void copyFile(File file, File newDirectory) {
        File newFile = new File(newDirectory, file.getName());

        try {
            Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
            logger.info("Archivo copiado: {}", file.getName());
        } catch (IOException e) {
            logger.warn("No se pudo copiar el archivo: {}", file.getName());
        }
    }
}
