package com.RazvanOrganization.filemanagementservice;

import java.io.*;
import java.nio.file.Files;

public class InputFileReadManager {

    public static void printDataFromAFile(File file) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);

            int character;
            while ((character = fileReader.read()) != -1) {
                //Proceseaza fiecare caracter din fisier
                System.out.println((char) character);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDataFromAFileUsingBufferReader(File file) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //Proceseaza fiecare linie din fisier
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printDataFRomAFileUsingFiles(File file) {
        try {
            System.out.println(Files.readString(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}