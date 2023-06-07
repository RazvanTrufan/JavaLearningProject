package com.RazvanOrganization.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result2 = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result2);
        System.out.println("The program is running till the end");


        String stringValue = "Razvan";
        String stringValue2 = null;

        System.out.println(TestManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TestManager.getTheTextLength(stringValue));
        System.out.println(TestManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/RazvanOrganization/exceptionservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist, the execution of the programme is not interrupted");
        } finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);

        System.out.println("The program is running");
    }
}
