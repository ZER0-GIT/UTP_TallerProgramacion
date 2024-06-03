package semana3;

import java.util.Scanner;

public class S1_Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese su sexo (hombre)(mujer)");
        String sexo = leer.nextLine();
        if ((edad>=65&&sexo.equalsIgnoreCase("hombre")||(edad>=60&&sexo.equalsIgnoreCase("mujer")))){
            System.out.println("Usted se puede jubilar.");
        }else{
            System.out.println("Usted no se puede jubilar");
        }
    }
}
