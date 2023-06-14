package Java_Basico.practica_orientada_objetos1;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // AQUI SE ENCUENTRA UNICAMENTE EL MAIN, Y LAS FUNCIONES NECESARIAS PARA TRAER LA FUNCIONES IMPLEMENTADAS EN LA INTERFAZ Y LAS CLASES

        coche coche1 = new cocheSegundaMano(20, "amarillo", "renault megane", 2, 20000);
        System.out.println(coche1);

        cocheDeportivo cochedeportivo = new cocheDeportivo(0, "rojo", "Skyline", 200);
        cochedeportivo.estableceVelocidadMaxima(160);	//		SETTER
        System.out.println(cochedeportivo.dimeVelocidadMaxima());		//		GETTER
        System.out.println(cochedeportivo);		//		TO STRING

        cocheFamiliar utilitario = new cocheFamiliar();
        acelera(utilitario);		//		acelera 20
        pintalo(utilitario);		//		cambia el color a amarillo
        System.out.println(utilitario);

        cocheCompleto superCoche = new cocheCompleto(10, "azul", "Ferrari", 0, 0, 2);
        acelera(superCoche);		//		acelera 40 en vez de 20
        pintalo(superCoche);		//		ahora pasa por pantalla: el nuevo color es amarillo, ademas de cambiar el color a amarillo
        superCoche.estableceCantidad(6);	//		SETTER
        System.out.println(superCoche.dimeCantidad());		//		GETTER
        masCantidad(superCoche);	//		aumenta la cantidad en 1 (caracteristica unica de esta clase porque cantidad es un atributo privado)
        System.out.println(superCoche);


    }

    // ESTAS SON LAS FUNCIONES QUE INVOCAN LOS METODOS DE LA INTERFAZ Y DE LA CLASE COCHECOMPLETO


    public static void acelera(interface_practica cochefam) {
        cochefam.aumentaVelocidad(20);
    }

    public static void pintalo(interface_practica pinta) {
        pinta.cambiaColor("amarillo");
    }

    public static void masCantidad (cocheCompleto cantidad) {
        cantidad.aumentaCantidad(1);
    }

}
