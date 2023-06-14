package Java_Basico.ejercicios_Bootcamp.ejercicio2;

public class ejercicio2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //	ENUNCIADO:
        //	Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        double precioSinIVA = 5;
        double IVA = 1.21;

        double resultado = aplicarIVA(precioSinIVA, IVA);	//	DE ESTA FORMA CONTROLAS TU LA CANTIDAD DE IVA
        System.out.println(resultado);

        double resultado2 = aplicarIVA(precioSinIVA);
        System.out.println(resultado2);

    }

    public static double aplicarIVA(double a, double b) {	//	ESTA ES PARA UNA CANTIDAD DE IVA ESTABLECIDO
        return a * b;
    }

    public static double aplicarIVA(double a) {
        return a * 1.21;
    }

}
