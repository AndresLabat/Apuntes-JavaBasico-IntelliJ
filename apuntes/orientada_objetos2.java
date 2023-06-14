package Java_Basico.apuntes;

public class orientada_objetos2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Furgoneta Renault = new Furgoneta();

        Renault.establece_color("amarillo");  //	esto ha llamado al setter y a modificado el color a "azul"

        System.out.println(Renault.dime_datos_generales());		// accedo al valor a traves del getter

        System.out.println(Renault.dime_color()); // accedo al color del coche con un getter que ha sido modificado con un setter

        Renault.configura_asientos("si");

        System.out.println(Renault.dime_asientos());

    }

}

class Furgoneta {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Furgoneta() {	//	CONSTRUCTOR (DA VALOR A LOS ATRIBUTOS INICIALES)

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;

    }

    public String dime_datos_generales() {	//	GETTER

        return "la plataforma de la furgoneta tiene " + ruedas + " ruedas"
                + ". Mide " + largo/1000 + " metros con un ancho de " + ancho
                + " cm y un peso de plataforma de " + peso_plataforma + " kg";
    }

    public void establece_color(String color_Furgoneta) {		//SETTER
        //	cuando llame a este setter, tengo que darle un parametro, en este caso, un color de furgoneta

        color = color_Furgoneta;
    }

    public String dime_color() {		//GETTER

        return "El color de la furgoneta es " + color;
    }

    public void configura_asientos(String asientos_cuero) {		//	SETTER

        if(asientos_cuero == "si") {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() {		//	GETTER

        if(asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

}

