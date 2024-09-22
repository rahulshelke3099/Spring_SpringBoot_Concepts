package com.rahul.app;

import com.rahul.app.model.Laptop;
import com.rahul.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringDemoApplication.class);
        Laptop laptop = context.getBean(Laptop.class);
        LaptopService service = context.getBean(LaptopService.class);
        service.addlaptop(laptop);
    }
}
