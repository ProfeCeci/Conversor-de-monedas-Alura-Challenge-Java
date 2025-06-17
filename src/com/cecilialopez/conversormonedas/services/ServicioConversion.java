package com.cecilialopez.conversormonedas.services;

import com.cecilialopez.conversormonedas.models.CambioMoneda;
import com.cecilialopez.conversormonedas.models.ConversionSolicitud;
import com.cecilialopez.conversormonedas.models.OpcionConversion;
import com.cecilialopez.conversormonedas.utils.CalculadorConversion;

import java.util.Scanner;

public class ServicioConversion {
    private final ConsultaMoneda consulta;
    private final CalculadorConversion calculadora;
    private final Scanner scanner;

    public ServicioConversion(Scanner scanner) {
        this.scanner = scanner;
        this.consulta = new ConsultaMoneda();
        this.calculadora = new CalculadorConversion();
    }

    public void procesarConversion(OpcionConversion opcion) {
        System.out.println("Ha elegido " + opcion.getDescripcion());
        System.out.println("Ingrese el valor que desee convertir: ");

        double cantidad = scanner.nextDouble();
        scanner.nextLine();

        CambioMoneda tasas = consulta.buscaCambioMoneda(opcion.getMonedaOrigen());
        ConversionSolicitud solicitud = new ConversionSolicitud(
                cantidad,
                opcion.getMonedaOrigen(),
                opcion.getMonedaDestino(),
                tasas
        );

        double resultadoCambio = calculadora.convertir(solicitud);

        System.out.printf("El valor de %.2f %s corresponden al valor de =>>> %.2f %s%n",
                cantidad, opcion.getMonedaOrigen(), resultadoCambio, opcion.getMonedaDestino());
    }
}