package com.nicocalderon.insurtech.service;

import com.nicocalderon.insurtech.model.Driver;
import com.nicocalderon.insurtech.model.CoverageType;
public class QuoteService {

    public double calculateQuote(double vehicleValue, Driver driver, CoverageType coverage) {

        double basePremium = vehicleValue * 0.02; // 2% del valor del vehículo

        // Ajuste por edad
        if (driver.getAge() < 25) {
            basePremium *= 1.20;
        }

        // Ajuste por siniestros
        if (driver.getAccidents() > 2) {
            basePremium *= 1.30;
        }

        // Ajuste por cobertura
        switch (coverage) {
            case FULL_COVERAGE:
                basePremium *= 1.50;
                break;
            case THIRD_PARTY_FIRE_THEFT:
                basePremium *= 1.20;
                break;
            case THIRD_PARTY:
                basePremium *= 1.00;
                break;
        }


        return basePremium;
    }
    public String getRiskLevel(Driver driver) {
        if (driver.getAccidents() > 2 || driver.getAge() < 25) {
            return "ALTO";
        } else if (driver.getAccidents() == 1) {
            return "MEDIO";
        } else {
            return "BAJO";
        }
    }
}