package com.RazvanOrganization.autoservicetask;

public class Tool {
    boolean needsElectricity;
    boolean isElevator;
    boolean isUsed;
    long uniqueCode;
    double weight;

    Tool() {
        // System.out.println("A fost creat un instrument despre care nu se stie nimic");
    }

    Tool(long uniqueCode) {
        this.uniqueCode = uniqueCode;
        // System.out.println("A fost creat un instrument despre care se cunoaste doar codul");
    }
}
