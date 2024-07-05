package semana9;

import java.util.Arrays;

public class S2_Ejercicio1 {
    public static void main(String[] args) {
        int[][] notas = {
                {20, 17, 18, 16},
                {16, 18, 15, 12},
                {20, 20, 14, 15},
                {20, 19, 15, 17},
                {20, 18, 12, 13}};
        int[][] datos = {
                {25, 5},
                {24, 5},
                {25, 5},
                {19, 5},
                {22, 4}};
        String[] nombres = {
                "ANA MARIELA TORRES MONTEZ",
                "CARLOS ALBERTO ROJAS CHAN",
                "GABRIELA LUCIA ALVITES CH",
                "JUAN CARLOS GARCIA RODRIG",
                "ROSA INOÑAN FARRO"};
        double promTotal=0;
        float[] prom = new float[5];
        //Bucle para hallar el promedio para cada alumno
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                prom[f] += notas[f][c];
            }
            prom[f] = prom[f] / notas[0].length;
        }

        Integer[] indice = {0, 1, 2, 3, 4};
        Arrays.sort(indice, (a, b) -> nombres[a].compareTo(nombres[b]));
        System.out.printf("############################### REPORTE DE NOTAS ###############################\n");
        System.out.printf("NOMBRE                            EDAD GRADO  PC1    PC2    PC3    EF    PROM\n");
        System.out.printf("################################################################################\n");
        for (int f= 0; f < nombres.length; f++) {
            System.out.printf("%-30s%-3s",nombres[indice[f]]," ");
            for (int c = 0; c < datos[0].length; c++) {
                System.out.printf("  %-2d",datos[indice[f]][c]);
            }
            for (int c = 0; c < notas[0].length; c++) {
                System.out.printf("     %-2d",notas[indice[f]][c]);
            }
            System.out.printf("    %-2.2f",prom[indice[f]]);
            System.out.println();
        }
        System.out.printf("################################################################################\n");
        for (int i = 0; i < prom.length; i++) {
            promTotal += prom[i];
        }
        promTotal=promTotal/prom.length;
        System.out.printf("PROMEDIO TOTAL:                                                          %-2.2f\n",promTotal);
        System.out.printf("################################################################################\n");
    }
}
