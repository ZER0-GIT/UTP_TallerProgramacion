package semana14.ejercicio2;

import java.util.Scanner;

public class Estacionamiento {
    public static Object[][] zona = new Object[5][7];
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Auto auto = new Auto();
        System.out.print("Elija una opción:\n 1)Parquear\n 2)Retirar\n 3)Mostrar Zona\n");
        int opc_menu = leer.nextInt();
        switch (opc_menu){
            case 1:
                System.out.print("Ingrese los datos del auto a parquear\n");
                leer.nextLine();
                System.out.println("Placa:");
                auto.setPlaca(leer.nextLine());
                System.out.println("Marca:");
                auto.setMarca(leer.nextLine());
                System.out.println("Modelo:");
                auto.setModelo(leer.nextLine());
                System.out.println("Propietario");
                auto.setPropietario(leer.nextLine());
                System.out.println("En que zona desea parquear:");
                parquear(leer.nextInt(), auto);

                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opción Incorrecta");
        }

    }
    public static void parquear(int zonaparqueo, Auto auto){
        for (int i = 0; i < zona[1].length ; i++) {
            if (zona[zonaparqueo][i]==null){
                zona[zonaparqueo][i]=1;

                break;
            }
        }
        System.out.print(zonaparqueo+auto.getPlaca()+auto.getMarca()+auto.getModelo()+auto.getPropietario());
    }
    public static void retirar(){

    }
}
