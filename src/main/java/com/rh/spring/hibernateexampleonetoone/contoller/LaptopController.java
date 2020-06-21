package com.rh.spring.hibernateexampleonetoone.contoller;

import com.rh.spring.hibernateexampleonetoone.entity.Laptop;
import com.rh.spring.hibernateexampleonetoone.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

    public LaptopController(@Autowired LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/laptop")
    public List<Laptop> getAll(){
        System.out.println("/laptop");
        return laptopRepository.findAll();
    }
}
