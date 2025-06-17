package com.cecilialopez.conversormonedas.utils;

import java.util.Map;
import com.cecilialopez.conversormonedas.models.ConversionSolicitud;

public class CalculadorConversion {

    public double convertir(ConversionSolicitud solicitud) {
        Map<String, Double> precios = solicitud.tasas().conversion_rates();
        String baseCode = solicitud.tasas().base_code();

        if (!precios.containsKey(solicitud.monedaOrigen()) ||
                !precios.containsKey(solicitud.monedaDestino())) {
            throw new IllegalArgumentException("Una de las monedas no está disponible para la conversión.");
        }

        double resultadoCambio = 0;

        if (solicitud.monedaOrigen().equalsIgnoreCase(baseCode)) {
            resultadoCambio = solicitud.cantidad() * precios.get(solicitud.monedaDestino());
        }

        return resultadoCambio;
    }
}
