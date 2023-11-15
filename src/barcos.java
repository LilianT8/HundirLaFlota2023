import java.util.Scanner;

public class barcos {
    /**
     * Método comprueba que las coordenadas esten dentro de las condiciones establecidas.
     *
     * @return devuelve las coordenadas introducimas por el usuario
     */
    public static String pedirCoordenada() {
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        int x, y;

        System.out.println("Introduce las coordenadas A-J y 1-9 ");
        coordenadas = sc.next();
        // A-J  ES charAt(0)     1-9 es charAt(1)
        coordenadas = coordenadas.toUpperCase();
        // Aquí esta diciendo si el primer caracter es menor que A y mayor que j vuelva a pedir. También si el
        //Si el segundo caracter es menor que 1 o es mayor que 9 también te volverá apedir las coordenadas.
        //CharAt coge la letra en la posición indicada.

        while (coordenadas.charAt(0) < 'A' || coordenadas.charAt(0) > 'J' && coordenadas.charAt(1) < 1 || coordenadas.charAt(1) > 9 && coordenadas.length() > 2) {
            System.out.println("Introduce las coordenadas A-J y 1-9 ");
            coordenadas = sc.next();
            coordenadas = coordenadas.toUpperCase();

        }
        return coordenadas;
    }



    /**
     * Método para colocar en el 1º tablero del jugador las posiciones de sus propios barcos, pido coordenadas varias veces y después veo si cabe o no
     * X --> Horizontal    Y --> Vertical
     *
     * @param tableroJugador
     * @param barcos
     */
    public static void colocarBarcos(char[] tableroJugador, int[] barcos) {

        Scanner sc = new Scanner(System.in);
        String coordenadas;
        String orientacion;
        int x, y;
        boolean cabe;
        boolean choca;
        //todo coordenada es String y estoy guardando en x e y que es de tipo int
        coordenadas = pedirCoordenada();
        x = coordenadas.charAt(0);
        y = coordenadas.charAt(1);


        // Pongo este for porque lo tengo que repetir tantas veces como barcos tenga: Hay 5
        for (int i = 0; i < barcos.length; i++) {

            System.out.println("Introduce X para horizontal o Y para vertical: ");
            orientacion = sc.next().toUpperCase();


            // Si la orientación es diferente de x o y vuelvo a pedir
            while (!orientacion.equals('X') && !orientacion.equals('Y')) {

                System.out.println("Orientación Incorrecta, vuelve a introducir");
                System.out.println("Introduce X para horizontal o Y para vertical: ");
                orientacion = sc.next().toUpperCase();
            }


            cabeBarco(tableroJugador, barcos[i], orientacion, x, y);
        }
    }


    public static boolean cabeBarco(char[][] tableroJugador, int barcos, String orientacion, int x, int y) {
        // todo --> Faltan las coordenadas
        // por defecto es true si entra es falso
        //Estoy recorriendo las filas horizontalmente

        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador[0].length; j++) {
            }
            if (orientacion.equals("X")) {

                // si la fila mas la longitud del barco es menor o igual a la longitud de la primera fila del tablero
                // x --> horizontal
                // y --> vertical
                // Le sumamos a la y para que vaya moviendose a la derecha horizontalmente pero en fi
                if (!(tableroJugador[x][y + barcos ] >= tableroJugador.length)) {
                        return false;
                } else{

                    //NO cabe y vuelve a pedir

                }
            }
            // Si la orientación es vertical
            // x --> horizontal
            // y --> vertical
            // Le sumamos a la i para que vaya moviendose hacia abajo verticalmente
            else if (orientacion.equals("Y")) {
                if (tableroJugador[x + i][y] + barcos[i] <= tableroJugador.length) {
                       return true;

                }import java.util.Scanner;

public class barcos {
    /**
     * Método comprueba que las coordenadas esten dentro de las condiciones establecidas.
     *
     * @return devuelve las coordenadas introducimas por el usuario
     */
    public static String pedirCoordenada() {
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        int x, y;

        System.out.println("Introduce las coordenadas A-J y 1-9 ");
        coordenadas = sc.next();
        // A-J  ES charAt(0)     1-9 es charAt(1)
        coordenadas = coordenadas.toUpperCase();
        // Aquí esta diciendo si el primer caracter es menor que A y mayor que j vuelva a pedir. También si el
        //Si el segundo caracter es menor que 1 o es mayor que 9 también te volverá apedir las coordenadas.
        //CharAt coge la letra en la posición indicada.

        while (coordenadas.charAt(0) < 'A' || coordenadas.charAt(0) > 'J' && coordenadas.charAt(1) < 1 || coordenadas.charAt(1) > 9 && coordenadas.length() > 2) {
            System.out.println("Introduce las coordenadas A-J y 1-9 ");
            coordenadas = sc.next();
            coordenadas = coordenadas.toUpperCase();

        }
        return coordenadas;
    }



    /**
     * Método para colocar en el 1º tablero del jugador las posiciones de sus propios barcos, pido coordenadas varias veces y después veo si cabe o no
     * X --> Horizontal    Y --> Vertical
     *
     * @param tableroJugador
     * @param barcos
     */
    public static void colocarBarcos(char[] tableroJugador, int[] barcos) {

        Scanner sc = new Scanner(System.in);
        String coordenadas;
        String orientacion;
        int x, y;
        boolean cabe;
        boolean choca;
        //todo coordenada es String y estoy guardando en x e y que es de tipo int
        coordenadas = pedirCoordenada();
        x = coordenadas.charAt(0);
        y = coordenadas.charAt(1);


        // Pongo este for porque lo tengo que repetir tantas veces como barcos tenga: Hay 5
        for (int i = 0; i < barcos.length; i++) {

            System.out.println("Introduce X para horizontal o Y para vertical: ");
            orientacion = sc.next().toUpperCase();


            // Si la orientación es diferente de x o y vuelvo a pedir
            while (!orientacion.equals('X') && !orientacion.equals('Y')) {

                System.out.println("Orientación Incorrecta, vuelve a introducir");
                System.out.println("Introduce X para horizontal o Y para vertical: ");
                orientacion = sc.next().toUpperCase();
            }


            cabeBarco(tableroJugador, barcos[i], orientacion, x, y);
        }
    }


    public static boolean cabeBarco(char[][] tableroJugador, int barcos, String orientacion, int x, int y) {
        // todo --> Faltan las coordenadas
        // por defecto es true si entra es falso
        //Estoy recorriendo las filas horizontalmente

        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j < tableroJugador[0].length; j++) {
            }
            if (orientacion.equals("X")) {

                // si la fila mas la longitud del barco es menor o igual a la longitud de la primera fila del tablero
                // x --> horizontal
                // y --> vertical
                // Le sumamos a la y para que vaya moviendose a la derecha horizontalmente pero en fi
                if (!(tableroJugador[x][y + barcos ] >= tableroJugador.length)) {
                        return false;
                } else{

                    //NO cabe y vuelve a pedir

                }
            }
            // Si la orientación es vertical
            // x --> horizontal
            // y --> vertical
            // Le sumamos a la i para que vaya moviendose hacia abajo verticalmente
            else if (orientacion.equals("Y")) {
                if (tableroJugador[x + barcos][y] <= tableroJugador.length) {
                       return true;

                }
            }

        }

    }
}





            }

        }

    }
}




