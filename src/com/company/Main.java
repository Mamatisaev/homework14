package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Akram", "working");

        Programmer programmer = new Programmer("Sevara", "writing code", "Tashkent");

        Dancer dancer = new Dancer("Rayhon", "dancing", "Samarkand");

        Singer singer = new Singer("Akbar", "singing", "Bolalar");

        System.out.println(singer);
        System.out.println(dancer);
        System.out.println(programmer);
        programmer.learn();
        dancer.learn();
        singer.learn();
        programmer.walk();
        dancer.walk();
        singer.walk();
        programmer.eat();
        dancer.eat();
        singer.eat();
        programmer.coding();
        dancer.dancing();
        singer.singing();
        singer.playGuitar();


    }
}
