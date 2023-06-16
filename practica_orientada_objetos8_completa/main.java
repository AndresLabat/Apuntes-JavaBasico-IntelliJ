package Java_Basico.practica_orientada_objetos8_completa;

public class main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    Coche coche1 = new CocheSeminuevo();
    Coche coche2 = new CocheSeminuevo("Renault Megane", 3, 125235, 7, true);
    Coche coche3 = new CocheUtilitario();
        pintaDeBlanco(coche3);
        cambiaVelocidad(coche3);
        cambiaModelo(coche3);
    Coche coche4 = new CocheUtilitario(180, "azul", "Corsa", 1750.32, 5);
    Coche coche5 = new CocheCompleto();
    Motor motor1 = new Motor(180, 16, "V6");
    Coche coche6 = new CocheCompleto(190, "rojo", "hyundai coupe", 1800.00, 3, 0, 0, motor1);

        getColor(coche3);
        getColor(coche6);
        getVelocidad(coche4);
        getVelocidad(coche5);
        getModelo(coche2);
        getModelo(coche1);

    System.out.println("\n");

    Coche coche7 = new CocheCompleto();
        setGenerico(coche7);

    ListaCoches lista = new ListaCoches();

        lista.añadeCoche(coche1);
        lista.añadeCoche(coche2);
        lista.añadeCoche(coche3);
        lista.añadeCoche(coche4);
        lista.añadeCoche(coche5);
        lista.añadeCoche(coche6);

    System.out.println(lista.dimelista());
    lista.dimelistaOrdenada();

    }

    public static void pintaDeBlanco (interfaceCoches objeto){      //  PROVIENE DE UN SETTER
        objeto.estableceColor("blanco");
    }

    public static void cambiaVelocidad (interfaceCoches objeto){      //  PROVIENE DE UN SETTER
        objeto.estableceVelocidad(120);
    }

    public static void cambiaModelo (interfaceCoches objeto){      //  PROVIENE DE UN SETTER
        objeto.estableceModelo("Modelo to flama");
    }

    public static void getColor(interfaceCoches objeto){      //  PROVIENE DE UN GETTER
        System.out.println(objeto.dimecolor());
    }

    public static void getVelocidad(interfaceCoches objeto){      //  PROVIENE DE UN GETTER
        System.out.println(objeto.dimevelocidad());
    }

    public static void getModelo(interfaceCoches objeto){      //  PROVIENE DE UN GETTER
        System.out.println(objeto.dimeModelo());
    }

    public static void setGenerico(interfaceCoches objeto){     //  METODO QUE COMBINA LOS ANTERIORES
        objeto.estableceModelo("modelo GENERICO");
        objeto.estableceColor("color GENERICO");
        objeto.estableceVelocidad(120);
        System.out.println(objeto.dimeModelo());
        System.out.println(objeto.dimecolor());
        System.out.println(objeto.dimevelocidad());
    }
}