package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarRepo {
    Car Hyundai_i10;
    Car Maruti_Swift;
    Car Maruti_Wagon_R;
    Car Hyundai_Creta;
    Car HondaCity;
    Car Toyota_Fortuner;

    public Car getHyundai_i10() {
        return Hyundai_i10;
    }

    @Autowired
    @Qualifier("Hyundai_i10")
    public void setHyundai_i10(Car hyundai_i10) {
        Hyundai_i10 = hyundai_i10;
    }

    public Car getMaruti_Swift() {
        return Maruti_Swift;
    }

    @Autowired
    @Qualifier("Maruti_Swift")
    public void setMaruti_Swift(Car maruti_Swift) {
        Maruti_Swift = maruti_Swift;
    }

    public Car getMaruti_Wagon_R() {
        return Maruti_Wagon_R;
    }

    @Autowired
    @Qualifier("Maruti_Wagon_R")
    public void setMaruti_Wagon_R(Car maruti_Wagon_R) {
        Maruti_Wagon_R = maruti_Wagon_R;
    }

    public Car getHyundai_Creta() {
        return Hyundai_Creta;
    }

    @Autowired
    @Qualifier("Hyundai_Creta")
    public void setHyundai_Creta(Car hyundai_Creta) {
        Hyundai_Creta = hyundai_Creta;
    }

    public Car getHondaCity() {
        return HondaCity;
    }

    @Autowired
    @Qualifier("HondaCity")
    public void setHondaCity(Car hondaCity) {
        HondaCity = hondaCity;
    }


    public Car getToyota_Fortuner() {
        return Toyota_Fortuner;
    }

    @Autowired
    @Qualifier("Toyota_Fortuner")
    public void setToyota_Fortuner(Car toyota_Fortuner) {
        Toyota_Fortuner = toyota_Fortuner;
    }

}
