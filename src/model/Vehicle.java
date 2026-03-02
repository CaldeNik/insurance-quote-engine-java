package com.nicocalderon.insurtech.model;

public class Vehicle {
    private String type;
    private double value;

    public Vehicle(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
}