package Java_Basico.ejercicio_practico_isma;

import java.util.Scanner;

public class signo_zodiacal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);

        System.out.println("dime tu dia de nacimiento (solo el dia) en dos cifras");

        int dia = 0;
        dia = sc.nextInt();

        System.out.println("dime el numero de tu mes de nacimiento (sin ceros delante)");

        int mes = 0;
        mes = sc.nextInt();


        if(dia >= 21 && mes == 3 || dia <= 19 && mes == 4) {
            System.out.println("eres Aries");
        }
        if(dia >= 20 && mes == 4 || dia <= 20 && mes == 5) {
            System.out.println("eres Tauro");
        }
        if(dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
            System.out.println("eres Géminis");
        }
        if(dia >= 21 && mes == 6 || dia <= 22 && mes == 7) {
            System.out.println("eres Cáncer");
        }
        if(dia >= 23 && mes == 7 || dia <= 22 && mes == 8) {
            System.out.println("eres Leo");
        }
        if(dia >= 23 && mes == 8 || dia <= 23 && mes == 9) {
            System.out.println("eres Virgo");
        }
        if(dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
            System.out.println("eres Libra");
        }
        if(dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
            System.out.println("eres Escorpio");
        }
        if(dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
            System.out.println("eres Sagitario");
        }
        if(dia >= 22 && mes == 12 || dia <= 19 && mes == 1) {
            System.out.println("eres Capricornio");
        }
        if(dia >= 20 && mes == 1 || dia <= 18 && mes == 2) {
            System.out.println("eres Acuario");
        }
        if(dia >= 19 && mes == 2 || dia <= 20 && mes == 3) {
            System.out.println("eres Piscis");
        }

    }

}
