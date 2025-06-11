package com.cecilialopez.conversormonedas.utils;

import com.cecilialopez.conversormonedas.models.CambioMoneda;

import java.util.Map;

public class CalculadorConversion {

    public double convertir(double cantidad, String monedaOrigen, String monedaDestino, CambioMoneda tasas){
        Map<String, Double> precios = tasas.conversion_rates();
        String baseCode = tasas.base_code();

        if (!precios.containsKey(monedaOrigen) || !precios.containsKey(monedaDestino)) {
            // Manejo de error: una o ambas monedas no están en los datos de la API
            throw new IllegalArgumentException("Una de las monedas no está disponible para la conversión.");
        }

        double resultadoCambio=0;

        if (monedaOrigen.equalsIgnoreCase(baseCode)) {
            resultadoCambio = cantidad * precios.get(monedaDestino);
        }

        return resultadoCambio;
    }
}
