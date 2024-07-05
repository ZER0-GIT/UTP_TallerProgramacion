package semana10;

public class S1_Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arreglo2 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        System.out.println("Los números que están en ambos arreglos son:");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i] == arreglo2[j]) {
                    System.out.print(arreglo1[i]+" ");
                    break;
                }
            }
        }
    }
}
