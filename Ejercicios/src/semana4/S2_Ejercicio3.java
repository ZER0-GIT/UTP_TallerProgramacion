package semana4;

import java.util.Scanner;

public class S2_Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String respuesta;

        System.out.println("Ingrese el monto de su línea de credito: ");
        double credito = sc.nextDouble();
        System.out.println("Ingrese el tipo de su tarjeta (1, 2, 3 , ...)");
        int tipoTarjeta = sc.nextInt();

        double aumentoCredito = switch (tipoTarjeta){
            case 1 ->{
                System.out.println("Tienes deuda con el banco?");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("si")){
                    yield 1.125;
                }else{
                    yield 1.25;
                }
            }
            case 2 ->{
                System.out.println("Tienes deuda con el banco?");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("si")){
                    yield 1.175;
                }else{
                    yield 1.35;
                }
            }
            case 3 -> 1.45;
            default -> 1.50;
        };
        credito=credito*aumentoCredito;
        System.out.println("Su nueva linea de credito es: "+credito);
    }
}
