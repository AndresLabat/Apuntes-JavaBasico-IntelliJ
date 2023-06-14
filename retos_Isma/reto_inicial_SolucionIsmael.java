package Java_Basico.retos_Isma;

//Importamos las clases que necesitaremos para este ejercicio
import java.util.Scanner; // Scanner nos permite introducir valores a través de consola
import java.util.Random; // Random nos permite crear un número aleatorio, necesario para este ejercicio

public class reto_inicial_SolucionIsmael {


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //Inicializamos las instancias de las clases previamente importadas
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        //Generamos una variable con valor int aleatorio para tener que adivinar que número ha generado
        int numero = rand.nextInt(20);
        int num_intentos = 5; // Número de intentos de los que dispone el jugador para adivinar el valor generado

        System.out.print("Intenta adivinar el número que estoy pensando:");

      /* A partir de aqui este bloque de código se repetirá hasta que se cumpla la condición del while, por cada intento fallido
      perderemos una oportunidad cuando el número de oportunidades llegue a 0 habremos perdido.
      */
        do{

            int input = sc.nextInt();                                       // Escribimos el número que creemos que pueda ser
            if(input > numero){                                             // Si nuestro número introducido es mayor que el generado daremos la pista de que introduzca uno menor
                System.out.println("El número que buscas es menor...");
                num_intentos--;                                             // Restamos un intento si se cumple esta condición
            }
            if (input < numero){                                            // Si nuestro número introducido es mayor que el generado daremos la pista de que introduzca uno mayor
                System.out.println("El número que buscas es mayor...");
                num_intentos--;                                             // Restamos un intento si se cumple esta condición
            }
            if (input == numero){                                           // Si acertamos el número felicitamos al jugador y le mostramos el número que había generado la máquina
                System.out.print("Has ganado!, el número que pensaba era: " + numero);
                break;                                                      // Esto obliga a salir del bucle, dado que ya no hace falta que sigamos repitiendo en caso de acertar y tener intentos aún
            }

        } while (num_intentos != 0);                                                // Si llegamos a consumir el nº de intentos la condición de while se cumple
        System.out.println("Has perdido... el número que pensaba era: " + numero);  // Mostramos mensaje de que el jugador ha perdido y le enseñamos el número que era

    }

}