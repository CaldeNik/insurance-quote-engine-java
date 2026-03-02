package com.nicocalderon.insurtech.service;

import com.nicocalderon.insurtech.model.Driver;
import com.nicocalderon.insurtech.model.Vehicle;

public class QuoteService {

    public double calculateQuote(Driver driver, Vehicle vehicle) {
        double premium = vehicle.getValue() * 0.05;

        if (driver.getAge() < 25) {
            premium *= 1.20;
        }

        if (driver.getAccidents() > 3) {
            premium *= 1.30;
        }

        if (vehicle.getType().equalsIgnoreCase("deportivo")) {
            premium *= 1.15;
        }

        return premium;
    }
}