package semana15.ejercicio3;

import java.util.Scanner;

public class Juego {
    private char[][] tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActual;

    public Juego(Jugador jugador1, Jugador jugador2) {
        tablero = new char[3][3];
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        jugadorActual = jugador1;
        iniciarTablero();
    }

    public void iniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean hacerMovimiento(int fila, int columna) {
        if (fila >= 0 && columna >= 0 && fila < 3 && columna < 3) {
            if (tablero[fila][columna] == '-') {
                tablero[fila][columna] = jugadorActual.getSimbolo();
                return true;
            }
        }
        return false;
    }

    public boolean verificarGanador() {
        char simbolo = jugadorActual.getSimbolo();
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
        }

        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo) {
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
            return true;
        }
        if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
            return true;
        }

        return false;
    }

    public void cambiarJugador() {
        jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean seguirJugando = true;
        while (seguirJugando) {
            mostrarTablero();
            int fila, columna;
            do {
                System.out.println("Jugador " + jugadorActual.getNombre() + ", ingrese la fila (0-2):");
                fila = scanner.nextInt();
                System.out.println("Jugador " + jugadorActual.getNombre() + ", ingrese la columna (0-2):");
                columna = scanner.nextInt();
            } while (!hacerMovimiento(fila, columna));

            if (verificarGanador()) {
                System.out.println("¡El jugador " + jugadorActual.getNombre() + " ha ganado!");
                iniciarTablero();
                System.out.println("¿Desean seguir jugando? (s/n)");
                char respuesta = scanner.next().charAt(0);
                seguirJugando = (respuesta == 's' || respuesta == 'S');
            } else {
                cambiarJugador();
            }
        }
    }
}
