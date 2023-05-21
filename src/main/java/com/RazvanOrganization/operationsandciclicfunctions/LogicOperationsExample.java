package com.RazvanOrganization.operationsandciclicfunctions;

public class LogicOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // SI LOGIC
        boolean andResult = a && b;
        System.out.println("SI LOGIC intre a si b este: " + andResult);

        a = andResult && b;
        System.out.println("a este: " + a);

        // SAU LOGIC
        boolean orResult = a || b;
        System.out.println("SAU LOGIC intre a si b este: " + orResult);

        a = orResult || b;
        System.out.println("a este: " + a);

        // Negation
        boolean negationB = !b;
        System.out.println("Negarea lui b este: " + negationB);

        boolean negationA = !a;
        System.out.println("Negarea lui a este: " + negationA);
    }
}
