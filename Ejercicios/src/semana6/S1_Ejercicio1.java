package semana6;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        boolean salir = false;
        Pattern patronNombre = Pattern.compile("[U0-9]\\d{8}+");
        Scanner leer = new Scanner(System.in);
        String codigo;
        while(salir==false){
            System.out.println("Ingrese su codigo");
            codigo = leer.nextLine();
            Matcher evaluadorNombre = patronNombre.matcher(codigo);
            if (evaluadorNombre.find()){
                System.out.println("Su codigo de estudiante es correcto:");
                System.out.println(evaluadorNombre.group());
                salir = true;
            }
        }
    }
}
