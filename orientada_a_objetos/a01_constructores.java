package Java_Basico.orientada_a_objetos;

public class a01_constructores {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // CREACION DE UNA CLASE, CONSTRUCTORES Y METODO "TOSTRING"

        // CREAMOS DOS OBJETOS, UNO INSTANCIADO CON UN TIPO DE CONSTRUCTOR, Y OTRO CON EL OTRO TIPO DE CONSTRUCTOR

        Coche coche1 = new Coche("amarillo", "Alfa Romeo", "A5", 1145.5, 5.72);
        coche1.acelerar(35);
        System.out.println(coche1);

        Coche coche2 = new Coche();
        coche2.acelerar(35);
        System.out.println(coche2);

    }

}
class Coche{

    // ATRIBUTOS

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    int velocidad;

    // CONSTRUCTORES:

    // AL OBJETO CREADO ASI LE INDICAMOS LOS PARAMETROS INICIALES DENTRO DEL PARENTESIS

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {

        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        velocidad = 0;

        System.out.println("ESTOY EN EL PRIMER CONSTRUCTOR, EL INTERIOR DEL PARENTESIS DEFINE MIS PARAMETROS INICIALES");

    }

    // AL OBJETO CREADO SIN NADA DENTRO DEL PARENTESIS LE ASIGNAMOS ESTOS PARAMETROS INICIALES

    public Coche() {

        color = "azul";
        fabricante = "Renault";
        modelo = "Megane";
        peso = 1128.6;
        largo = 4.5;
        velocidad = 20;

        System.out.println("ESTOY EN EL SEGUNDO CONSTRUCTOR, CON PARAMETROS INICIALES DEFINIDOS");

    }

    // METODOS DE LA CLASE

    public void acelerar(int cantidad) {	//	FUNCION QUE AUMENTA LA VELOCIDAD EN UNA CANTIDAD QUE PONEMOS DENTRO DEL PARENTESIS
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override	//	CLICK DERECHO, SOURCE, TOSTRING Y MARCAMOS TODOS LOS ATRIBUTOS QUE QUEREMOS QUE NOS ENSEÑE CUANDO
    //	HACEMOS EL SYSTEM.OUT.PRINTLN(NOMBREDELOBJETO) QUE HACEMOS EN EL METODO MAIN
    public String toString() {
        return "CocheNuevo [color=" + color + ", fabricante=" + fabricante + ", modelo=" + modelo + ", peso=" + peso
                + ", largo=" + largo + ", velocidad=" + velocidad + "]";
    }

}