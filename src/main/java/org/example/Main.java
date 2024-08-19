package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            Alien alien = (Alien) context.getBean("alien");
            alien.getAge();
            System.out.println(alien.getAge());
            alien.code();
    }
}

