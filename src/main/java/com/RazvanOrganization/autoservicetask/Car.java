package com.RazvanOrganization.autoservicetask;

public class Car {
    int km;
    String make;
    String model;
    int productionYear;
    double carPrice;
    String fuelType;
    String gearType;
    String plateNumber;
    String color;

    // Constructor cu parametrii
    public Car(String make, String model, int productionYear, String fuelType) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        // System.out.println("In urma executiei acestui constructor 4 parametri se creaza un nou obiect despre care nu se cunoaste price, gearType, km");

    }

    // Constructor cu parametrii
    Car(String make, String model, String plateNumber, String color) {
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
        this.color = color;
        //System.out.println("A fost creata o masina despre care cunoastem 4 informatii generale/parametrii");
    }


}

