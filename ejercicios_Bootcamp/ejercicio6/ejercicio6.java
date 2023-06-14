package Java_Basico.ejercicios_Bootcamp.ejercicio6;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ejercicio6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //	PARTE 1:
        //	Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh":

        String reverse = "hola mundo";

        for(int i = reverse.length()-1; i < reverse.length() && i>-1; i--) {
            System.out.print(reverse.charAt(i));
        }

        System.out.print("\n\n");

        //	PARTE 2:
        //	Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores:


        String Valores[] = {"hola"," ","mundo"};
        for(int i=0; i < Valores.length; i++) {
            System.out.print(Valores[i]);	//	MOSTRANDO SUS VALORES
        }

        System.out.print("\n");

        String Valores2[] = {"hola"," ","mundo"};
        for(int i=0; i < Valores2.length; i++) {
            System.out.print(i);			//	MOSTRANDO SUS POSICIONES
        }

        System.out.print("\n\n");


        //	PARTE 3:
		/*	Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en
			ambas dimensiones:	*/

        int arrayBidi[][] = new int [2][3];

        arrayBidi[0][0] = 4;	//	primero la fila y luego la columna
        arrayBidi[0][1] = 6;
        arrayBidi[0][2] = 8;

        arrayBidi[1][0] = 10;	//	primero la fila y luego la columna
        arrayBidi[1][1] = 12;
        arrayBidi[1][2] = 14;


        //	para recorrer este array necesito un for dentro de otro for:

        for(int i = 0; i < arrayBidi.length; i++) {
            System.out.println("valor de i: " + i);


            for(int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        System.out.print("\n\n");


        //	PARTE 4:
			/*	Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el
				resultado final.	*/

        Vector<String> vector = new Vector();

        vector.add("Jose");
        vector.add("Victor");
        vector.add("Alba");
        vector.add("Maria");
        vector.add("Pepe");

        vector.remove("Jose");
        vector.remove("Pepe");

        for(String i:vector) {
            System.out.println("Valor actual en vector: " + i);
        }

        System.out.print("\n\n");

        //	PARTE 5:
			/*	Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser
				añadidos al mismo.	*/

			/*	cada vez que añadimos un elemento que sobrepasa la capacidad del Vector, aumenta en una determinada cantidad su
				capacidad, al añadir 1000 elementos, esto sucedera muchas veces.
				al no ajustar la capacidad del Vector a su tamaño, se consume mas memoria, para esto utilizamos vector.TrimToSize()
			*/

        //	PARTE 6:
			/*	Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el
				valor de cada elemento	*/

        List<String> lista = new ArrayList<>();

        lista.add("Jose");
        lista.add("Victor");
        lista.add("Alba");
        lista.add("Maria");

        System.out.println(lista);

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

        System.out.println(listaEnlazada);

        System.out.print("\n\n");

        // PARTE 7:
			/*	Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro
			    bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
			    Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.	*/

        List<Integer> listaInt = new ArrayList<>();

        int num = 0;

        for(num = 1; num <= 10; num++) {
            listaInt.add(num);
        }


        for(int i = 1; i < listaInt.size(); i++) {
            listaInt.remove(i);
        }


        for(int i:listaInt) {
            System.out.print(i);
        }

        System.out.print("\n");

        System.out.println(listaInt);

        // 	EN UN PASO:

				/*
			    for(num = 1; num <= 10; num++) {
			        if(num%2 == 0){
			        listaInt.add(num);
			        }
			    }

			    System.out.println(listaInt);
				*/

        // PARTE 8:
			/*	Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
			 	ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
			 	mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".*/

        System.out.print("\n\n");

        int numA = 5;
        int numB = 0;

        try {
            int resultado = DividePorCero(numA, numB);
        } catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        System.out.print("\n\n");

        // PARTE 9:
			/*	Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
				La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut"
				*/

        try {
            InputStream fileIn = new FileInputStream("C:\\Users\\andre\\Desktop\\ejercicios bootcam");
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream("C:\\Users\\andre\\Desktop\\ejercicios bootcam");
            fileOut.write(datos);
            fileOut.close();

        } catch (Exception e) {
            System.out.println("exception es: " + e.getMessage());
        }


        // PARTE 10:
			/*	Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un
				ArrayList, LinkedList o array	*/

        System.out.print("\n\n");

        Scanner sc=new Scanner(System.in);

        System.out.println("tienes que adivinar un numero entero entre 0 y 20, ¡comencemos!, escribe el numero en la"
                + " siguiente linea...y despues dale al INTRO");

        int persona = 0;
        int persona1=0;
        int consola = 0;
        consola=(int)(Math.random() * 20);


        try {
            for(int num_repeticiones=4; num_repeticiones <= 4 && num_repeticiones != -1; num_repeticiones--) {

                persona = sc.nextInt();
                if(persona < consola) {
                    System.out.print("dame un numero mayor, ");

                    System.out.println("te quedan " + num_repeticiones + " intentos");

                }if(persona > consola) {
                    System.out.print("dame un numero menor, ");

                    System.out.println("te quedan " + num_repeticiones + " intentos");

                }if(persona == consola){
                    System.out.println("YOU WIN");
                    break;
                }
            }
            System.out.println("GAME OVER, el numero era " + consola);



        }catch (Exception e){
            System.out.println("no se puede realizar, el nombre de la exception es: " + e);
        }



        System.out.println("\nHazme un favor, escribe tres numeros enteros y dale al INTRO");

        List<Integer> listanueva = new ArrayList<>();

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        listanueva.add(num1);
        listanueva.add(num2);
        listanueva.add(num3);

        System.out.println("los numeros que has escrito son: " + listanueva + ", ¡muchas gracias!");


    }

    public static int DividePorCero(int a, int b) throws ArithmeticException {
        return a/b;

    }

}
