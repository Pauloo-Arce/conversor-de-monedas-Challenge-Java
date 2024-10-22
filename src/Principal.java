import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("******************************************\n" +
                    "Bienvenidos al conversor de monedas!\n\n" +
                    "Ingresa la conversión que desea realizar.\n\n" +
                    "1. Dólar a Peso Argentino\n"+
                    "2. Peso Argentino a Dólar\n"+
                    "3. Dólar a Real Brasileño\n"+
                    "4. Real Brasileño a Dólar\n"+
                    "5. Dólar a Peso Colombiano\n"+
                    "6. Peso Colombiano a Dólar\n"+
                    "7. Convertir otra moneda\n"+
                    "8. Salir\n" +
                    "******************************************\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.Convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.Convertir("ARS","USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.Convertir("USD", "BRL",consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.Convertir("BRL","USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.Convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.Convertir("COP","USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.ConvertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Programa Finalizado.");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
                    break;
            }
        }
    }
}
