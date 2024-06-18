package semana12;

public class S2_Ejercicio1_PruebaAlumno {
    public static void main(String[] args) {
        S2_Ejercicio1_Alumno alumno1 = new S2_Ejercicio1_Alumno("imagen.png","Jesus",22,13,14,16,18);
        System.out.println("Foto: "+alumno1.getFoto()+"\nNombre: "+alumno1.getNombre()+"\nEdad: "+ alumno1.getEdad());
        System.out.println("NOTAS:");
        System.out.print("PC1: "+alumno1.getPc1());
        System.out.print("\nPC2: "+alumno1.getPc2());
        System.out.print("\nPC3: "+alumno1.getPc3());
        System.out.print("\nEF: "+alumno1.getEf());
    }

}
