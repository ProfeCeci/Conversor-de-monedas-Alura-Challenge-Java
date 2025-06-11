package com.cecilialopez.conversormonedas.main;

import com.cecilialopez.conversormonedas.models.CambioMoneda;
import com.cecilialopez.conversormonedas.services.ConsultaMoneda;
import com.cecilialopez.conversormonedas.utils.CalculadorConversion;
import com.cecilialopez.conversormonedas.utils.Conversor;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        CalculadorConversion calculadora = new CalculadorConversion();

        int opcion = 0;
        while (opcion != 7) {
            Conversor.exibirMenu();
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                CambioMoneda tasas;
                switch (opcion) {
                    case 1:
                        System.out.println("Ha elegido Dólar => Peso argentino");
                        System.out.println("Ingrese el valor que desee convertir: ");
                        double cantidad = scanner.nextDouble();
                        scanner.nextLine();
                        String monedaOrigen = "USD";
                        String monedaDestino = "ARS";
                        tasas = consulta.buscaCambioMoneda(monedaOrigen);
                        double resultadoCambio = calculadora.convertir(cantidad, monedaOrigen, monedaDestino, tasas);
                        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n", cantidad, monedaOrigen, resultadoCambio, monedaDestino);
                        break;
                    case 2:
                        System.out.println("Ha elegido Peso argentino => Dolar");
                        System.out.println("Ingrese el valor que desee convertir: ");
                        cantidad = scanner.nextDouble();
                        scanner.nextLine();
                        monedaOrigen = "ARS";
                        monedaDestino = "USD";
                        tasas = consulta.buscaCambioMoneda(monedaOrigen);
                        resultadoCambio = calculadora.convertir(cantidad, monedaOrigen, monedaDestino, tasas);
                        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n", cantidad, monedaOrigen, resultadoCambio, monedaDestino);
                        break;
                    case 3:
                        System.out.println("Ha elegido Dolar => Real brasileño");
                        System.out.println("Ingrese el valor que desee convertir: ");
                        cantidad = scanner.nextDouble();
                        scanner.nextLine();
                        monedaOrigen = "USD";
                        monedaDestino = "BRL";
                        tasas = consulta.buscaCambioMoneda(monedaOrigen);
                        resultadoCambio = calculadora.convertir(cantidad, monedaOrigen, monedaDestino, tasas);
                        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n", cantidad, monedaOrigen, resultadoCambio, monedaDestino);
                        break;
                    case 4:
                        System.out.println("Ha elegido Real brasileño => Dolar");
                        System.out.println("Ingrese el valor que desee convertir: ");
                        cantidad = scanner.nextDouble();
                        scanner.nextLine();
                        monedaOrigen = "BRL";
                        monedaDestino = "USD";
                        tasas = consulta.buscaCambioMoneda(monedaOrigen);
                        resultadoCambio = calculadora.convertir(cantidad, monedaOrigen, monedaDestino, tasas);
                        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n", cantidad, monedaOrigen, resultadoCambio, monedaDestino);
                        break;
                    case 5:
                        System.out.println("Ha elegido Dolar => Peso colombiano");
                        System.out.println("Ingrese el valor que desee convertir: ");
                        cantidad = scanner.nextDouble();
                        scanner.nextLine();
                        monedaOrigen = "USD";
                        monedaDestino = "COP";
                        tasas = consulta.buscaCambioMoneda(monedaOrigen);
                        resultadoCambio = calculadora.convertir(cantidad, monedaOrigen, monedaDestino, tasas);
                        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n", cantidad, monedaOrigen, resultadoCambio, monedaDestino);
                        break;
                    case 6:
                        System.out.println("Ha elegido Peso colombiano => Dolar");
                        System.out.println("Ingrese el valor que desee convertir: ");
                        cantidad = scanner.nextDouble();
                        scanner.nextLine();
                        monedaOrigen = "COP";
                        monedaDestino = "USD";
                        tasas = consulta.buscaCambioMoneda(monedaOrigen);
                        resultadoCambio = calculadora.convertir(cantidad, monedaOrigen, monedaDestino, tasas);
                        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n", cantidad, monedaOrigen, resultadoCambio, monedaDestino);
                        break;
                    case 7:
                        System.out.println("Saliendo del conversor. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elija una opción del 1 al 7.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
