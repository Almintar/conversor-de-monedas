package almintaro.com.aluracursos.conversordemonedas.principal;

import almintaro.com.aluracursos.conversordemonedas.procesos.Conversor;
import almintaro.com.aluracursos.conversordemonedas.modelos.Divisas;
import almintaro.com.aluracursos.conversordemonedas.modelos.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String cliente, origen, salida;
        int monto = 0;
        String operacion = "0" ;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre");
        cliente = lectura.nextLine();


        System.out.println("\n***********************************");
        System.out.println("Nombre del Cliente: " + cliente);
        System.out.println("Tipo de Operacion: Cambio de divisas");
        System.out.println("***********************************");



        String menu = """
                \n*** A que divisas quieres hacer la conversión ***\n
                1. Won surcoreano (KRW)         ->  Dólar de los Estados Unidos (USD)
                2. Rublo ruso (RUB)             ->  Ariary malgache (MGA)
                3. Riyal catarí (QAR)           ->  Peso argentino (ARS)
                4. Baht tailandés (THB)         ->  Grivna ucraniana (UAH)
                5. Rand sudafricano (ZAR)       ->  Riyal saudí (SAR)
                6. Rupia india (INR)            ->  Gourde haitiano (HTG)
                7. Dolar de Nueva Zelanda (NZD) ->  Zloty polaco (PLN)
                8. Yen japonés (JPY)            ->  Corona islandesa (ISK)
                9. Otras conversiones de divisas
                Salir
                """;



        Conversor conversorDeDivisas = new Conversor();
        Moneda moneda = new Moneda();
        // prueba de claculo
        // System.out.println("La cantidad de divisa cambiada: " + conversorDeDivisas.convertirDivisa(moneda, monto));


        while(true){

            System.out.println(menu);
            System.out.println("Escriba la opción deseada");
            operacion = lectura.nextLine();
            //System.out.println(operacion);

            if (operacion.equalsIgnoreCase("salir"))
                break;

            switch (operacion){
                case "1":
                    moneda.setCodigoOrigen("KRW");
                    moneda.setCodigoSalida("USD");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "2":
                    moneda.setCodigoOrigen("RUB");
                    moneda.setCodigoSalida("MGA");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "3":
                    moneda.setCodigoOrigen("QAR");
                    moneda.setCodigoSalida("ARS");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "4":
                    moneda.setCodigoOrigen("THB");
                    moneda.setCodigoSalida("UAH");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "5":
                    moneda.setCodigoOrigen("ZAR");
                    moneda.setCodigoSalida("SAR");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "6":
                    moneda.setCodigoOrigen("INR");
                    moneda.setCodigoSalida("HTG");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "7":
                    moneda.setCodigoOrigen("NZD");
                    moneda.setCodigoSalida("PLN");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "8":
                    moneda.setCodigoOrigen("JPY");
                    moneda.setCodigoSalida("ISK");
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    conversorDeDivisas.convertirDivisa(moneda, monto);

                    break;
                case "9":
                    System.out.println("Elija la divisa de origen");
                    origen = lectura.nextLine();
                    System.out.println("Elija la divisa de final");
                    salida = lectura.nextLine();
                    System.out.println("Elija la cantidad de divisa para cambiar");
                    monto = lectura.nextInt();
                    moneda.setCodigoOrigen(origen);
                    moneda.setCodigoSalida(salida);
                    conversorDeDivisas.convertirDivisa(moneda, monto);
                    break;
                default:
                    System.out.println("*** No es una opción correcta ***");
                    break;

           }
            System.out.println("La cantidad de divisa cambiada: " + conversorDeDivisas.convertirDivisa(moneda, monto));
            operacion = lectura.nextLine();
        }

    }
}
