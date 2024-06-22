package semana13;

import java.util.Arrays;

public class S1_Ejercicio1_TablaEleminar {
    int[] tabla;

    public void eliminarValor(int valor, int[] tabla){
        this.tabla=new int[tabla.length];
        System.arraycopy(tabla, 0, this.tabla, 0, tabla.length);
        System.out.println("ANTES:   "+Arrays.toString(this.tabla));
        boolean ocurrencia=false;
        for (int i = 0; i <this.tabla.length ; i++) {
            if (this.tabla[i]==valor){
                ocurrencia=true;
            }
            if (ocurrencia){
                this.tabla[i]=(i<this.tabla.length-1)?this.tabla[i+1]:0;
            }
        }

        System.out.println("DESPUES: "+Arrays.toString(this.tabla));
    }
}
