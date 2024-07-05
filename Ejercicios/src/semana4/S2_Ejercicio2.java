package semana4;

import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número entre 1 y 50 para convertirlo a número romano");
        int numero = leer.nextInt();
        if (numero>=0 && numero <=50){
            String unidad = switch (numero%10){
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                case 4 -> "IV";
                case 5 -> "V";
                case 6 -> "VI";
                case 7 -> "VII";
                case 8 -> "VIII";
                case 9 -> "IX";
                default -> "";
            };
            numero=numero/10;
            String decena = switch (numero%10){
                case 1 -> "X"; //10
                case 2 -> "XX"; //20
                case 3 -> "XXX"; //30
                case 4 -> "XL";  //40
                case 5 -> "L";  //50
                default -> "";  //0
            };

            System.out.println("Desea sus números romanos en mayúsculas? ");
            String mayusMinus = leer.next();
            if (mayusMinus.equalsIgnoreCase("si")){
                System.out.println(decena+unidad);
            }else{
                System.out.println(decena.toLowerCase() + unidad.toLowerCase());
            }
        }else{
            System.out.println("Error el número ingresado no es correcto");
        }

    }
}
