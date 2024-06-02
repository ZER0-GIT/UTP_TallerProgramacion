package semana1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Implementar un programa en Java que permita convertir dólares a soles (tipo de cambio: 3.72)
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los dolares que desea convertir:");
        double dolares = leer.nextDouble();
        System.out.println("Nuevo cambio a soles: S/."+(dolares*3.72));

    }
}
