package semana12;

public class S2_Ejercicio2_ReporteAlumno {
    public static void main(String[] args) {
        S2_Ejercicio1_Alumno alumno1 = new S2_Ejercicio1_Alumno("ana.jpg", "Ana", 18, 20, 20, 10, 15);
        System.out.printf("Foto       Nombre  Edad  Pc1  Pc2  Pc3  Ef  Prom\n");
        System.out.printf("%-10s %-7s %-4d  %-3d  %-3d  %-3d  %-3d  ", alumno1.getFoto(), alumno1.getNombre(), alumno1.getEdad(), alumno1.getPc1(), alumno1.getPc2(), alumno1.getPc3(), alumno1.getEf());
    }
}
