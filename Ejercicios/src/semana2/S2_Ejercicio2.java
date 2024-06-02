package semana2;

import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el nombre del primer producto");
        String nombreProducto1 = leer.nextLine();
        System.out.println("Ingrese la cantidad del primer producto");
        int cantProducto1 = leer.nextInt();
        System.out.println("Ingrese el precio por unidad del primer producto");
        double precioProducto1 = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese el nombre del segundo producto");
        String nombreProducto2 = leer.nextLine();
        System.out.println("Ingrese la cantidad del segundo producto");
        int cantProducto2 = leer.nextInt();
        System.out.println("Ingrese el precio por unidad del segundo producto");
        double precioProducto2 = leer.nextDouble();

        double precioFinal= (precioProducto1*cantProducto1)+(precioProducto2*cantProducto2);
        if (nombre.equals("ANA")||nombre.equals("JUAN")){
            precioFinal-=(precioFinal*0.05);
        }
        if (nombreProducto1.contains("GAMER")||nombreProducto2.contains("GAMER")){
            precioFinal-=(precioFinal*0.02);
        }

        System.out.println("##################################");
        System.out.println("TIENDA UTP");
        System.out.println();
        System.out.println("VEND: JESUS      CLI: "+nombre);
        System.out.println("##################################");
        System.out.println(cantProducto1+" "+nombreProducto1+" ("+(precioProducto1*cantProducto1)+")");
        System.out.println(cantProducto2+" "+nombreProducto2+" ("+(precioProducto2*cantProducto2)+")");
        System.out.println("TOTAL A PAGAR: S/."+precioFinal);
        System.out.println("##################################");
        System.out.println("VUELVA PRONTO :)");
        System.out.println("##################################");

    }
}
