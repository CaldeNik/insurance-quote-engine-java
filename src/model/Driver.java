package com.nicocalderon.insurtech.model;

public class Driver {
    private int age;
    private int accidents;

    public Driver(int age, int accidents) {
        this.age = age;
        this.accidents = accidents;
    }

    public int getAge() {
        return age;
    }

    public int getAccidents() {
        return accidents;
    }
}