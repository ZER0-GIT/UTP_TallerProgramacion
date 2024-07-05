package semana4;

import java.util.Scanner;

public class S2_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno:");
        Integer nota= leer.nextInt();
        String mensajeNota = "Usted obtuvo la mención de #mencion#";
        switch (nota){
            case Integer c when (c>18&&c<=20) -> mensajeNota=mensajeNota.replace("#mencion#", "Excelente");
            case Integer c when (c>15&&c<=18) -> mensajeNota=mensajeNota.replace("#mencion#", "Bueno");
            case Integer c when (c>=13&&c<=15) -> mensajeNota=mensajeNota.replace("#mencion#", "Regular");
            case Integer c when (c<13&&c>=0) -> mensajeNota=mensajeNota.replace("#mencion#", "Deficiente");
            default -> System.out.println("Error");
        }
        System.out.println(mensajeNota);
    }
}
