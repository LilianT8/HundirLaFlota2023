import java.util.Scanner;

public class barcos {

    /**
     * Método comprueba que las coordenadas esten dentro de las condiciones establecidas.
     * @return  devulve las coordenadas introducimas por el usuario
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
            while (coordenadas.charAt(0) < 65 || coordenadas.charAt(0) > 74 && coordenadas.charAt(1) < 49 || coordenadas.charAt(1) > 57 && coordenadas.length() > 2){
                System.out.println("Introduce las coordenadas A-J y 1-9 ");
                coordenadas = sc.next();
                coordenadas = coordenadas.toUpperCase();

            }
            return coordenadas;
        }

        public static void rellenarBarcosJugador(){





    }


        }

