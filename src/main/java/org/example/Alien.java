package org.example;

public class Alien {

    private int age;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("Setter called for computer");
        this.computer = computer;
    }

    private Computer  computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public Alien(int age, Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    public void code() {
        System.out.println("Coding");
        computer.compile();
    }
}
