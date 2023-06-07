package com.RazvanOrganization.filemanagementservice;

import java.io.File;

public class FileTaskExecution {

    public static void main(String[] args) {
        File fileObject = new File("src/main/java/com/RazvanOrganization/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(fileObject);
        FileManager.createTheFileIfItDoesNotExist(fileObject);
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printIfTheFileIsADirectoryOrNot(fileObject);
        FileManager.printTheFileAbsolutePath(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.deleteTheFileIfExists(fileObject);

        String filePath = "src/main/java/com/RazvanOrganization/filemanagementservice/texxxt.txt";
        OutputFileWriteManager.writeContentIntoFileUsingFileWriter(filePath, "Continut 1");
        OutputFileWriteManager.writeContentIntoFileUsingBufferWriter(filePath, "Continut 2");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReadManager.printDataFRomAFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFile(fileObjectUsedForReading);
    }
}
