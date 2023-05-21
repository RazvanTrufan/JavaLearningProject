package com.RazvanOrganization.operationsandciclicfunctions;

public class AssignmentOperationsExample {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Atribuirea simpla
        int result = a;
        System.out.println("Atribuirea simpla a numerelor a si b este : " + result);

        // Atribuirea cu adunare
        // result = result + b
        result += b;
        System.out.println("Atribuirea cu adunare a numerelor a si b este : " + result);

        // Atribuirea cu scadere
        // result = result - b
        result -= b;
        System.out.println("Atribuirea cu scadere a numerelor a si b este : " + result);

        // Atribuirea cu inmultire
        // result = result * b
        result *= b;
        System.out.println("Atribuirea cu inmultire a numerelor a si b este : " + result);

        // Atribuirea cu impartire
        // result = result / b
        result /= b;
        System.out.println("Atribuirea cu impartire a numerelor a si b este : " + result);

        // Atribuirea cu restul impartirii
        // result = result % b
        result %= b;
        System.out.println("Atribuirea cu restul impartirii a numerelor a si b este : " + result);
    }
}
