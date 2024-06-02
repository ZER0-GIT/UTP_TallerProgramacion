package semana2;

import java.util.Scanner;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de tres cifras:");
        int num = leer.nextInt();
        if (num>=100&&num<=999){
            int suma = (num/100)+((num%100)/10)+(num%10);
            System.out.println("La suma de las 3 cifras es: "+suma);
        }else{System.out.println("El número "+num+" no tuvo 3 cifras!");}
    }
}
