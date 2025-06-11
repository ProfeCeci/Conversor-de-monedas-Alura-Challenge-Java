package com.cecilialopez.conversormonedas.services;

import com.cecilialopez.conversormonedas.models.CambioMoneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda{

    public CambioMoneda buscaCambioMoneda(String codigoBase){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f7f681adf3ac74d7157336db/latest/"+codigoBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CambioMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré la moneda: "+ e.getMessage());
        }

    }
}
