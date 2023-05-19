package com.RazvanOrganization.classesandobjects.autoservicetask;

public class Garage {
    String address;
    String numberId;
    boolean hasComputerDiagnostics;
    int carCapacity;
    String scheduler;

    Garage(String address) {
        this.address = address;
    }

    Garage(int carCapacity) {
        this.carCapacity = carCapacity;
    }


}
