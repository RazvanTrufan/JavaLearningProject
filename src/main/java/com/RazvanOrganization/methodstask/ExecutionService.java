package com.RazvanOrganization.methodstask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(15, 35);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(15);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Random boolean: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(5));
        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(7));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(5));

        Customer RazvanConsumer = new Customer("Razvan Trufan", 31, "trufan.razvan@gmail.com");

        System.out.println("Nume obiect Razvan: " + RazvanConsumer.getName());
        System.out.println("Age obiect Razvan: " + RazvanConsumer.getAge());
        System.out.println("Email obiect Razvan: " + RazvanConsumer.getEmail());

        RazvanConsumer.setName("Razvan Tester");
        RazvanConsumer.setAge(1527);
        RazvanConsumer.setEmail("@email.com");


        System.out.println("Nume obiect Razvan: " + RazvanConsumer.getName());
        System.out.println("Age obiect Razvan: " + RazvanConsumer.getAge());
        System.out.println("Email obiect Razvan: " + RazvanConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
                DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }
}
