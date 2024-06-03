package semana3;

import java.util.Scanner;

public class S2_Ejercicio1  {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su sexo\n1) femenino\n2) masculino\n");
        int sexo = leer.nextInt();
        System.out.print("Ingrese su sector funcionario:\n1) Salud\n2) Educación\n3) Transporte\n");
        int sector = leer.nextInt();
        double salario=0;
        if (sexo==1){
            salario=(sector==1)?15000*1.25:((sector==2)?12000*1.12:((sector==3)?18000*1.2:0));
        }
        if (sexo==2){
            salario=(sector==1)?15000*1.2:((sector==2)?12000*1.11:((sector==3)?18000*1.15:0));
        }
        System.out.printf("El nuevo salario es: S/.%.2f",salario);
    }
}
