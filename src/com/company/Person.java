package com.company;

public class Person {

    private String name;
    private String designation;

    public void learn() {
        System.out.println("Person is learning.");
    }

    public void walk() {
        System.out.println("Person is walking.");
    }

    public void eat() {
        System.out.println("Person is eating.");
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
