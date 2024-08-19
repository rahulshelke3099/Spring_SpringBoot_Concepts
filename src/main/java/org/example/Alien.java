package org.example;

public class Alien {

    private int age;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        System.out.println("Setter called for laptop");
        this.laptop = laptop;
    }

    private Laptop  laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public void code() {
        System.out.println("Coding");
        laptop.compile();
    }
}
