package com.example.demo.service;

import com.example.demo.beans.Car;
import com.example.demo.beans.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepo carrepo;

    public List<Car> getMarutiCars(){
        ArrayList<Car> cars= new ArrayList<>();
        cars.add(carrepo.getMaruti_Swift());
        cars.add(carrepo.getMaruti_Wagon_R());
        return cars;
    }

    public List<Car> getHyundaiCars(){
        ArrayList<Car> cars= new ArrayList<>();
        cars.add(carrepo.getHyundai_i10());
        cars.add(carrepo.getHyundai_Creta());
        return cars;
    }

}
