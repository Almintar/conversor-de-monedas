import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String cliente;
        int cantidadParaCambiar = 0;
        double valorCambiado = 0;
        int operacion = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre");
        cliente = lectura.nextLine();


        System.out.println("\n***********************************");
        System.out.println("Nombre del Cliente: " + cliente);
        System.out.println("Tipo de Operacion: Cambio de divisas");
        System.out.println("***********************************");



        String menu = """
                \n*** A que divisas quieres hacer la conversión ***\n
                1: Won surcoreano KRW - Dólar de los Estados Unidos USD
                2: Rublo ruso RUB - Ariary malgache MGA
                3: Riyal catarí QAR - Peso argentino ARS
                4: Baht tailandés THB - Grivna ucraniana UAH
                5: Rand sudafricano ZAR - Riyal saudí SAR
                6: Rupia india INR - Gourde haitiano HTG
                7: Dolar de Nueva Zelanda NZD - Zloty polaco PLN
                8: Yen japonés JPY - Corona islandesa ISK
                9: Salir
                """;

        //Scanner teclado = new Scanner(System.in);



        while (operacion != 9){
            System.out.println(menu);
            operacion = teclado.nextInt();
            switch (operacion){
                case 1:
                    System.out.println("Su saldo es: $" + newSaldo);
                    break;
                case 2:
                    double valorARetirar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea retirar"));
                    if (newSaldo < valorARetirar){
                        System.out.println("Saldo insuficiente");
                        System.out.println("Su nuevo saldo es: $" + newSaldo);
                    }else {
                        newSaldo += - valorARetirar;
                        System.out.println("Valor a retirar: $" + valorARetirar);
                        System.out.println("Su nuevo saldo es: $" + newSaldo);
                    }
                    break;
                case 3:
                    double valorADepositar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea consignar"));
                    newSaldo += + valorADepositar;
                    System.out.println("Valor depositado: $" + valorADepositar);
                    System.out.println("Su nuevo saldo es: $" + newSaldo);
                    break;
                case 9:
                    System.out.println("*** Gracias por utilizar nuestros servicios ***");
                    break;
                default:
                    System.out.println("*** No es una opción correcta ***");
            }
        }
    }
}
