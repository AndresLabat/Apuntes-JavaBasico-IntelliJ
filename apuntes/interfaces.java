package Java_Basico.apuntes;

public class interfaces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*
		 DEFINICION DE INTERFAZ: CONJUNTO DE DIRECTRICES QUE DEBEN CUMPLIR LAS CLASES

		 LAS INTERFACES SOLO CONTIENEN METODOS ABSTRACTOS, NO TIENEN VARIABLES PERO SI CONSTANTES

		 INTERFACE COCHE
		  	FUNCION ACELERAR(NUMERO CUANTAVELOCIDAD)
		  	FUNCION FRENAR (NUMERO CUANTAVELOCIDAD)
		 */

        Furgonetilla furgona = new Furgonetilla();
        Trailer trailer = new Trailer();

        EjecutaAcelerar(furgona);
        EjecutaAcelerar(furgona);
        EjecutaFrenar(furgona);
        System.out.println(furgona.dimeVelocidad());

        EjecutaAcelerar(trailer);
        EjecutaFrenar(trailer);
        System.out.println(trailer.dimeVelocidad());

    }

    public static void EjecutaAcelerar(VehiculoMotor vehiculo) {	//	EN LUGAR DE DECIRLE DENTRO DEL PARENTESIS EL TIPO DE PARAMETRO "int",
        //	POR EJEMPLO, LE DECIMOS QUE ES DEL TIPO "VehiculoMotor", OSEASE QUE ES
        //	EL DE LA INTERFAZ
        vehiculo.acelerar(25);
    }

    public static void EjecutaFrenar(VehiculoMotor vehiculo) {
        vehiculo.frenar(20);
    }

}

interface VehiculoMotor{		//		INTERFAZ

    void acelerar(int aceleracion);
    void frenar(int deceleracion);

}

class Furgonetilla implements VehiculoMotor{		//		CLASE QUE IMPLEMENTA LOS METODOS DE LA INTERFAZ

    int velocidad;
    String color;
    String modelo;

    public Furgonetilla() {		//		CONSTRUCTOR

        velocidad = 25;

    }

    public void acelerar(int aceleracion) {		//		SETTER
        System.out.println("acelera " + aceleracion);
        velocidad = velocidad + aceleracion;
    }

    public void frenar(int deceleracion) {		//		SETTER
        System.out.println("frena " + deceleracion);
        velocidad = velocidad - deceleracion;
    }

    public String dimeVelocidad() {		//		GETTER
        return "la velocidad actual es " + velocidad;
    }

}

class Trailer extends Furgonetilla implements VehiculoMotor{	//	HEREDA DE LA CLASE FURGONETA E IMPLEMENTA LOS METODOS DE LA INTERFAZ

    public void acelerar(int aceleracion) {
        System.out.println("acelera " + aceleracion);
        velocidad = velocidad + aceleracion;
    }

    public void frenar(int deceleracion) {
        System.out.println("frena " + deceleracion);
        velocidad = velocidad - deceleracion;
    }

}