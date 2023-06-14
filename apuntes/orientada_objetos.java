package Java_Basico.apuntes;

public class orientada_objetos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Camion Renault = new Camion();

	/*	Cuando no estaban encapsulados, podiamos hacer esto para llamar al largo y que nos sacara un valor:
		System.out.println("este coche tiene " + Renault.largo + " ruedas.");
		ahora ya no.
	*/

        System.out.println(Renault.dime_largo()); // accedo al valor a traves del getter

        Renault.establece_color();  //	esto ha llamado al setter y a modificado el color a "azul"

        System.out.println(Renault.dime_color()); // accedo al color del coche con un getter que ha sido modificado con un setter

    }

}

class Camion {

    // CREAMOS LOS ATRIBUTOS PRIVADOS PARA NO PODER MODIFICARLOS DESDE EL MAIN
    // ESTAN ENCAPSULADOS.
    // LOS ATRIBUTOS SI PUEDEN SER USADOS Y MODIFICADOS DENTRO DE ESTA MISMA CLASE

    // propiedades comunes a todos los camiones:

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    // propiedades que cambian segun el camion:

    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador; // las declaro asi porque ambas son de tipo boolean



    public Camion() {	//	CONSTRUCTOR (DA VALOR A LOS ATRIBUTOS INICIALES)

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    // un GETTER te da el valor de una propiedad (el que tiene dentro de su clase)
    // SINTAXIS: public tipo_de_dato_a_devolver nombre_metodo(){codigo + return}
    // el "return" indica que nos devuelve un valor

    public String dime_largo() {

        return "El largo del camion es " + largo;
    }

    // un SETTER modifica el valor de una propiedad.
    // SINTAXIS: public void nombre_metodo(){codigo}
    // el "void" indica que el metodo no devuelve ningun valor

    public void establece_color() {

        color = "azul";
    }

    //	como ahora hemos modificado el color, hay que crear un metodo getter para
    //	poder consultar el color desde el main.

    public String dime_color() {

        return "El color del camion es " + color;
    }

}
