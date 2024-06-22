package semana12;

import javax.swing.text.html.ObjectView;

public class S1_Ejercicio1_Cancion {
    private String nombre;
    private String cantante;
    private String genero;
    private int duracion;

    public S1_Ejercicio1_Cancion(String nombre, String cantante, String genero, int duracion){
        this.nombre=nombre;
        this.cantante=cantante;
        this.genero=genero;
        this.duracion=duracion;
    }
    @Override
    public boolean equals(Object obj){
        S1_Ejercicio1_Cancion cancion = (S1_Ejercicio1_Cancion)obj;
        return nombre.equals(cancion.getNombre()) && cantante.equals(cancion.getCantante()) && genero.equals(cancion.getGenero()) && duracion == cancion.getDuracion();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
