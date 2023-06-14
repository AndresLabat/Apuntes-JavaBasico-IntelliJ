package Java_Basico.orientada_a_objetos;

import java.util.Map;
import java.util.HashMap;

public class a09_maps {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/* Un Mapa está definido por un conjunto de claves, una colección de valores y un conjunto de pares clave-valor
		(también llamadas entradas), que son realmente los elementos de los que está compuesto.

		Permite aplicar una función dada a cada elemento de una colección y devolver una nueva colección con los resultados	*/

        // HASHMAP (la clave no puede estar duplicada):

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        mapa.put("clave3", 90);		//	substituye el valor de clave 3 y, sino existe, crealo
        mapa.replace("clave3", 50);	//	substituye el valor de clave 3
        mapa.remove("clave2");		//	elimina del mapa la entrada con "clave2"

        System.out.println(mapa);	//	me imprime el mapa en horizontal

        System.out.println(mapa.get("clave1"));	//	yo le digo la clave, y me devuelve el valor





        Map<String, Tomate>	personas = new HashMap<>();	//	USO STRING PORQUE LA CLAVE VA A SER DE TIPO STRING
        //	USO TOMATE PORQUE EL VALOR SE LO VA A DAR LA CLASE TOMATE

        personas.put("48591111T", new Tomate());	//	SI AÑADIMOS UN \n DELANTE DEL 48591111T, EN LUGAR DE ESTAR SEGUIDO, LO PONE ORDENADO
        personas.put("48591111R", new Tomate());	//	POR EJEMPLO: "\n48591111R"
        personas.put("48591111S", new Tomate());

        //	COMPUESTO DE UNA CLAVE, Y LUEGO UN VALOR (QUE PUEDE SER UNA CLASE)

        System.out.println(personas);

        for(String i:personas.keySet()) {	//	PARA IMPRIMIR LAS CLAVES
            System.out.println(i);
        }

        for(Tomate i:personas.values()) {	//	PARA IMPRIMIR LOS VALORES
            System.out.println(i);
        }

        for(Map.Entry<String, Tomate> i:personas.entrySet()) {
            System.out.println("Elemento clave es: " + i.getKey());
            System.out.println("Elemento valor es: " + i.getValue());
        }

    }

}

class Tomate{

    String nombre;

    public Tomate() {
        nombre = "tomatito";
    }

    @Override
    public String toString() {
        return "Tomate [nombre=" + nombre + "]";
    }

}
