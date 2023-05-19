package com.RazvanOrganization.accessmodifiers;

import com.RazvanOrganization.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {

        Person RazvanPerson = new Person("Razvan", "Trufan", 89);
        RazvanPerson.isRetired = false;

        if (RazvanPerson.isRetired) {
            System.out.println("Razvan este la pensie");
        } else {
            System.out.println("Razvan nu este iesit la pensie");
        }

        Person MadalinaPerson = new Person("Madalina", "Palcau", 77, "Timisoara", false);

        if (MadalinaPerson.isRetired) {
            System.out.println("Madalina este la pensie");
        } else {
            System.out.println("Madalina nu este iesita la pensie");
        }

        Person MarianaPerson = new Person("Mariana", "Trufan", 25, "Baia Mare", true);

        if (MarianaPerson.isRetired) {
            System.out.println("Mariana este la pensie");
        } else {
            System.out.println("Mariana nu este iesita la pensie");
        }

        Person AuricaPerson = new Person("Aurica", "Palcau", 44);
        AuricaPerson.isRetired = true;

        if (AuricaPerson.isRetired) {
            System.out.println("Aurica este la pensie");
        } else {
            System.out.println("Aurica nu este iesita la pensie");
        }

        Person SergiuPerson = new Person("Sergiu", "Palcau", 88);
        SergiuPerson.isRetired = false;

        if (SergiuPerson.isRetired) {
            System.out.println("Sergiu este la pensie");
        } else {
            System.out.println("Sergiu nu este iesit la pensie");
        }
    }
}
