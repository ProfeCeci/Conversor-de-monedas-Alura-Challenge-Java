package com.cecilialopez.conversormonedas.models;

public record ConversionSolicitud(double cantidad,
                                  String monedaOrigen,
                                  String monedaDestino,
                                  CambioMoneda tasas) {
}
