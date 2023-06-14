package Java_Basico.ejercicios_varios;

public class practica5_getter_setter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        avion avion1 = new avion();

        System.out.println(avion1.especificaciones_generales());

        avion1.establece_largo(15);
        System.out.println(avion1.dime_largo());

        avion1.establece_modelo("747 Japan Air");
        System.out.println(avion1.dime_modelo());

        avion1.establece_color("blanco\n");
        System.out.println(avion1.dime_color());

        avion1.establece_belleza("no");
        System.out.println(avion1.dime_belleza());

        avion avion2 = new avion();

        System.out.println(avion2.especificaciones_generales());

        avion2.establece_largo(25);
        avion2.aumenta_largo(4);
        avion2.aumenta_largo(5);
        System.out.println(avion2.dime_largo());

        avion2.establece_modelo("747 Air France");
        System.out.println(avion2.dime_modelo());

        avion2.establece_color("rojo\n");
        System.out.println(avion2.dime_color());

        avion2.establece_belleza("si");
        System.out.println(avion2.dime_belleza());

    }

}

class avion {

    private int alas;
    private int ruedas;

    private int largo;
    private String modelo;
    private String color;
    private boolean belleza;

    public avion() {		//		CONSTRUCTOR

        alas = 2;
        ruedas = 2;
        System.out.println("CARACTERISTICAS DEL AVION:");

    }

    public String especificaciones_generales() {		//		GETTER
        return "El avion tiene un total de " + alas + " alas y " + ruedas + " ruedas.";
    }

    public void establece_largo(int largo_avion) {		//		SETTER
        largo = largo_avion;
    }

    public void aumenta_largo(int cantidad) {		//		SETTER NUEVO, EN LUGAR DE DARLE VALOR INICIAL, LO AUMENTA
        largo = largo + cantidad;
    }

    public String dime_largo() {		//		GETTER
        return "El avion mide de largo " + largo + " metros";
    }

    public void establece_modelo(String modelo) {		//		SETTER
        this.modelo = modelo;
    }

    public String dime_modelo() {		//		GETTER
        return "El modelo del avion es " + modelo;
    }

    public void establece_color(String color) {		//		SETTER
        this.color = color;
    }

    public String dime_color() {		//		GETTER
        return "El color del avion es " + color;
    }

    public void establece_belleza(String bonito) {		//		SETTER
        if(bonito == "si") {
            belleza = true;
        } else {
            belleza = false;
        }
    }

    public String dime_belleza() {		//		GETTER
        if (belleza == true) {
            return "es un avion bonito\n";
        } else {
            return "no es un avion bonito\n";
        }
    }

}
