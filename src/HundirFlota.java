public class HundirFlota {
    public static void main(String[] args) {
        char[][] tableroJugador = new char[10][10];
        char[][] tableroPc = new char[10][10];
        char[][] tableroDisparosJugador = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];
        int[] barcos = {4, 3, 2, 2 ,1 };
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        rellenarTableroJugador(tableroJugador);
        rellenarTableroPc(tableroPc);
        rellenarTableroDisparosJugador(tableroDisparosJugador);
        rellenarTableroDisparosPc(tableroDisparosPc);

        System.out.println();
        mostrarTablero(tableroJugador, letras, tableroDisparosJugador);
        System.out.println();
        mostrarTableroPc(tableroPc, tableroDisparosPc, letras);
    }

    public static void mostrarTablero(char[][] tableroJugador, char[] letras, char[][] tableroDisparos) {
        System.out.println("    TABLERO JUGADOR            TABLERO DISPAROS JUGADOR");
        System.out.print("  ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.print("           ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println(); // Aquí ya se han impreso las letras y empieza a imprimir número de filas

        for (int i = 0; i < tableroJugador.length; i++) {
            System.out.print(i + " "); // Imprime número 0 va para abajo e imprime virguilillas de la a a la j por filas despues espcio igual

            // Mostrar tablero del jugador
            for (int j = 0; j < tableroJugador[i].length; j++) {
                System.out.print(tableroJugador[i][j] + " ");
            }

            System.out.print("         " + i + " ");

            // Mostrar tablero de disparos del jugador
            for (int k = 0; k < tableroDisparos[i].length; k++) {
                System.out.print(tableroDisparos[i][k] + " ");
            }

            System.out.println();
        }
    }



    public static void mostrarTableroPc(char[][] tableroPc, char[][] tableroDisparosPc , char [] letras) {
        System.out.println("       TABLERO PC                TABLERO DISPAROS PC");
        System.out.print("  ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.print("           ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();

        for (int i = 0; i < tableroPc.length; i++) {
            System.out.print(i + " "); // Números de fila

            // Mostrar tablero PC
            for (int j = 0; j < tableroPc[i].length; j++) {
                System.out.print(tableroPc[i][j] + " ");
            }

            System.out.print("         " + i + " ");


            // Mostrar tablero de disparos PC
            for (int k = 0; k < tableroDisparosPc[i].length; k++) {
                System.out.print(tableroDisparosPc[i][k] + " ");
            }

            System.out.println();
        }
    }


    public static void rellenarTableroJugador(char[][] tableroJugador) {
        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador[i].length; j++) {
                tableroJugador[i][j] = '~';
            }
        }
    }

    public static void rellenarTableroPc(char[][] tableroPc) {
        for (int i = 0; i < tableroPc.length; i++) {
            for (int j = 0; j < tableroPc[i].length; j++) {
                tableroPc[i][j] = '~';
            }
        }
    }

    public static void rellenarTableroDisparosJugador(char[][] tableroDisparosJugador) {
        for (int i = 0; i < tableroDisparosJugador.length; i++) {
            for (int j = 0; j < tableroDisparosJugador[i].length; j++) {
                tableroDisparosJugador[i][j] = '~';
            }
        }
    }

    public static void rellenarTableroDisparosPc(char[][] tableroDisparosPc) {
        for (int i = 0; i < tableroDisparosPc.length; i++) {
            for (int j = 0; j < tableroDisparosPc[i].length; j++) {
                tableroDisparosPc[i][j] = '~';
            }
        }
    }

}

