package com.example.demo.controller;


import com.example.demo.beans.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    CarService serve;

    public CarService getServe() {
        return serve;
    }

    @Autowired
    public void setServe(CarService serve) {
        this.serve = serve;
    }

    @GetMapping("/maruti")
    public List<Car> getMaruti(){
        return serve.getMarutiCars();
    }

    @GetMapping("/Hyundai")
    public List<Car> getHyundai(){
        return serve.getHyundaiCars();
    }
}
