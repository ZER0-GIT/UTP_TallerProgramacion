package semana4;

import java.util.Scanner;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la puntuación del candidato: ");
        int puntos = leer.nextInt();
        switch (puntos){
            case 0,1,2,3,4:
                System.out.println("Puntuación de "+puntos+" || DESCARTADO");
                break;
            case 5:
                System.out.println("Puntuación de "+puntos+" || EN SUSPENSO");
                break;
            case 6:
                System.out.println("Puntuación de "+puntos+" || ACEPTABLE");
                break;
            case 7,8:
                System.out.println("Puntuación de "+puntos+" || NOTABLE");
                break;
            case 9,10:
                System.out.println("Puntuación de "+puntos+" || SOBRESALIENTE");
            default:
                System.out.println("ERROR: el valor de la puntuación debe ser entre 0 y 10");
        }
    }
}
