package semana6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S2_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pattern patronRespuesta = Pattern.compile("(?i)s[ií]");
        int num = 1;
        while (num>=1&&num<=100){
            System.out.println("INGRESE UN NUMERO ENTRE 1 Y 100");
            num = leer.nextInt();
            if (num>=1&&num<=100){
                leer.nextLine();
                System.out.println("Desea continuar (si/no)");
                String respuesta = leer.nextLine();
                Matcher leerRespuesta = patronRespuesta.matcher(respuesta);
                if (!leerRespuesta.find()){
                    break;
                }
            }
        }
    }
}
