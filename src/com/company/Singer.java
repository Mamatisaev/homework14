package com.company;

public class Singer extends Person {

    private String bandName;


    public void singing() {
        System.out.println(getName() + " is singing.");
    }

    public void playGuitar() {
        System.out.println(getName() + " is playing guitar.");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating a sandwich.");
    }

    public Singer(String name, String designation, String bandName) {
        this(name, designation);
        this.bandName = bandName;
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public String toString() {
        return "This singer's name is " + getName() + "." + "\nHis band name is " + bandName + "." + "\nHis designation is just " + getDesignation() + " & " + getDesignation() + ".";
    }
    @Override
    public void learn () {
        System.out.println("Singer is learning how to sing.");
    }
    @Override
    public void walk () {
        System.out.println("Singer is walking along the alley.");
    }
}
