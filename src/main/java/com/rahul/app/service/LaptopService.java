package com.rahul.app.service;

import com.rahul.app.model.Laptop;
import com.rahul.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repo;


    public void addlaptop(Laptop laptop) {
        System.out.println("Service is working");
        repo.save(laptop);
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
