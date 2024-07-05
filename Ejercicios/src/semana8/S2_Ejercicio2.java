package semana8;

import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.println("Ingrese un número entero positivo:");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("El número no es válido. Inténtelo de nuevo.");
            }
        } while (N <= 0);
        int anterior = 0;
        int actual = 1;
        int suma = 1;
        StringBuilder numeros = new StringBuilder(String.format("%d, %d", anterior, actual));
        for (int i = 2; i < N; i++) {
            int siguiente = anterior + actual;
            numeros.append(String.format(", %d", siguiente));
            suma += siguiente;
            anterior = actual;
            actual = siguiente;
        }
        System.out.println("Los primeros " + N + " números de la serie de Fibonacci son:");
        System.out.println(numeros.toString());
        System.out.println("La suma de los números es: " + suma);
    }
}