package semana3;

import java.util.Scanner;

public class S1_Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precioProducto = leer.nextDouble();
        System.out.println("Ingrese una opción en que dia de la semana fue comprado");
        System.out.print("\n1) LUNES\n2) MARTES\n3) MIÉRCOLES\n4) JUEVES\n5) VIERNES\n6) SÁBADO\n7) DOMINGO\n");
        int numeroDia = leer.nextInt();
        if (((precioProducto>=50&&precioProducto<=80)&&numeroDia==1)||(precioProducto>=120&&(numeroDia!=3&&numeroDia!=4))){
            System.out.println("Su producto si puede ser cambiado");
        }else{
            System.out.println("Su producto no puede ser cambiado");
        }
    }
}
