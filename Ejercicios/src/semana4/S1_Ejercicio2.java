package semana4;

import java.util.Scanner;

public class S1_Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESA UNA OPCIÓN:");
        System.out.print("1) SOLES\n2) DÓLARES\n3) EUROS\n\n");
        System.out.print("Moneda de origen: ");
        int origen = leer.nextInt();
        System.out.print("Moneda de destino: ");
        int destino = leer.nextInt();
        System.out.print("INGRESA EL MONTO: ");
        double monto = leer.nextDouble();

        double resultado = 0.0;

        if (origen == destino) {
            System.out.println("Estás utilizando la misma moneda de origen y destino, tienen que ser diferentes");
        } else {
            switch (origen) {
                case 1: // Soles
                    switch (destino) {
                        case 2: // Dólares
                            resultado = monto / 3.82;
                            System.out.printf("Conversión:\nSoles: %.2f\nDólares: %.2f", monto, resultado);
                            break;
                        case 3: // Euros
                            resultado = monto / 4.17;
                            System.out.printf("Conversión:\nSoles: %.2f\nEuros: %.2f", monto, resultado);
                            break;
                        default:
                            System.out.println("MONEDA DE DESTINO INCORRECTA");
                    }
                    break;
                case 2: // Dólares
                    switch (destino) {
                        case 1: // Soles
                            resultado = monto * 3.82;
                            System.out.printf("Conversión:\nDólares: %.2f\nSoles: %.2f", monto, resultado);
                            break;
                        case 3: // Euros
                            resultado = monto * 0.915;
                            System.out.printf("Conversión:\nDólares: %.2f\nEuros: %.2f", monto, resultado);
                            break;
                        default:
                            System.out.println("MONEDA DE DESTINO INCORRECTA");
                    }
                    break;
                case 3: // Euros
                    switch (destino) {
                        case 1: // Soles
                            resultado = monto * 4.17;
                            System.out.printf("Conversión:\nEuros: %.2f\nSoles: %.2f", monto, resultado);
                            break;
                        case 2: // Dólares
                            resultado = monto / 0.915;
                            System.out.printf("Conversión:\nEuros: %.2f\nDólares: %.2f", monto, resultado);
                            break;
                        default:
                            System.out.println("MONEDA DE DESTINO INCORRECTA");
                    }
                    break;
                default:
                    System.out.println("MONEDA DE ORIGEN INCORRECTA");
            }
        }
    }
}

