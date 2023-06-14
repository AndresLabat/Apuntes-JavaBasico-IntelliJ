package Java_Basico.apuntes;

public class Return {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    var reserva = "restaurante";

		if(reserva == "jenkins") {
        System.out.println("vamos al jenkins");
    } else {
        System.out.println("acabamos en la burguesa");
    }


    // ES LO MISMO:

    var reserva1 = "restaurante";

		if(reserva1 == "jenkins") {
        System.out.println("vamos al jenkins");
        return;
    }
			System.out.println("acabamos en la burguesa");


}

    // EJEMPLO CLARO, he creado la funcion fuera del "main":

    int operacion(String operacion, int a, int b){
        if (operacion == "sumar") {
            return a + b;
        }

        if (operacion == "restar") {
            return a - b;
        }

        return a * b;
    }

	/* Tienes una función operación en lugar de sumar, Entonces le pasas un string que sea que operación tiene que hacer y dos numeros,
	   Como ves hay tres return, solo se pasa por uno de ellos cada vez, Si le dijeses que operación es sumar, te devuelve a+b,si le dices
	   restar pues a-b, Y si no le dices nada los multiplica, Si entra en cualquiera de los if, ejecuta ese return y para, sale de la funcion
	   Return corta la ejecucion de una función
	*/
}

