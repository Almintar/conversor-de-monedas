package almintaro.com.aluracursos.conversordemonedas.procesos;

import almintaro.com.aluracursos.conversordemonedas.modelos.Divisas;
import almintaro.com.aluracursos.conversordemonedas.modelos.Moneda;
import almintaro.com.aluracursos.conversordemonedas.principal.Principal;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public String convertirDivisa(Moneda moneda, int monto) throws IOException, InterruptedException {


        Api conversorApi = new Api();
        Moneda miMoneda = conversorApi.optenerMoneda(moneda.getCodigoOrigen(), moneda.getCodigoSalida());

        return String.valueOf((miMoneda.getTasaDeCambio()*monto));
    }

}
