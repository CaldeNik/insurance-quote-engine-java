package com.nicocalderon.insurtech;

import com.nicocalderon.insurtech.model.Driver;
import com.nicocalderon.insurtech.model.Vehicle;
import com.nicocalderon.insurtech.service.QuoteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== COTIZADOR DE SEGURO AUTOMOTOR ===");

        System.out.print("Edad del conductor: ");
        int age = scanner.nextInt();

        System.out.print("Cantidad de siniestros: ");
        int accidents = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo de vehículo: ");
        String type = scanner.nextLine();

        System.out.print("Valor del vehículo: ");
        double value = scanner.nextDouble();

        Driver driver = new Driver(age, accidents);
        Vehicle vehicle = new Vehicle(type, value);

        QuoteService quoteService = new QuoteService();
        double premium = quoteService.calculateQuote(driver, vehicle);

        System.out.println("Prima estimada: $" + premium);
    }
}