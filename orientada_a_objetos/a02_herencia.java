package Java_Basico.orientada_a_objetos;

public class a02_herencia {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // HERENCIA DE ATRIBUTOS Y METODOS, PERO TAMBIEN DE CONSTRUCTORES, METODO "SUPER"

        // CONTINUA CON EL CODIGO Y LAS CLASES DE A1_CONSTRUCTORES:

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500.50, 4.99, "TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);	//	EN ESTE CASO, COMO LA FUNCION HA SOBREESCRITO LO QUE HACIA EN LA CLASE PADRE, AHORA ACELERA * 2

        System.out.println(cocheElectrico2);
    }

}

class CocheElectrico extends Coche{

    String motorElectrico;

    public CocheElectrico() {	//	CONSTRUCTOR 1

    }

    public CocheElectrico(String motorElectrico) {	//	CONSTRUCTOR 2

        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) { // CONSTRUCTOR 3
/*
		EN LUGAR DE VOLVER A ESCRIBIR TODO ESTO, QUE YA LO TENIAMOS EN EL CONSTRUCTOR DE LA CLASE COCHE:
		this.color = color;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.peso = peso;
		this.largo = largo;
		velocidad = 0;
		this.motorElectrico = motorElectrico;
		USAREMOS SUPER:
		*/

        super(color, fabricante, modelo, peso, largo);	//	ESTO INVOCA AL CONSTRUCTOR DE LA CLASE PADRE, EN ESTE CASO COCHE
        this.motorElectrico = motorElectrico;

    }

    // A ESTO LE DENOMINAMOS SOBREESCRITURA, YA QUE SUBSTITUIMOS LO QUE HACIA ESTA FUNCION HEREDADA POR LO QUE AHORA HACE:

    @Override	//	CLICK DERECHO, SOURCE, OVERRIDE/IMPLEMENT METHODS... Y MARCAMOS LOS METODOS QUE QUEREMOS SOBREESCRIBIR
    //	HACEMOS EL SYSTEM.OUT.PRINTLN(NOMBREDELOBJETO) QUE HACEMOS EN EL METODO MAIN
    public void acelerar(int cantidad) {
        // TODO Auto-generated method stub
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }


    @Override	//	TO STRING QUE INCLUYE LOS ATRIBUTOS HEREDADOS DE COCHE Y TAMBIEN EL DE COCHE ELECTRICO PORQUE LOS MARCAMOS AL HACERLO
    public String toString() {
        return "CocheElectrico [motorElectrico=" + motorElectrico + ", color=" + color + ", fabricante=" + fabricante
                + ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + ", velocidad=" + velocidad + "]";
    }

}

class CocheHibrido extends Coche {

    String motorHibrido;

}
