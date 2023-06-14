package Java_Basico.orientada_a_objetos;

import java.util.Vector;

public class a05_vectores {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        //	LOS VECTORES SON ARRAYS DINAMICOS, PERO SIN NECESIDAD DE DARLES UN TAMAÑO INICIAL

        Vector<Integer> vector = new Vector();

        //	para añadir un elemento al vector:
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("datos del vector: " + vector);
        System.out.println(vector.get(1));	//	con esto nos dice el valor de la posicion 1

        //	para eliminar un elemento del vector:
        vector.remove(2);	//	elimina el dato de la posicion 2, en este caso, el 3
        System.out.println("datos del vector: " + vector);

        //	para saber el tamaño (la cantidad de elementos) de un vector:
        System.out.println("vector tamaño: " + vector.size());

        //	para saber la capacidad de un vector(como de grande es el array subyacente que se crea):
        System.out.println("vector capacidad: " + vector.capacity());

        //	para delimitar la capacidad del vector:
        Vector<Integer> vector1 = new Vector(40);	//	el numero en el interior del () delimita su capacidad

        //	una vez delimitado, puedo indicarle cuanto tiene que incrementar su capacidad:
        Vector<Integer> vector2 = new Vector(40, 15);	//	el numero posterior al 15 indica que cuando se llene su capacidad de 40,
        //	tiene que aumentarla en 15, o lo que es lo mismo, seria de 55

        //	podemos comparar vectores:
        Vector<Integer> vector4 = new Vector();
        vector4.add(1);
        vector4.add(2);

        Vector<Integer> vector5 = new Vector();
        vector5.add(1);
        vector5.add(2);
        vector5.add(4);
        vector5.add(4);

        boolean resultado = vector4.equals(vector5);
        System.out.println("Son iguales? " + resultado);

        //	recorrer un vector:
        for(int i:vector5) {
            System.out.println("Valor actual en vector: " + i);
        }

        for(int i = 0; i < vector5.size(); i++)	{
            System.out.println("Valor actual en vector: " + vector5.get(i));
        }

        //	 disminuir la capacidad de un vector hasta su tamaño:
        Vector<Integer> vector6 = new Vector(16);
        vector6.add(110);
        vector6.add(22);
        vector6.add(41);
        vector6.add(43);

        System.out.println("Capacidad: " + vector6.capacity() + " Tamaño: " + vector6.size());
        vector6.trimToSize();	//	este es el metodo que lo realiza
        System.out.println("Capacidad: " + vector6.capacity() + " Tamaño: " + vector6.size());


    }
}
