package com.proyect.currency.service;

import com.google.gson.Gson;
import com.proyect.currency.model.CurrencyResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverterService {

    private static final String API_KEY = "617e8f7106f8d6fc674c4bef";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double convertir(String desde, String hacia, double cantidad) {
        try {
            String url = BASE_URL + API_KEY + "/latest/" + desde;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            CurrencyResponse currencyResponse = new Gson().fromJson(json, CurrencyResponse.class);

            if (!currencyResponse.getConversion_rates().containsKey(hacia)) {
                System.out.println("Moneda destino no encontrada.");
                return 0.0;
            }

            double tasa = currencyResponse.getConversion_rates().get(hacia);
            return cantidad * tasa;

        } catch (Exception e) {
            System.out.println("Error al convertir moneda: " + e.getMessage());
            return 0.0;
        }
    }
}
