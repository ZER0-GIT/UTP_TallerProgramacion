package semana8;

import java.util.Scanner;

public class S2_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosCeleste = 0;
        int votosMorado = 0;
        int votosTurquesa = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Vote por un color (celeste, morado, turquesa):");
            String color = scanner.nextLine().toLowerCase();
            switch (color) {
                case "celeste":
                    votosCeleste++;
                    break;
                case "morado":
                    votosMorado++;
                    break;
                case "turquesa":
                    votosTurquesa++;
                    break;
                default:
                    System.out.println("Color no válido. Su voto no se contará.");
                    break;
            }
        }
        int totalVotos = votosCeleste + votosMorado + votosTurquesa;
        double porcentajeCeleste = (double) votosCeleste / totalVotos * 100;
        double porcentajeMorado = (double) votosMorado / totalVotos * 100;
        double porcentajeTurquesa = (double) votosTurquesa / totalVotos * 100;

        String colorGanador;
        if (votosCeleste > votosMorado && votosCeleste > votosTurquesa) {
            colorGanador = "celeste";
        } else if (votosMorado > votosCeleste && votosMorado > votosTurquesa) {
            colorGanador = "morado";
        } else {
            colorGanador = "turquesa";
        }

        String reporte = String.format(
                """
                        Resultados de la votación:
                        Celeste: %d votos (%.2f%%)
                        Morado: %d votos (%.2f%%)
                        Turquesa: %d votos (%.2f%%)
                        Color ganador: %s""",
                votosCeleste, porcentajeCeleste,
                votosMorado, porcentajeMorado,
                votosTurquesa, porcentajeTurquesa,
                colorGanador
        );

        System.out.println(reporte);
    }
}
