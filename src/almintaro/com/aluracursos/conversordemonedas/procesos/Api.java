package almintaro.com.aluracursos.conversordemonedas.procesos;
import almintaro.com.aluracursos.conversordemonedas.modelos.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Api {

    public Moneda optenerMoneda(String origen, String salida) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/a6c537656f422eb910ad7da2/pair/" +
                origen + "/" + salida;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


        Gson gson = new Gson();
        return gson.fromJson(json, Moneda.class);
    }

}