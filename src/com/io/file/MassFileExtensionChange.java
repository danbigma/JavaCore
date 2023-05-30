package com.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MassFileExtensionChange {
    public static void main(String[] args) {
        String directoryPath = "Ruta de la carpeta"; // Ruta de la carpeta "coches"
        String oldExtension = ".jfif"; // Extensión antigua de los archivos
        String newExtension = ".jpeg"; // Nueva extensión que deseas asignar
        String newDirectoryPath = "Ruta de la nueva carpeta"; // Ruta de la nueva carpeta

        File directory = new File(directoryPath);
        File newDirectory = new File(newDirectoryPath);
        newDirectory.mkdirs(); // Crea la nueva carpeta y sus subcarpetas si no existen

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
                        newSubdirectory.mkdirs(); // Crea la subcarpeta en la nueva carpeta si no existe
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
            System.out.println("Archivo renombrado: " + file.getName() + " -> " + newFileName);
        } else {
            System.out.println("No se pudo renombrar el archivo: " + file.getName());
        }
    }

    private static void copyFile(File file, File newDirectory) {
        File newFile = new File(newDirectory, file.getName());

        try {
            Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("Archivo copiado: " + file.getName());
        } catch (IOException e) {
            System.out.println("No se pudo copiar el archivo: " + file.getName());
        }
    }
}
