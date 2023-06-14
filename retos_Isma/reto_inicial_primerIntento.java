package Java_Basico.retos_Isma;

import java.util.Scanner;

public class reto_inicial_primerIntento {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);

        System.out.println("tienes que adivinar un numero entero entre 1 y 20, ¡comencemos!, escribe el numero en la siguiente linea...y despues dale al INTRO");


        int persona = 0;
        int terminal = 0;
        terminal=(int)(Math.random() * 20);

        persona = sc.nextInt();
        if (persona > terminal) {
            System.out.println("el numero que buscas es menor");
        }else if (persona < terminal) {
            System.out.println("el numero que buscas es mayor");
        }else {
            System.out.println("YOU WIN");
        }


        int persona1 = 0;
        persona1 = sc.nextInt();

        if (persona1 > terminal) {
            System.out.println("el numero que buscas es menor");
        }else if (persona1 < terminal) {
            System.out.println("el numero que buscas es mayor");
        }else {
            System.out.println("YOU WIN");
        }


        int persona2 = 0;
        persona2 = sc.nextInt();

        if (persona2 > terminal) {
            System.out.println("el numero que buscas es menor");
        }else if (persona2 < terminal) {
            System.out.println("el numero que buscas es mayor");
        }else {
            System.out.println("YOU WIN");
        }


        int persona3 = 0;
        persona3 = sc.nextInt();

        if (persona3 > terminal) {
            System.out.println("el numero que buscas es menor");
        }else if (persona3 < terminal) {
            System.out.println("el numero que buscas es mayor");
        }else {
            System.out.println("YOU WIN");
        }


        int persona4 = 0;
        persona4 = sc.nextInt();

        if(persona4 == terminal) {
            System.out.println("YOU WIN");
        }else {
            System.out.println("GAME OVER");
        }


    }

}
