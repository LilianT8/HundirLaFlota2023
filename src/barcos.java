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
        System.out.println("Introduce las coordenadas A-J y 1-9 ");
        coordenadas = sc.next();
        // A-J  ES charAt(0)     1-9 es charAt(1)
        coordenadas = coordenadas.toUpperCase();
        // Aquí esta diciendo si el primer caracter es menor que A y mayor que j vuelva a pedir. También si el
        //Si el segundo caracter es menor que 1 o es mayor que 9 también te volverá apedir las coordenadas.
        //CharAt coge la letra en la posición indicada.

        // TODO -- > ARREGLAR LA PARTE DE LAS LETRAS EN VEZ DE PONER NUMEROS PONER LALETRA ENTRE COMILLAS SIMPLES
        while (coordenadas.charAt(0) < 'A' || coordenadas.charAt(0) > 74 && coordenadas.charAt(1) < 49 || coordenadas.charAt(1) > 57 && coordenadas.length() > 2) {
            System.out.println("Introduce las coordenadas A-J y 1-9 ");
            coordenadas = sc.next();
            coordenadas = coordenadas.toUpperCase();

        }
        return coordenadas;
    }

    /**
     * Método para colocar en el 1º tablero del jugador las posiciones de sus propios barcos, pido coordenadas varias veces y después veo si cabe o no
     * X --> Horizontal    Y --> Vertical
     * @param tablerJugador
     * @param barcos
     */
    public static void colocarBarcos(char[]tablerJugador , int[]barcos) {
        Scanner sc = new Scanner(System.in);
        String coordenadasTablero;
        String orientacion ;
        int x, y;
        boolean cabe;
        boolean choca;


        System.out.println("Introduce X para horizontal o Y para vertical: ");
        orientacion = sc.next().toUpperCase();

        while (!orientacion.equals('X') && !orientacion.equals('Y')){

            System.out.println("Orientación Incorrecta, vuelve a introducir");
            System.out.println("Introduce X para horizontal o Y para vertical: ");
            orientacion = sc.next().toUpperCase();
        }

        for (int i = 0; i < barcos.length; i++) {
            coordenadasTablero = pedirCoordenada();
             if (){

             }

        }


        }
        public static boolean cabeBarco(char[]tableroJugador , int[] barcos, String orientacion){

        for (int i = 0; i < tableroJugador.length; i++) {
            for (int j = 0; j <tableroJugador[0].length; j++) {
                //Si la orientacion es horizontal
                if (orientacion.equals("X")){

                    // si la fila mas la longitud del barco es menor o igual a la longitud de la primera fila del tablero
                    tableroJugador[0][j].length + barcos[i] <= tableroJugador[0].length;

                    //Si la orientación es vertical
                } else if (orientacion.equals("Y")) {

                }
            }



        }
            }




    }

