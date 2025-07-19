package com.proyect.currency;

import com.proyect.currency.service.CurrencyConverterService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverterService service = new CurrencyConverterService();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("*************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.print("Elija una opción válida: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> convertirMoneda("USD", "ARS", scanner, service);
                case 2 -> convertirMoneda("ARS", "USD", scanner, service);
                case 3 -> convertirMoneda("USD", "BRL", scanner, service);
                case 4 -> convertirMoneda("BRL", "USD", scanner, service);
                case 5 -> convertirMoneda("USD", "COP", scanner, service);
                case 6 -> convertirMoneda("COP", "USD", scanner, service);
                case 7 -> System.out.println("¡Gracias por usar el conversor!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void convertirMoneda(String desde, String hacia, Scanner scanner, CurrencyConverterService service) {
        System.out.print("Ingrese la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();
        double resultado = service.convertir(desde, hacia, cantidad);
        System.out.printf("Resultado: %.2f %s = %.2f %s\n", cantidad, desde, resultado, hacia);
    }
}
