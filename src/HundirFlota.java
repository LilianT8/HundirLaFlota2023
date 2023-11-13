// tablerojugador/ tablero jugador disparos
// pc // pc
// DE 0 A 9
// TABLERO JUGADFOR Y TABLERO DISPARO JUGADOR
public class HundirFlota {
    public static void main(String[] args) {
        char[][] tableroJugador = new char[10][10];
        char[][] tableroPc = new char[10][10];
        char[][] tableroDiparosJugador = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];
        int []   barcos = {4, 3, 3, 2, 2, 1, 6};
        char[] letras = {'A','B', 'C', 'D', 'E' , 'F', 'G', 'H','I','J' };

        rellenarTableroJugador(tableroJugador);
        rellenarTableroPc(tableroPc);

        System.out.println();
        mostrarTableroJugador(tableroJugador,letras, tableroDiparosJugador);
        System.out.println();
        mostrarTableroPc(tableroPc);
    }


    public static void rellenarTableroJugador(char[][] tableroJugador) {
        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador.length; j++) {
                tableroJugador[i][j] = '~';
            }

        }

    }

    public static void rellenarTableroPc(char[][] tableroPc) {

        for (int i = 0; i < tableroPc.length; i++) {
            for (int j = 0; j < tableroPc.length; j++) {
                tableroPc[i][j] = '~';

            }

        }
    }

    public static void mostrarTableroJugador(char[][] tableroJugador, char[] letras, char [][] tableroDisparosJugador) {
        System.out.println("  TABLERO JUGADOR  ");
        System.out.print("  ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();
        for (int i = 0; i < tableroJugador.length; i++) {
            System.out.print(i + 1 + " "); // Números de fila
            for (int j = 0; j < tableroJugador[i].length; j++) {
                System.out.print(tableroJugador[i][j] + " ");
            }
            System.out.print("   ");
            for (int g = 0;  g<tableroDisparosJugador.length; g++) {
                for (int k = 0; k < tableroDisparosJugador.length; k++) {
                 //   System.out.print(tableroDisparosJugador[g][k] + " ");
                }
            }
            System.out.println();
        }
    }


    public static void mostrarTableroPc(char[][] tableroPc) {
        System.out.println("    TABLERO PC  ");
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < tableroPc.length; i++) {
            for (int j = 0; j < tableroPc.length; j++) {
                System.out.print(tableroPc[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rellenarTableroDisparosJugador (char[][] tableroDisparosJugador){
        for (int i = 0; i <tableroDisparosJugador.length; i++) {
            for (int j = 0; j < tableroDisparosJugador.length; j++) {
                tableroDisparosJugador [i] [j] = '~';
            }

        }

    }


}


