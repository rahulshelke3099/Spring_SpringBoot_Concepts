package org.spring.JavaConfig;

import org.example.Desktop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = context.getBean(Desktop.class);
        Desktop desktop1 = context.getBean(Desktop.class);
        desktop.compile();
    }
}
