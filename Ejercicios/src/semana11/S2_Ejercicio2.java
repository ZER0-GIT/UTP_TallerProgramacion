package semana11;
import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una opción: \n1. Ordenar por filas \n2. Ordenar por columnas");
        int opcion = scanner.nextInt();

        // Imprimir la matriz desordenada
        System.out.println("Matriz desordenada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // EL ORDENAMIENTO ES USANDO EL MÉTODO BURBUJA
        if (opcion == 1) {
            // Ordenar por filas
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length - 1; j++) {
                    for (int k = 0; k < matriz[i].length - 1 - j; k++) {
                        if (matriz[i][k] > matriz[i][k + 1]) {
                            int temp = matriz[i][k];
                            matriz[i][k] = matriz[i][k + 1];
                            matriz[i][k + 1] = temp;
                        }
                    }
                }
            }
        } else if (opcion == 2) {
            // Ordenar por columnas
            for (int i = 0; i < matriz[0].length; i++) {
                for (int j = 0; j < matriz.length - 1; j++) {
                    for (int k = 0; k < matriz.length - 1 - j; k++) {
                        if (matriz[k][i] > matriz[k + 1][i]) {
                            int temp = matriz[k][i];
                            matriz[k][i] = matriz[k + 1][i];
                            matriz[k + 1][i] = temp;
                        }
                    }
                }
            }
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        // Imprimir la matriz ordenada
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}