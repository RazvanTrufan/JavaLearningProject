package com.RazvanOrganization.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int limit = 100;
        while (a > 0) {
            System.out.println(a + ",");
            a = a - 1;
            a -= 1;
            a--;
        }
        System.out.println();

        do {
            System.out.println(b + ".");
            b = b + 1;
            b++;
        } while (b < limit);

        System.out.println();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i + ".");
        }
        System.out.println();

        for (int i = 1; i <= limit; i++) {
            if ((i % 2) != 0) {
                System.out.println(i + ",");
            } else {
                System.out.println("[], ");
            }
        }
    }

}
