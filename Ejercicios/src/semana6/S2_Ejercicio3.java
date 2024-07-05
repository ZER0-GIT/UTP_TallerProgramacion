package semana6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S2_Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pattern patronCorreo = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        final String correctPassword = "P@55w0rd";
        int intentos = 0;
        boolean acceso = false;
        while (intentos < 5) {
            System.out.println("Ingrese su correo electrónico:");
            String correo = leer.nextLine();
            System.out.println("Ingrese su clave de acceso:");
            String contra = leer.nextLine();
            Matcher matcher = patronCorreo.matcher(correo);
            if (matcher.matches() && contra.equals(correctPassword)) {
                acceso = true;
                break;
            } else {
                System.out.println("Acceso denegado");
                intentos++;
            }
        }
        if (acceso) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Cuenta suspendida");
        }
    }
}
