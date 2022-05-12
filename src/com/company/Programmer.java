package com.company;

public class Programmer extends Person {

    private String companyName;

    public void coding() {
        System.out.println(getName() + " is coding.");

    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning how to code.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " is walking with his dog.");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating a hamburger.");
    }

    public Programmer(String name, String designation, String companyName) {
        this(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String name, String designation) {
        super(name, designation);

    }

    @Override
    public String toString() {
        return "This programmer's name is " + getName() + "." + "\nHer company name is " + companyName + "." + "\nHer designation is just " + getDesignation() + " & " + getDesignation() + ".";

    }
}
