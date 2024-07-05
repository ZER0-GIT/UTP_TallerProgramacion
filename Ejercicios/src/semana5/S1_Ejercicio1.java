package semana5;

import java.util.Scanner;

public class S1_Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese el tipo de operación:");
        System.out.print(" 1) Suma\n 2) Restas\n 3) Multiplicación\n 4) División\n");
        Scanner leer = new Scanner(System.in);
        int opc = leer.nextInt();
        System.out.println("Ingrese el primer número");
        double num1=leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        double num2= leer.nextDouble();
        double resultado=0;
        switch (opc){
            case 1:
                resultado = num1+num2;
                break;
            case 2:
                resultado = num1-num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                resultado = num1/num2;
                break;
            default:
                System.out.println("Operación no soportada");
        }
        System.out.println("El resultado de su operación es: "+resultado);
    }
}
