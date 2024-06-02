package semana1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Escribir un programa que convierta grados Centígrados en grados Fahrenheit. Fórmula: F = (C * 9/5) + 32
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Centígrados:");
        double grados = leer.nextDouble();
        System.out.println("Grados Fahrenheit: "+((grados*9/5)+32));
    }
}
