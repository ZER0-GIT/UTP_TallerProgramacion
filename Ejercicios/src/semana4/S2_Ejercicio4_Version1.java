package semana4;

import java.util.Scanner;

public class S2_Ejercicio4_Version1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno:");
        int nota = scanner.nextInt();
        String mensaje = "Usted obtuvo la mención de #mencion#";
        String mencion = (nota>18 && nota<=20) ? "Excelente" : (nota>15&&nota<=18) ? "Bueno" :
                (nota>=13 && nota<=15) ? "Regular": (nota<13&& nota>=0) ? "Deficiente": "Error";
        System.out.println(mensaje.replace("#mencion#", mencion));
    }
}
