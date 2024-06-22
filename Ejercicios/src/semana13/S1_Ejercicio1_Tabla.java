package semana13;

import java.util.Scanner;

public class S1_Ejercicio1_Tabla {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        S1_Ejercicio1_TablaEleminar eliminarValor= new S1_Ejercicio1_TablaEleminar();
        int[] tabla=new int[6];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Ingrese el valor de la celda "+tabla[i]);
            tabla[i]= leer.nextInt();
        }
        System.out.println("Ingresa el valor que desea borrar");
        int valor = leer.nextInt();
        eliminarValor.eliminarValor(valor, tabla);
    }
}
