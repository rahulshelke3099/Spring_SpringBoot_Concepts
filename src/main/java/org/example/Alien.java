package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;

    @Autowired
    @Qualifier("laptop")
    private Computer  computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        System.out.println("Setter called for computer");
        this.computer = computer;
    }



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
        this.computer.compile();
    }
}
