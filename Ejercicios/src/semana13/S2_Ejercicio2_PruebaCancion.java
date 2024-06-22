package semana13;

import semana12.S1_Ejercicio1_Cancion;

public class S2_Ejercicio2_PruebaCancion {
    public static void main(String[] args) {
        //ESTE EJERCICIO UTILIZA LA CLASE "S1_Ejercicio1_Cacncion" de la semana 12
        S1_Ejercicio1_Cancion cancion1=new S1_Ejercicio1_Cancion("Rolling Up", "Michael", "Pop", 60);
        S1_Ejercicio1_Cancion cancion2=new S1_Ejercicio1_Cancion("Rolling Up", "Michael", "Pop", 60);
        boolean comparar = cancion1.equals(cancion2);
        System.out.printf(String.valueOf(comparar));
    }
}
