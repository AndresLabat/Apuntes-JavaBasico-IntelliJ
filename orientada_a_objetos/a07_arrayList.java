package Java_Basico.orientada_a_objetos;

import java.util.ArrayList;
import java.util.List;

public class a07_arrayList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //	ARRAYLIST:

        //	la ventaja de una arraylist respecto de un array es que puedes agregarle datos mas alla de su limite establecido

        List<String> nombres = new ArrayList<>();	//	DONDE PONE STRING, SE PONE EL NOMBRE DE LA CLASE CON LA QUE VAS A TRABAJAR

        nombres.add("Nombre 1");	//	añade elemento
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        nombres.remove(3);			//	elimina elemento de la posicion 3
        nombres.remove("Nombre 3");	//	elimina el elemento con ese contenido
        System.out.println(nombres.get(1));	//	me dice el valor del elmento en la posicion 1

        System.out.println(nombres);

        //	--------------------------------------------------------------

        List<CocheLista> coches = new ArrayList<>();

        coches.add(new CocheLista("honda civic"));
        coches.add(new CocheLista("renault megane"));
        coches.add(new CocheLista("seat ibiza"));

        System.out.println(coches);


        //	MANERAS DE RECORRER UN ARRAYLIST:
        for(CocheLista i:coches) {
            System.out.println(i);
        }

        for(int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        // COMO TRANSFORMAR UN ARRAYLIST EN UN ARRAY:

        List<String> nombres2 = new ArrayList<>();

        nombres2.add("Juan");
        nombres2.add("Alberto");
        nombres2.add("Paco");
        nombres2.add("Amador");

        String array[] = new String[nombres2.size()];	//	este nuevo array tiene el tamaño de la lista
        for (int i = 0; i < nombres2.size(); i++) {
            array[i] = nombres2.get(i);
        }

        for (String i:array) {
            System.out.println("Elemento es: " + i);
        }

    }

}

class CocheLista{

    String name = "nombre de coche";


    public CocheLista() {}
    public CocheLista(String name) {

        this.name = name;

    }

    @Override
    public String toString() {
        return "CocheLista [name=" + name + "]";
    }

}

