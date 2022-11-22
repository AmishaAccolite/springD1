package com.example.demo.config;

import com.example.demo.beans.Car;
import com.example.demo.beans.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.demo.beans","com.example.demo.controller","com.example.demo.service"})
public class CarConfig {

        @Bean("Maruti")
    public Company company1(){
            return new Company("Maruti","India");
        }

    @Bean("Hyundai")
    public Company company2(){
        return new Company("Hyundai","India");
    }

    @Bean("Honda")
    public Company company3(){
        return new Company("Honda","Japan");
    }

    @Bean("Toyota")
    public Company company4(){
        return new Company("Toyota","Japan");
    }

    @Bean("Hyundai_i10")
    public Car car1(){
            return new Car("Manual",company2(),"Hyundai_i10",500000);
    }

    @Bean("Maruti_Swift")
    public Car car2(){
        return new Car("Manual",company1(),"Maruti_Swift",600000);
    }

    @Bean("Maruti_Wagon_R")
    public Car car3(){
        return new Car("Manual",company1(),"Maruti_Wagon_R",400000);
    }

    @Bean("Hyundai_Creta")
    public Car car4(){
        return new Car("Automatic",company2(),"Hyundai_Creta",700000);
    }

    @Bean("HondaCity")
    public Car car5(){
        return new Car("Manual",company3(),"HondaCity",300000);
    }

    @Bean("Toyota_Fortuner")
    public Car car6(){
        return new Car("Automatic",company4(),"Toyota_Fortuner",650000);
    }

}
