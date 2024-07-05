package semana8;
import java.util.Scanner;
public class S1_Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String menu =
                """
                        ========================
                            ELIJA UNA OPCIÓN
                        1. PROGRESIÓN ARITMÉTICA
                        2. PROGRESIÓN GEOMÉTRICA
                        ========================
                        """;
        int respuesta=0;
        boolean salir = false;
        do {
            System.out.println(menu);
            respuesta = leer.nextInt();
            System.out.println("Ingrese el número de términos a generar: ");
            int nTerminos = leer.nextInt();
            System.out.println("Ingrese el valor de la razón: ");
            double vRazon = leer.nextDouble();

            if (respuesta == 1){
                double termino = 0; // Primer término de la progresión aritmética
                for (int i = 0; i < nTerminos; i++) {
                    System.out.printf("%.2f, ", termino);
                    termino += vRazon; // Incrementa el término por la razón
                }
                salir=true;
            }else if (respuesta == 2){
                double termino = 1;
                for (int i = 0; i < nTerminos; i++) {
                    System.out.printf("%.2f, ", termino);
                    termino *= vRazon; // Incrementa el término por la razón
                }
                salir=true;
            }else {
                System.out.println("Opción incorrecta");
            }
        }while(!salir);
    }
}
