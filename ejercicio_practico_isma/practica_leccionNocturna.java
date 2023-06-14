package Java_Basico.ejercicio_practico_isma;

import java.util.Scanner;

public class practica_leccionNocturna {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // EJERCICIO DE LOGICA 1:

        var cantidad_dias_mes = 29;

        if (cantidad_dias_mes > 30) {
            System.out.println("es un mes largo");
        } else if (cantidad_dias_mes == 30) {
            System.out.print("es un mes medio\n");
        } else {
            System.out.println("solo puede ser febrero\n");
        }


        // EJERCICIO DE LOGICA 2:

        var consola="ps4";

        if(consola == "ps5" || consola == "nsw") {
            System.out.println("es la consola correcta");
        } else if(consola == "ps4") {
            System.out.print("tienes que ahorrar\n\n");
        } else {
            System.out.println("comprate un PC");
        }


        // EJERCICIO DE LOGICA 3:

        var coche1="rojo";
        var coche2="amarillo";

        if(coche1 == "rojo" && coche2 == "amarillo") {
            System.out.println("son los vecinos");
        }else {
            System.out.println("no se quienes son");
        }


        // EJERCICIO DE IMPORTACION DE FUNCIONES DESDE UNA CLASE EXTERNA + METODO MATH:

        int f1=2;
        int f2=3;
        int f3=4;

        int resultado=funcion_a_llamar.suma(f1, f2, f3); 	// resultado de importar la funcion suma y concatenarla con texto
        System.out.println(resultado + " es el resultado de la suma de f1, f2 y f3");


        int result=funcion_a_llamar.resta(f1, f2, resultado); 	// resultado de importar la funcion resta de estas variables
        System.out.println(result);


        double operacion=Math.sqrt(result); 	// raiz cuadrada del resultado de la funcion resta importada anteriormente
        System.out.println(operacion);


        double prueba=Math.sqrt(funcion_a_llamar.suma(f1, f2, f3)); 	//raiz cuadrada del resultado de la funcion suma importada aqui
        System.out.println(prueba);

        double constante_PI=Math.PI*f1; 	// constante PI multiplicada por la variable f1
        System.out.println(constante_PI);

        double potencia=Math.pow(constante_PI, f1); 	// constante pi elevada al valor de la variable f1
        System.out.println(potencia);


        // EJERCICIO DE UN STRING CON SEPARACION DE LINEA Y TABULADO:

        String texto="programacion sobre objetos";
        System.out.print(texto + " es lo que estoy practicando\n\n");
        System.out.print("tu no\t" + "yo si\n\n");


        // EJERCICIO BUCLE FOR 1:

        for(int j=0;j<10;j++){           // for (variable con su valor inicial; condicion de ruptura; incremetal/decremental)
            System.out.print(j + " ");
        }

        System.out.println("se termino");

        //EJERCICIO BUCLE FOR 2:

        for(double x=10;x>3;x-=2) {
            System.out.print(x + " ");
        }

        // EJERCICIO DE IMPORTACION DE UN SISTEMA PARA INTERACTUAR CON LA CONSOLA:

        Scanner sc=new Scanner(System.in);

        System.out.println("\ndame un numero");


        double v1 = sc.nextDouble();
        System.out.println("dame otro numero");

        double v2 = sc.nextDouble();
        System.out.print("el resultado de su suma siempre sera: \t");
        System.out.print(funcion_a_llamar.sumasimple(v1, v2));	// la consola me devuelve el resultado de la funcion externa importada

    }
}
