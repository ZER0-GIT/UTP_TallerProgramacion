package semana3;

import java.util.Scanner;

public class S2_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora (0-23): ");
        int horas = scanner.nextInt();
        if (horas < 0 || horas > 23) {
            System.out.println("Hora inválida. Deben estar entre 0 y 23.");
            return;
        }
        System.out.print("Ingrese el minuto (0-59): ");
        int minutos = scanner.nextInt();
        if (minutos < 0 || minutos > 59) {
            System.out.println("Minuto inválido. Deben estar entre 0 y 59.");
            return;
        }
        System.out.print("Ingrese el segundo (0-59): ");
        int segundos = scanner.nextInt();
        if (segundos < 0 || segundos > 59) {
            System.out.println("Segundo inválido. Deben estar entre 0 y 59.");
            return;
        }
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        System.out.printf("La hora en el siguiente segundo será: %02d:%02d:%02d", horas, minutos, segundos);
    }
}
