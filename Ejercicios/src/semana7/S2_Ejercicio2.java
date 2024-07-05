package semana7;

import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número decimal:");
        int decimal = leer.nextInt();
        String binario = "";
        while (decimal > 0) {
            int resto = decimal % 2;
            binario = resto + binario;
            decimal = decimal / 2;
        }
        System.out.println("El número binario es: " + binario);
    }
}
