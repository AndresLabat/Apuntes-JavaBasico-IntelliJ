package Java_Basico.orientada_a_objetos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class a08_linkedList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

	/*	DIFERENCIAS ENTRE ARRAYLIST Y LINKEDLIST:
		- una arraylist utiliza un array de forma subyacente y una linkedlist usa una lista doblemente enlazada
		- arraylist es mas rapida para almacenar y buscar datos
		- linkedlist es mas rapida para modificar datos
		- cola FIFO -> lo primero que entra es lo primero que sale
		- cola LIFO	-> lo ultimo que entra es lo primero que sale
		*/

        //	ARRAYLIST:

        List<String> nombrealumnos = new ArrayList<>();

        nombrealumnos.add("Juan");
        nombrealumnos.add("Alberto");
        nombrealumnos.add("Paco");
        nombrealumnos.add("Amador");

        //	LINKEDLIST:

        LinkedList<String> listaEnlazada = new LinkedList<String>(nombrealumnos);	//	al introducir el nombre de la ArrayList la
        //	hemos transformado en una LinkedList (copiado)

    }
}

