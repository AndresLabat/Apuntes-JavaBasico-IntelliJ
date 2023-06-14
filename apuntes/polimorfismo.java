package Java_Basico.apuntes;

public class polimorfismo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*
		EL POLIMORFISMO CONSISTE EN HEREDAR UNA FUNCION DE UNA CLASE Y HACER QUE HAGA OTRA COSA

		CLASE VEHICULO
			PRIVADA VELOCIDADMAXIMA

			FUNCION diHola()
				IMPRIME "hola"

		CLASE COCHE HEREDA DE VEHICULO
			(heredada) VELOCIDAD MAXIMA

			(heredada PERO LA SOBREESCRIBO) FUNCION diHola()
				IMPRIME "soy un robot y se contar del 1 al 10"
		*/

        Vehicle vehiculo = new Vehicle();
        vehiculo.diHola();

        VehicleCoche coche = new VehicleCoche();
        coche.diHola();

        coche.sumaNumeros(3, 5);
        coche.sumaNumeros((float)5, (float)6);
        coche.sumaNumeros(2.3, 3.5);

    }

}


class Vehicle{

    public void diHola() {
        System.out.println("Hola!!");
    }
}

class VehicleCoche extends Vehicle{

    public void diHola() {
        System.out.println("soy un coche");
    }

    // TAMBIEN SE PUEDE APLICAR EL POLIMORFISMO DENTRO DE UNA MISMA CLASE, EJEMPLO:

    public int sumaNumeros(int a, int b) {
        System.out.println("soy el sumanumero de INT");
        return a + b;
    }

    public float sumaNumeros(float a, float b) {
        System.out.println("soy el sumanumero de FLOAT");
        return a + b * (float)9.0;
    }

    public void sumaNumeros(double a, double b) {
        System.out.println("soy el sumanumero de DOUBLE");
        System.out.println("el resultado es: " + (a + b));
    }
}