package com.nicocalderon.insurtech;

import com.nicocalderon.insurtech.model.*;
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

        System.out.print("Valor del vehículo: ");
        double vehicleValue = scanner.nextDouble();

        System.out.println("\nTipo de cobertura:");
        System.out.println("1 - Responsabilidad Civil");
        System.out.println("2 - Terceros Completo");
        System.out.println("3 - Todo Riesgo");

        int option;
        do {
            System.out.print("Elegí una opción (1-3): ");
            option = scanner.nextInt();
        } while (option < 1 || option > 3);

        CoverageType coverage = switch (option) {
            case 1 -> CoverageType.THIRD_PARTY;
            case 2 -> CoverageType.THIRD_PARTY_FIRE_THEFT;
            default -> CoverageType.FULL_COVERAGE;
        };

        Driver driver = new Driver(age, accidents);
        QuoteService service = new QuoteService();

        double quote = service.calculateQuote(vehicleValue, driver, coverage);

        System.out.println("\n👉 Prima mensual estimada: $" + quote);
        String risk = service.getRiskLevel(driver);
        System.out.println("Nivel de riesgo: " + risk);
    }
}