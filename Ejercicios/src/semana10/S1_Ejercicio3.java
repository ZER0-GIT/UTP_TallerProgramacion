package semana10;

import java.util.Scanner;

public class S1_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            edades[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                if (edades[j] > edades[j + 1]) {
                    int tempEdad = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = tempEdad;
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }
        System.out.println("Reporte de personas ordenadas por edad:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Edad: " + edades[i]);
        }
    }
}
