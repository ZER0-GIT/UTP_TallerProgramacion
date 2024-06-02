package semana2;

import java.util.Scanner;

public class S2_Ejercicio1 {
    public static void main(String[] args) {
        final int VELOCIDAD_LUZ = 299792458; //velocidad m/s
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de dias:");
        int numDias= leer.nextInt();
        double distancia = ((double) numDias*VELOCIDAD_LUZ)/1000;
        System.out.println("La distancia recorrida en "+numDias+" dias es: "+distancia+" kilómetros");
    }
}
