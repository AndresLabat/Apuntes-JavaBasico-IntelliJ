package Java_Basico.apuntes;

public class bucles {

    public static void main(String[] args) {
        // TODO Auto-generated method stub



        // Ejemplo bucle DO-WHILE:

        int n = 0;
        do{                           // Dentro de "do" se especifica que se va a repetir hasta que llegue a la condición de fin indicado en while.
            System.out.print(n + " ");
            n++;
        }while(n != 5);               // != Distinto de . = asignación, == comparación, === comparación exacta, <> distinto (en algunos lenguajes)
        System.out.print("\nSe acabo\n");


        //---------------------------------------------------------


        // Ejemplo BUCLE WHILE (while significa "mientras"):

        int x = 0;
        while(x != 5){
            System.out.print(x + " ");
            x++;
        }
        System.out.print("\nSe acabo\n");

        // Otro ejemplo de BUCLE WHILE:

        int count = 0;
        while(count < 10) {
            count++;
            if(count == 6) {
                continue;	//	EN CASO DE QUE COUNT SEA IGUAL A 6, SALTA A LA SIGUIENTE ITERACION, SALTANDONOS EN ESTE PASO TODO LO QUE
                //	VIENE A CONTINUACION ESCRITO
            }
            if(count == 8) {
                break;		//	EN CASO DE QUE COUNT SEA IGUAL A 8, DETIENE EL BUCLE, SIN LLEGAR A 10
            }
            System.out.println("while con continue " + count);
        }


        //----------------------------------------------------------


        // BUCLE FOR (significa "para"):

	    /* se compone de (INICIALIZACION; COMPARACION; ACCION)

	    VAR CONTADOR = 10

	    "PARA" (INICIALIZACION; COMPARACION; ACCION)
	    "PARA" (; CONTADOR MAYOR QUE CERO; CONTADOR IGUAL A CONTADOR MENOS 1)
	     	IMPRIME EL VALOR DE LA VARIABLE CONTADOR */

        for (int contador = 1; contador <= 10; contador++) {

            if(contador == 1) {
                System.out.println("empezamos en el ");
            } else if (contador > 1 && contador < 10) {
                System.out.println("seguimos en el ");
            } else {
                System.out.println("termino en el");
            }

            if(contador == 3) {
                continue;
            }


            System.out.println(contador + " del bucle for");
        }

        // el contador empieza en 1
        // que se ejecute el bucle mientras contador sea menor o igual a 10
        // le digo la forma como debe alcanzar ese final

        // EQUIVALENTE HECHO CON UN WHILE SIN LA PARTE DE LOGICA:

        int contador=1;
        while (contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
        }


        // EJEMPLO FOR CON VARIABLES:

        System.out.println(" ");	// esto es para generar una linea y separar los resultados del anterior ejercicio y este

        int andres=4;
        int alba=22;
        int mama=12;

        for(andres=6; andres < alba && andres != mama; andres++) {
            System.out.print(andres + " ");
        }


        //PRIMER EJEMPLO FOR EN UNA ARRAY:

        int array[]= {5, 8, 11};

        for(int i=2; i > -1; i--) {		// la i representa la posicion en el array desde 0
            System.out.println(array[i]);
        }

        // SEGUNDO EJEMPLO FOR EN UNA ARRAY:

        int array1[]= {2, 4, 10, 12};

        for(int j=0; j < 4; j++){		// la j representa la posicion en el array desde 0
            System.out.print(array1[j] + "\t");
        }

        // TERCER EJEMPLO FOR EN UNA ARRAY:

        System.out.println("\n ");	// esto es para generar dos lineas y separar los resultados del anterior ejercicio y este

        double array2[]= {0.5, 1.5, 3.2, 4.3, 7,4};

        for(int h=0; h > -1 && h < 3; h++) {
            System.out.println(array2[h] + " tercera prueba");
        }

        // CUARTO EJEMPLO FOR EN UNA ARRAY:

        System.out.println(" ");	// esto es para generar una linea y separar los resultados del anterior ejercicio y este

        double array3[]= {1.1, 2.2, 3.3, 4.4, 5.5};

        for(int w=2; w > 0 && w < 4; w++) {
            System.out.println("ahora toca " + array3[w] + " cuarta prueba");
        }

        // QUINTO EJEMPLO FOR EN UNA ARRAY:

        System.out.println(" ");	// esto es para generar una linea y separar los resultados del anterior ejercicio y este

        int array4[]= {3, 6, 10, 15, 18};
        // posicion->  0  1   2   3   4

        for(int posicion=3; posicion >= 1; posicion--) {
            System.out.println(array4[posicion]);
        }

    }
}