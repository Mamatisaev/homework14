package com.company;

public class Dancer extends Person {

    private String groupName;


    public void dancing() {
        System.out.println(getName() + " is dancing.");
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning how to dance.");
    }
    @Override
    public void walk () {
        System.out.println(getName() + " is walking on the street.");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating a hot dog.");
    }

    public Dancer(String name, String designation, String groupName) {
        this(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    @Override
    public String toString() {
        return "This dancer's name is " + getName() + "." + "\nHer group name is " + groupName + "." + "\nHer designation is just " + getDesignation() + " & " + getDesignation() + ".";
    }
}
