package com.rahul.app.repo;

import com.rahul.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lao) {
        System.out.println("Saved in Database");
    }

}
