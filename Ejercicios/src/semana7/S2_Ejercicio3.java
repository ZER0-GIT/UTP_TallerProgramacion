package semana7;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S2_Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pattern patron = Pattern.compile("^([a-zA-Z])([a-zA-Z])=(\\d+)$");
        Matcher matcher;
        String expresion;
        do {
            System.out.println("Ingrese una expresión de la forma ab=N:");
            expresion = leer.nextLine();
            matcher = patron.matcher(expresion);
            if (!matcher.matches()) {
                System.out.println("La expresión no cumple con el formato. Inténtelo de nuevo.");
            }
        } while (!matcher.matches());

        char a = expresion.charAt(0);
        char b = expresion.charAt(1);
        int N = Integer.parseInt(expresion.substring(3));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
            System.out.println(sb);
        }
    }
}