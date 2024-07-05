package semana6;

import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int desaprobados=0;
        int aprobados=0;
        int contador=0;
        double nota=0;
        double promedioNotas=0;
        while (true){
            contador++;
            System.out.println("Ingrese la nota del alumno "+contador);
            nota = leer.nextDouble();
            if (nota>=12&&nota<=20){
                aprobados++;
                promedioNotas+=nota;

            } else if (nota<12&&nota>=0) {
                desaprobados++;
                promedioNotas+=nota;
            }else {
                if (nota==-1){
                    contador--;
                    break;
                }else{
                    System.out.println("Error, ingrese la nota del estudiante nuevamente");
                    contador--;
                }
            }
        }
        System.out.println("El promedio de notas es: "+promedioNotas/contador);
        System.out.println("La cantidad de aprobados es: "+aprobados);
        System.out.println("La cantidad de desaprobados es:"+desaprobados);
    }
}
