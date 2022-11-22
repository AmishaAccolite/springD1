package com.example.demo.beans;

public class Car {
    String type;
    Company company;
    String model;
    double prize;

    public Car(String type, Company company, String model, double prize) {
        this.type = type;
        this.company = company;
        this.model = model;
        this.prize = prize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", company=" + company +
                ", model='" + model + '\'' +
                ", prize=" + prize +
                '}';
    }
}
