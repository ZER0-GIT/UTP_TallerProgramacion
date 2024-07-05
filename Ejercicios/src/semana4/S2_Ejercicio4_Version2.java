package semana4;

import java.util.Scanner;

public class S2_Ejercicio4_Version2 {
    public enum DefinicionCalificacion{Excelente, Bueno, Regular, Deficiente, Error};
    public static void main(String[] args) {
        DefinicionCalificacion resultado = DefinicionCalificacion.Deficiente;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno:");
        Integer nota= leer.nextInt();
        resultado=switch (nota){
            case Integer c when (c>18&&c<=20) -> DefinicionCalificacion.Excelente;
            case Integer c when (c>15&&c<=18) -> DefinicionCalificacion.Bueno;
            case Integer c when (c>=13&&c<=15) -> DefinicionCalificacion.Regular;
            case Integer c when (c<13&&c>=0) -> DefinicionCalificacion.Deficiente;
            default -> DefinicionCalificacion.Error;
        };
        System.out.println("Usted obtuvo la mención de " +resultado);
    }
}
