import java.util.Scanner;

public class ConvertirMoneda {
    public static void Convertir(String monedaBase, String monedaTarget, ConsultaApi consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión para hoy\n1 " + monedaBase + " = " + monedas.conversion_rate()+ " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);

        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code());
    }

    public static void ConvertirOtraMoneda(ConsultaApi consulta, Scanner lectura) {
        System.out.println("Ingrese el código de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda a obtener: ");
        String monedaAObtener = lectura.nextLine().toUpperCase();
        Convertir(monedaBase, monedaAObtener, consulta, lectura);
    }
}
