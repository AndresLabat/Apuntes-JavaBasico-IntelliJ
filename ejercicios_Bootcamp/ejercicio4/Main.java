package Java_Basico.ejercicios_Bootcamp.ejercicio4;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*
		En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

		Agregaréis atributos tal cual tendrían esos objetos en la realidad.

		Crear constructor vacío y con todos los parámetros para cada clase.

		Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
		*/

        SmartDevice movil1 = new SmartPhone();
        SmartDevice movil2 = new SmartPhone("plata", 600.00, "Iphone", "7", true);

        SmartDevice reloj1 = new SmartWatch();
        SmartDevice reloj2 = new SmartWatch("negro", 250.00, "xiaomi", "deportivo", "marron");

        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println(reloj1);
        System.out.println(reloj2);

    }

}
