package Java_Basico.practica_orientada_objetos3_listaDinamica;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Coche coche1 = new CocheSeminuevo(180, "azul", "alfa romeo", 2, 54512.23, 5);
        Coche coche2 = new CocheGrande(170, "blanco", "megane scenic", 0, 0.00, 7);
        Coche coche3 = new CocheDeportivo(280, "rojo", "ferrari", 0, 0.00, 3, 125000);

        // coche3.establecePrecio(160000);	//	no puedo usarlo porque son metodos propios de la clase CocheDeportivo y lo he
        //	instanciado como clase Coche
        // System.out.println(coche3.dimePrecio());		//	no puedo usarlo porque son metodos propios de la clase CocheDeportivo y lo he
        //	instanciado como clase Coche


        List<Coche> ListaDeCoches = new ArrayList<>(); 	//	LISTA DINAMICA (USADA PARA LISTAR LOS OBJETOS Y APLICADO METODOS)

        ListaDeCoches.add(coche1);
        cambiaVelocidad(coche1);
        cambiaModelo(coche1);
        cambiaColor(coche1);
        ListaDeCoches.add(new CocheSeminuevo());
        ListaDeCoches.add(new CocheSeminuevo(185, "amarillo", "ford fiesta", 6, 125803.32, 5));
        ListaDeCoches.add(coche2);
        cambiaVelocidad(coche2);
        cambiaModelo(coche2);
        cambiaColor(coche2);
        ListaDeCoches.add(new CocheGrande());
        ListaDeCoches.add(coche3);
        cambiaVelocidad(coche3);
        cambiaModelo(coche3);
        cambiaColor(coche3);
        ListaDeCoches.add(new CocheDeportivo(260, "rojo", "ferrari", 0, 0.00, 3, 160500));

        for(Coche i:ListaDeCoches) {
            System.out.println(i);
        }

        Map<String, Coche>	matriculas = new HashMap<>();	//	MAPA (USADO PARA AÑADIR MATRICULAS A LOS OBJETOS CREADOS)

        matriculas.put("\n6978GTW", coche1);
        matriculas.put("\n0000GTW", new CocheSeminuevo());
        matriculas.put("\n1234XYZ", coche2);
        matriculas.put("\n9876QWE", coche3);

        System.out.println(matriculas);


    }

    public static void cambiaVelocidad(Interface objeto) {
        objeto.estableVelocidad(220);
    }

    public static void cambiaModelo(Interface objeto) {
        objeto.estableceModelo("un modelo nuevo desconocido");
    }

    public static void cambiaColor(Interface objeto) {
        objeto.estableceColor("plata");
    }

}
