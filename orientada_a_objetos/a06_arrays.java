package Java_Basico.orientada_a_objetos;

public class a06_arrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/* LOS ARRAYS SON AGRUPACIONES DE VARIABLES

		 VALOR 				->	2	21	8	43	62
		 INDICE/POSICION	->	0	1	2	3	4

		 EL INDICE ES LA POSICION QUE OCUPA DENTRO DEL ARRAY, EMPEZANDO DESDE 0

		 ARRAY DE 3 DIMENSIONES:

	valor		2	7	9
	indice	->	0	1	2
	valor	!	(3)	6	1
	indice	->	0	1	2
	valor		7	4	2
	indice	->	0	1	2


		array[1][0] -> valor:3

		[] ->  []	[]	[]
		 		0	(1)	2

		 la posicion del array [1][0] es la que esta entre parentesis, osease
		 la posicion del medio (la 1) con valor 3.

		 */

        int[] notas = new int[2];	//	esto indica que instanciamos un nuevo array, y que este va a tener 2 posiciones

        notas[0] = 8;	//	EN LA POSICION 0 DEL ARRAY LE ASIGNAMOS EL VALOR 8
        notas[1] = 9;	//	EN LA POSICION 1 DEL ARRAY LE ASIGNAMOS EL VALOR 9, ETC...

        System.out.println(notas[0]);	//	IMPRIMO EL VALOR DE LA POSICION 0 DEL ARRAY


        int[] notas1 = {8,10,5,9,8,7,5,6};

        //	METODOS:	(AVERIGUAR PORQUE NO FUNCIONAN)

        //	notas1.binarySearch(notas1, 9);	//	le indico el nombre del array, despues el valor, y me devuelve la posicion
        //	notas.sort(notas1);	//	es un metodo que nos permite ordenar un array
        //	equals(notas,notas1);	//	nos hace la comparacion entre dos arrays, devolviendonos un valor booleano (true o false)

        for(int i = 0; i < notas1.length; i++) {	//	DE ESTA FORMA RECORREMOS LOS VALORES DEL ARRAY
            System.out.println(notas1[i]);
        }

        for(int i:notas1) {	//	ESTA ES LA FORMA ABREVIADA PARA RECORRER UN ARRAY IGUAL QUE CON LA ANTERIOR
            System.out.println(i);
        }

        String nombres[] = {	//	ARRAY DE STRINGS
                "Pepe",
                "Juan",
                "Francisco"
        };

        //	ARRAY DE STRINGS:

        System.out.println("logitud del array: " + nombres.length);

        for(String i:nombres) {
            System.out.println(i);
        }

        //	ARRAY BIDIMENSIONAL:

        //	2 filas x 4 columnas
        int arrayBidi[][] = new int [2][4];
        arrayBidi[0][0] = 1;	//	primero la fila y luego la columna
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;	//	primero la fila y luego la columna
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        //	1	2	3	4
        //	10	20	30	40

        //	para recorrer este array necesito un for dentro de otro for:

        for(int i = 0; i < arrayBidi.length; i++) {
            System.out.println("valor de i: " + i);


            for(int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        //	cuando conocemos los valores podemos inicializar el array asi:

        int arrayBidi2[][] = {
                { 1, 2, 3, 4 },
                {10, 20, 30, 40}
        };

    }

}

