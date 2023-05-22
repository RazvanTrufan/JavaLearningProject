package com.RazvanOrganization.operationsandciclicfunctions;

public class ComparisonOperationsExample {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 2;

        // Comparare daca numerele sunt egale
        boolean isEqual = a == b;
        System.out.println("Numerele sunt egale: " + isEqual);

        // Comparare daca numerele sunt diferite
        boolean isDiff = a != b;
        System.out.println("Numerele sunt diferite: " + isDiff);

        // Comparare daca a > b
        boolean isGraterThan = a > b;
        System.out.println("a este mai mare ca b: " + isGraterThan);

        // Comparare daca a < b
        boolean isLessThan = a < b;
        System.out.println("a este mai mic ca b: " + isLessThan);

        // Comparare daca a > b sau =
        boolean isGraterThanOrEqual = a >= b;
        System.out.println("a este mai mare sau egal ca b: " + isGraterThanOrEqual);

        // Comparare daca b > c sau =
        boolean BGraterThanOrEqualWithC = b >= c;
        System.out.println("b este mai mare sau egal ca c: " + BGraterThanOrEqualWithC);

        // Comparare daca a < b sau =
        boolean isLessThanOrEqual = a <= b;
        System.out.println("a este mai mic sau egal ca b: " + isLessThanOrEqual);

        // Comparare daca b < c sau =
        boolean BLessThanOrEqualWithC = b <= c;
        System.out.println("b este mai mic sau egal ca c: " + BLessThanOrEqualWithC);
    }
}
