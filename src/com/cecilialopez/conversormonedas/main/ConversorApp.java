package com.cecilialopez.conversormonedas.main;

import com.cecilialopez.conversormonedas.models.OpcionConversion;
import com.cecilialopez.conversormonedas.services.ServicioConversion;
import com.cecilialopez.conversormonedas.utils.Conversor;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioConversion servicioConversion = new ServicioConversion(scanner);

        int opcionNumero = 0;
        while (opcionNumero != 7) {
            Conversor.exibirMenu();
            try {
                opcionNumero = scanner.nextInt();
                scanner.nextLine();

                OpcionConversion opcion = OpcionConversion.obtenerPorNumero(opcionNumero);

                if (opcion == null) {
                    System.out.println("Opción inválida. Por favor, elija una opción del 1 al 7.");
                    continue;
                }

                if (opcion == OpcionConversion.SALIR) {
                    System.out.println("Saliendo del conversor. ¡Hasta luego!");
                    break;
                }

                // Procesar conversión
                servicioConversion.procesarConversion(opcion);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}