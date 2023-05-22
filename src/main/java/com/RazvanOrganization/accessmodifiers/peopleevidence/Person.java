package com.RazvanOrganization.accessmodifiers.peopleevidence;

public class Person {

    private final long ID;
    public boolean isRetired;
    protected String residence;
    private String name;
    private String surname;

    public Person(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        ID = id;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 3 parametrii formali");
    }

    public Person(String name, String surname, long id, String residence, boolean isRetired) {
        this.name = name;
        this.surname = surname;
        ID = id;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 5 parametrii formali");

    }
}



