package semana11;

import java.util.Scanner;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        double[][] numR = new double[3][3];
        double[] suma = new double[3];
        double[] prom= new double[3];
        Scanner leer = new Scanner(System.in);
        // PEDIR QUE INGRESE TODOS LOS VALORES PARA EL ARREGLO numR
        for (int f = 0; f < numR.length ; f++) {
            for (int c = 0; c < numR[0].length; c++) {
                System.out.printf("Ingrese el número de la fila %1d y columna %1d\n", f,c);
                numR[f][c] = leer.nextDouble();
            }
        }
        //Recorriendo el arreglo numR para hallar la suma y promedio de cada fila
        for (int f = 0; f < numR.length ; f++) {
            for (int c = 0; c < numR[0].length; c++) {
                suma[f]+=numR[f][c];
            }
            prom[f]=suma[f]/ numR.length;
        }
        //Imprimir los arreglos como en el ejercicio propuesto
        System.out.printf("ARREGLO%-18s-   SUMA   - PROMEDIO\n"," ");
        for (int f = 0; f < numR.length ; f++) {
            for (int c = 0; c < numR[0].length; c++) {
                System.out.printf("[%-6.2f]",numR[f][c]);
                if (c==2){
                    System.out.printf(" - [%-5.2f] - [%-5.2f]\n", suma[f], prom[f]);
                }
            }
        }
    }
}
