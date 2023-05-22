package com.RazvanOrganization.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 10;
        int d = 15;

        // Incrementare
        a++;
        System.out.println("Valoarea lui a dupa incrementare este: " + a);
        // a = 11
        // Pre - Incrementare
        ++a;
        System.out.println("Valoarea lui a dupa pre-incrementare este: " + a);
        // a = 12
        int b = ++a;
        System.out.println("Valoarea lui b este: " + b);
        // b = 13 , a = 12
        int c = a++;
        System.out.println("Valoarea lui c este: " + c);

        // Decrementare
        d--;
        System.out.println("Valoarea lui d dupa decrementare este: " + d);
        // d = 14
        // Pre - decrementare
        --d;
        System.out.println("Valoarea lui d dupa pre-decrementare este: " + d);
        // d = 13
        int e = --d;
        System.out.println("Valoarea lui e este: " + e);
        // d = 12
        int f = d--;
        System.out.println("Valoarea lui f este: " + e);
    }
}
