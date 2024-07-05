package semana7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class S1_Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Ingrese un número con formato (P23 para primo o 8! para factorial):");
            String entrada = leer.nextLine();
            // EL PATRON DETERMINA SI TIENE P DE PRIMO O LA ! DE FACTORIAL
            Pattern patternPrimo = Pattern.compile("^P\\d+$");
            Pattern patternFactorial = Pattern.compile("^\\d+!$");
            Matcher matcherPrimo = patternPrimo.matcher(entrada);
            Matcher matcherFactorial = patternFactorial.matcher(entrada);

            if (matcherPrimo.matches()) {
                //Este paso hace que solamente se obtenga el número del string y de esa forma sacando la letra P de primo
                int numero = Integer.parseInt(entrada.substring(1));
                boolean esPrimo = true;
                if (numero <= 1) {
                    esPrimo = false;
                } else {
                    int i = 2;
                    do {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                        i++;
                    } while (i <= Math.sqrt(numero));
                }
                if (esPrimo) {
                    System.out.println("El número " + numero + " es primo.");
                } else {
                    System.out.println("El número " + numero + " no es primo.");
                }
            } else if (matcherFactorial.matches()) {
                //Este paso hace que solamente se obtenga el número del string y de esa forma sacando el caracter '!', de factorial
                int numero = Integer.parseInt(entrada.substring(0, entrada.length() - 1));
                long factorial = 1;
                int i = 1;
                do {
                    factorial *= i;
                    i++;
                } while (i <= numero);
                System.out.println("El factorial de " + numero + " es " + factorial + ".");
            } else {
                System.out.println("Formato invalido (P23 para primo o 8! para factorial).");
            }
            System.out.println("¿Desea continuar? (si/no):");
            continuar = leer.nextLine();
        } while (!continuar.equalsIgnoreCase("no"));
    }
}
