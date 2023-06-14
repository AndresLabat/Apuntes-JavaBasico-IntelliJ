package Java_Basico.apuntes;

public class metodos_claseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // METODOS DE LOS STRING:


    String mensaje = "   Hola mundo   ";

    //	PARA SABER CUANTOS CARACTERES TIENE EL STRING:
		System.out.println(mensaje.length());

    //	PARA TRANSFORMARLO EN MAYUSCULAS:
    String mensajeMAY = mensaje.toUpperCase();	//	LO ALMACENAMOS EN UNA NUEVA VARIABLE, Y ESTA FUNCION LO TRANSFORMA EN MAYUSCULA
		System.out.println(mensajeMAY);

    //	PARA ELIMINAR LOS ESPACIOS INNECESARIOS:
		System.out.println(mensajeMAY.trim());

    //	PARA COMPARAR Y SABER SI DOS STRINGS SON IGUALES:
    mensajeMAY = mensajeMAY.trim();	//	le elimino primero los espacios innecesarios
    String otro = "HOLA MUNDO";		//	creo otro String para tener dos y poderlos comparar
		if(mensajeMAY.equals(otro)) {	//	NOS COMPARA A VER SI LOS TEXTOS DE "mensajeMAY" Y "otro" SON IGUALES
        System.out.println("verdadero!!");



        //----------------------------------------------------------------------------------------

        String cadena = "Mensaje DE TEXTo";

        //	PARA COMPROBAR SI EL STRING COMIENZA DE UNA MANERA:
        boolean resultado = cadena.startsWith("Men");	//	 EL STRING EMPIEZA DE LA SIGUIENTE MANERA
        if(resultado == true) {
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("(No empieza por lo que quiero");
        }

        //	PARA COMPROBAR SI EL STRING ACABA DE UNA MANERA:
        boolean resultado2 = cadena.endsWith("o");	//	 EL STRING ACABA DE LA SIGUIENTE MANERA
        if(resultado == true) {
            System.out.println("Acaba por lo que estoy buscando");
        } else {
            System.out.println("(No acaba por lo que quiero");
        }

        //	PARA SABER EL CARACTER QUE HAY EN UNA DETERMINADA POSICION:
        char letra = cadena.charAt(0);	//	me dice la letra que se encuentra en la posicion que le indico, en este caso 0
        System.out.println("Caracter es: " + letra);

        //	PARA RECORRER LOS CARACTERES DE UN STRING:
        for(int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }

    }

}

}
