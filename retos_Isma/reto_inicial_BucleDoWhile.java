package Java_Basico.retos_Isma;

import java.util.Scanner;

public class reto_inicial_BucleDoWhile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc=new Scanner(System.in);

        System.out.println("tienes que adivinar un numero entero entre 0 y 20, ¡comencemos!, escribe el numero en la siguiente linea...y despues dale al INTRO");

        int persona = 0;
        int consola = 0;
        consola=(int)(Math.random() * 20);

        //	CON UN BUCLE FOR:

        for(int num_repeticiones=4; num_repeticiones <= 4 && num_repeticiones != 0; num_repeticiones--) {

            persona = sc.nextInt();
            if(persona < consola) {
                System.out.print("dame un numero mayor, ");

                System.out.println("te quedan " + num_repeticiones + " intentos");

            }else if(persona > consola) {
                System.out.print("dame un numero menor, ");

                System.out.println("te quedan " + num_repeticiones + " intentos");

            }else {
                System.out.println("YOU WIN");
                break;
            }
        }


        //	CON UN BUCLE DO WHILE:

	/*
		int num_repeticiones=5;
		do {
			persona = sc.nextInt();
			if(persona < consola) {
				System.out.print("dame un numero mayor, ");
				num_repeticiones--;
				System.out.println("te quedan " + num_repeticiones + " intentos");

			}else if(persona > consola) {
				System.out.print("dame un numero menor, ");
				num_repeticiones--;
				System.out.println("te quedan " + num_repeticiones + " intentos");

			}else {
				System.out.println("YOU WIN");
				break;
			}

		}	while(num_repeticiones != 1);
		*/

        //	COMUN A AMBOS:

        int persona1=0;
        persona1= sc.nextInt();

        if(persona1 == consola) {
            System.out.println("YOU WIN");
        }else {
            System.out.println("GAME OVER, el numero era " + consola);
        }

    }

}
