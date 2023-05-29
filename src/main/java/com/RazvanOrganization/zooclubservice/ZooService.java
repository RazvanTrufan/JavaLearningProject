package com.RazvanOrganization.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        //Mai jos se aplica polimorfismul pentru a declara un obiect de tip Animal insa pentru a il crea cu constructorul
        // clasei copil Dog

        Animal dog = new Dog("Rex");
        Cat cat = new Cat("Misha");
        Dog secondDog = new Dog("Rexon");

        dog.eat();
        secondDog.makeSound();


        AnimalInterface Dog = new Dog("Urechila");
        Dog.makeSound();


        //Metoda makeSound() ce apartine obiectului Dog nu poate fi apelata deoarece dog este de tip Animal iar
        // makeSound() este declarata in Interfata, pentru a fixa acest lucru ar trebui ca interfata sa fie implementata de catre clasa
        // abstracta Animal dog.makeSound()

        cat.eat();
        cat.makeSound();

        secondDog.eat();
        secondDog.makeSound();

        Fox foxVulpita = new Fox("Vupita");
        foxVulpita.eat();
        foxVulpita.makeSound();

        Rabbit rabbitMorcovel = new Rabbit("Morcovel");
        rabbitMorcovel.eat();
        rabbitMorcovel.makeSound();

    }
}
