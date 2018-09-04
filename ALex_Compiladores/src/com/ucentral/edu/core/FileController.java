/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucentral.edu.core;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author ADMIN02F
 */
public class FileController {

    private File file;
    private FileReader readSelectFile;

    public FileController(File file) {
        this.file = file;
    }

    public String readFile() {
        if (checkFile()) {
            try {
                readSelectFile = new FileReader(file);
                int i;
                String fileContent = "";
                while ((i = readSelectFile.read()) != -1) {
                    fileContent = fileContent + (char) i;
                }
                readSelectFile.close();
                return fileContent;
            } catch (IOException e) {
                System.out.println("Error to read selected file, caused by: " + e.getMessage());
                return "There was a problem to read your selected file...";
            }
        }else{
            return "This file can't be used, try again and ensure that you load a .txt file.";
        }
    }

    public boolean checkFile() {
        try {
            String extencion = Files.probeContentType(file.toPath());
            return extencion.equals("text/plain");
        } catch (Exception e) {
            System.out.println("Error to check file path, caused by: " + e.getMessage());
            return false;
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
