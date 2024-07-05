package semana9;

import java.util.Random;
import java.util.Scanner;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        System.out.println("Ingrese la cantidad de números aleatorios que desea generar.");
        int valorN = leer.nextInt();
        int[] numeroAleatorio = new int[valorN];
        int suma=0;
        String acuCadena = "";

        System.out.println("====USANDO FOR====");
        for (int i=0 ; i<valorN ; i++){
            numeroAleatorio[i]= random.nextInt((10 - 1)+1);
            suma+=numeroAleatorio[i];
            sb.append(numeroAleatorio[i]).append(" , ");
            acuCadena = sb.toString();
        }
        System.out.println(acuCadena);
        System.out.println("Suma total: "+suma);

        System.out.println("====USANDO WHILE====");
        suma = 0;
        sb.setLength(0);
        int i = 0;
        while (i<valorN){
            numeroAleatorio[i]= random.nextInt((10 - 1)+1);
            suma+=numeroAleatorio[i];
            sb.append(numeroAleatorio[i]).append(" , ");
            acuCadena = sb.toString();
            i++;
        }
        System.out.println(acuCadena);
        System.out.println("Suma total: "+suma);

        System.out.println("====USANDO DO WHILE====");
        suma = 0;
        sb.setLength(0);
        i = 0;
        do{
            numeroAleatorio[i]= random.nextInt((10 - 1)+1);
            suma+=numeroAleatorio[i];
            sb.append(numeroAleatorio[i]).append(" , ");
            acuCadena = sb.toString();
            i++;
        }while(i<valorN);
        System.out.println(acuCadena);
        System.out.println("Suma total: "+suma);
    }
}
