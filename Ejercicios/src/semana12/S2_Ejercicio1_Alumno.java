package semana12;

public class S2_Ejercicio1_Alumno {
    private String foto, nombre;
    private int edad, pc1, pc2, pc3, ef;

    public S2_Ejercicio1_Alumno(String foto, String nombre, int edad, int pc1, int pc2, int pc3, int ef){
        this.foto=foto;
        this.nombre=nombre;
        this.edad=edad;
        this.pc1=pc1;
        this.pc2=pc2;
        this.pc3=pc3;
        this.ef=ef;
    }

    public String getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPc1() {
        return pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public int getEf() {
        return ef;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }
}
