package com.RazvanOrganization.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        // Obiect 1 - Garage
        Garage garajulLuiGeorge = new Garage("Bulevardul Independentei 20A");
        garajulLuiGeorge.carCapacity = 10;
        garajulLuiGeorge.hasComputerDiagnostics = false;
        garajulLuiGeorge.numberId = "One";
        garajulLuiGeorge.scheduler = "L-V";

        System.out.println("Garajul lui George are urmatoarele proprietati: Adresa:" + garajulLuiGeorge.address +
                " CarCapacity:" + garajulLuiGeorge.carCapacity + " numberId:" + garajulLuiGeorge.numberId + " Orar de " +
                "lucru: " + garajulLuiGeorge.scheduler + " hasComputerDiagnostics: " + garajulLuiGeorge.hasComputerDiagnostics);


        // Obiect 2 - Garage
        Garage garajulLuiRazvan = new Garage("Bulevardul Traian 15");
        garajulLuiRazvan.carCapacity = 15;
        garajulLuiRazvan.hasComputerDiagnostics = true;
        garajulLuiRazvan.numberId = "Two";
        garajulLuiRazvan.scheduler = "Zilnic";

        System.out.println("Garajul lui Razvan are urmatoarele proprietati: Adresa: " + garajulLuiRazvan.address +
                " CarCapacity: " + garajulLuiRazvan.carCapacity + " numberId: " + garajulLuiRazvan.numberId + " Orar de " +
                "lucru: " + garajulLuiRazvan.scheduler + " hasComputerDiagnostics " + garajulLuiRazvan.hasComputerDiagnostics);

        // Obiect 3 - Garage
        Garage garajulMadalinei = new Garage("Decebal 7");
        garajulMadalinei.address = "Independentei 5B";
        garajulMadalinei.hasComputerDiagnostics = true;
        garajulMadalinei.numberId = "2";
        garajulMadalinei.scheduler = "S-D";

        System.out.println("Garajul Madalinei are urmatoarele proprietati: Adresa: " + garajulMadalinei.address +
                " CarCapacity: " + garajulMadalinei.carCapacity + " numberId: " + garajulMadalinei.numberId + " Orar de " +
                "lucru: " + garajulMadalinei.scheduler + " hasComputerDiagnostics " + garajulMadalinei.hasComputerDiagnostics);

        // Obiect 4 - Car
        Car masinaLuiRazvan = new Car("AUDI", "A4", 2011, "Diesel");
        masinaLuiRazvan.carPrice = 9000;
        masinaLuiRazvan.km = 195000;
        masinaLuiRazvan.gearType = "Manual";

        System.out.println("Masina lui Razvan are urmatoarele proprietati: Make: " + masinaLuiRazvan.make + " Model: " +
                masinaLuiRazvan.model + " Production year:" + masinaLuiRazvan.productionYear + " FuelType:" + masinaLuiRazvan.fuelType +
                " car Price: " + masinaLuiRazvan.carPrice + " km: " + masinaLuiRazvan.km + " gearType: " + masinaLuiRazvan.gearType);

        // Obiect 5 - Car
        Car masinaMadalinei = new Car("Mazda", "Model 3", "SM91MDY", "Gri");

        System.out.println("Masina Madalinei are urmatoarele proprietati: Make: " + masinaMadalinei.make + " Model: " +
                masinaMadalinei.model + " Numar de inmatriculare: " + masinaMadalinei.plateNumber +
                " Culoarea " + masinaMadalinei.color);

        // Obiect 6 - Tool
        Tool elevatorTool = new Tool(2001);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Elevatorul are proprietatile: " + "Cod Unic: " + elevatorTool.uniqueCode + " are Elevator: " +
                elevatorTool.isElevator + " Se foloseste: " + elevatorTool.isUsed + " Are nevoie de electricitate: " +
                elevatorTool.needsElectricity);

        // Obiect 7 - Tool
        Tool hummerTool = new Tool();
        hummerTool.weight = 5;
        hummerTool.isUsed = true;
        hummerTool.uniqueCode = 1992;

        System.out.println("Obiectul ciocanTool are proprietatile: " + "Cod Unic: " + hummerTool.uniqueCode + " este folosit: " +
                hummerTool.isUsed + " Are greutatea: " + hummerTool.weight);


        // Obiect 8 - Worker
        Worker angajatulMihai = new Worker();
        angajatulMihai.name = "Mihai";
        angajatulMihai.age = 35;
        angajatulMihai.isExperienced = true;
        angajatulMihai.sexType = "Masculin";
        angajatulMihai.specialization = "Mecanic Auto";
        angajatulMihai.weight = 85;
        angajatulMihai.height = 1.80;

        System.out.println("Angajatul Mihai are proprietatile: " + "Nume: " + angajatulMihai.name + " Are varsta: " +
                angajatulMihai.age + " Are sexul: " + angajatulMihai.sexType + " Are inaltimea: " + angajatulMihai.height +
                " Are greutatea: " + angajatulMihai.weight +
                " Are experienta: " + angajatulMihai.isExperienced + " Are specializarea: " + angajatulMihai.specialization);

        // Constructor - fara parametrii
        Worker angajatulDinu = new Worker();
        System.out.println("Initializare de obiect, fara parametrii ");

    }
}
