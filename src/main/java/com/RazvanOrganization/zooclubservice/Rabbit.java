package com.RazvanOrganization.zooclubservice;

public class Rabbit extends Animal implements AnimalInterface {
    //Definim un constructor pentru a crea obiecte de tipul Dog cu parametrul formal de tip String Name

    public Rabbit(String name) {
        //Cuvantul cheie super este folosit pentru apelul constructorului clasei parinte, care are nevoie de aceasta proprietate
        super(name);
    }

    //makesound() este o metoda declarata in AnimalInterface respectiv trebuie implementata, ea fiind abstracta acolo

    @Override
    public void makeSound() {
        System.out.println("Rabbit " + getName() + " says: ssss ! ");
    }

    //eat() este o metoda declarata in clasa abstracta Animal respectiv trebuie implementata, ea fiind abstracta acolo

    @Override
    public void eat() {
        // metoda getName este concreta si implementata in clasa Parinte Animal. Aceasta poate fi declarata si Protected acolo
        System.out.println(getName() + " is eating cabbage.");
    }
}