package semana10;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        int[] datos = {16, 25, 34, 11, 78, 6, 31, 55};

        for (int i = 0; i < datos.length - 1; i++) {
            for (int j = 0; j < datos.length - 1 - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    // Intercambiar datos[j] y datos[j + 1]
                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
    }
}
