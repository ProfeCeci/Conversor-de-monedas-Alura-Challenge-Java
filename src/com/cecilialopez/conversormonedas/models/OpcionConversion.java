package com.cecilialopez.conversormonedas.models;

public enum OpcionConversion {
    DOLAR_A_PESO_ARGENTINO(1, "Dólar => Peso argentino", "USD", "ARS"),
    PESO_ARGENTINO_A_DOLAR(2, "Peso argentino => Dolar", "ARS", "USD"),
    DOLAR_A_REAL_BRASILENO(3, "Dolar => Real brasileño", "USD", "BRL"),
    REAL_BRASILENO_A_DOLAR(4, "Real brasileño => Dolar", "BRL", "USD"),
    DOLAR_A_PESO_COLOMBIANO(5, "Dolar => Peso colombiano", "USD", "COP"),
    PESO_COLOMBIANO_A_DOLAR(6, "Peso colombiano => Dolar", "COP", "USD"),
    SALIR(7, "Salir", "", "");

    private final int numero;
    private final String descripcion;
    private final String monedaOrigen;
    private final String monedaDestino;

    OpcionConversion(int numero, String descripcion, String monedaOrigen, String monedaDestino) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public static OpcionConversion obtenerPorNumero(int numero) {
        for (OpcionConversion opcion : values()) {
            if (opcion.getNumero() == numero) {
                return opcion;
            }
        }
        return null;
    }
}