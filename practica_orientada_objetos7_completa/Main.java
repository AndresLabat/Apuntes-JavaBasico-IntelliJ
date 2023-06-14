package Java_Basico.practica_orientada_objetos7_completa;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // LISTA CREADA EN UNA CLASE

        CocheLista lista = new CocheLista();

        Coche coche1 = new CocheSeminuevo("blanco", 160, "Reanult", 50000, 6);
        coche1.estableceColor("azul");
        coche1.estableceModelo("Renault Megane");
        coche1.estableceVelocidad(180);
        lista.save(coche1);
        System.out.println(coche1);

        Coche coche2 = new CocheSeminuevo();
        lista.save(coche2);
        System.out.println(coche2);

        CocheUtilitario coche3 = new CocheUtilitario("plata", 160, "Ford Fiesta", 7);
        establecePuertas(coche3);
        dimePuertas(coche3);
        System.out.println(coche3.dimePuertas());
        System.out.println(coche3);

        Convertir(coche3);

        Coche coche4 = new CocheUtilitario("gris", 170, "Ford Mondeo", 5);
        System.out.println(coche4);
        lista.save(coche4);

        Motor motor1 = new Motor("GTI", 6, 210.50);
        Coche coche5 = new CocheCompleto("rojo", 220, "Mazda RX5", 0, 0, 45000,	motor1);
        coche5.estableceColor("verde");
        System.out.println(coche5);
        lista.save(coche5);

        System.out.println(lista.dimeLista());

        Map<String, Coche> mapa = new HashMap<>();

        mapa.put("001", coche1);
        mapa.put("002", coche2);
        mapa.put("003", coche3);
        mapa.put("004", coche4);
        mapa.put("005", coche5);
        mapa.put("006", new CocheCompleto());

        System.out.println(mapa);

        for(String i:mapa.keySet()) {	//	PARA IMPRIMIR LAS CLAVES
            System.out.println(i);
        }

        for(Coche i:mapa.values()) {	//	PARA IMPRIMIR LOS VALORES
            System.out.println(i);
        }

    }

    public static void establecePuertas(CocheUtilitario numero) {	//	INVOCA UN SETTER
        numero.establecePuertas(5);
    }

    public static void dimePuertas(CocheUtilitario numero) {	//	INVOCA UN GETTER
        numero.dimePuertas();
    }

    public static void Convertir(CocheUtilitario cocheConvertido) {	//	METODO QUE AGRUPA OTROS METODOS
        cocheConvertido.establecePuertas(5);
        System.out.println(cocheConvertido.dimePuertas());
        cocheConvertido.estableceColor("color standard");
        cocheConvertido.estableceModelo("modelo standard");
        cocheConvertido.estableceVelocidad(0);
        System.out.println(cocheConvertido);
    }

}
