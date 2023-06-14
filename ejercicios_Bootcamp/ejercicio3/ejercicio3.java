package Java_Basico.ejercicios_Bootcamp.ejercicio3;

public class ejercicio3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

	/*	ENUNCIADO:
		En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
		Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
		String[] nombres = {"", "", "", ""}
	*/

    String[] nombres = {"Andres", "Alberto", "Jose", "Mario"};

		for(String i:nombres) {
        System.out.println("el siguiente nombre es " + i);
    }

    String concatenacion = "";

		for(String i:nombres) {
        concatenacion += i + " ";
    }
			System.out.println(concatenacion);
}

}

