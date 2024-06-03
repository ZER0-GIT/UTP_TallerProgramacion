package semana3;

import java.util.Scanner;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("====== VERIFICADOR DE  PROGRESIÓN ARITMÉTICA =======");
        System.out.print("Ingresa el primero número: ");
        int n1 = leer.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int n2 = leer.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int n3 = leer.nextInt();
        System.out.println("====================================================");
        if (n2-n1==n3-n2) {
            System.out.println("Si está en progresión aritmética");
        }else{
            System.out.println("No está en presión aritmética");
        }
    }
}