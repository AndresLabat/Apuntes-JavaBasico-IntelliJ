package Java_Basico.apuntes;

public class logica_switch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


		/* VAR ESTACION = "VERANO"
		   DISCIERNE (ESTACION)
		   	 CASO "VERANO"
		   		IMPRIME "ES VERANO"

		   	 CASO "INVIERNO"
		   		IMPRIME "ES INVIERNO"

		   	 OTRO CASO:
		   		IMPRIME LA ESTACION DE LA VARIABLE

		 */

        var estacion = "VERANO";	// ESTA ES LA VARIABLE A MODIFICAR

        switch(estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;		// SINO SE PONE UN "BREAK" SIGUE EJECUTANDO HACIA DEBAJO
            case "INVIERNO":
                System.out.println("es invierno");
                break;		// SINO SE PONE UN "BREAK" SIGUE EJECUTANDO HACIA DEBAJO
            default:
                System.out.println(estacion);
                break;		// SINO SE PONE UN "BREAK" SIGUE EJECUTANDO HACIA DEBAJO
        }


        // EJEMPLO 1:

        var hoy_es = "martes";

        switch(hoy_es) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("hoy es laborable");
                break;
            case "sabado":
            case "domingo":
                System.out.println("hoy NO es laborable");
                break;
        }

        //O LO QUE ES LO MISMO:


        var hoy__es = "sabado";

        switch(hoy__es) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("hoy es laborable");
                break;
            default:		// DEFAULT INDICA "PARA EL RESTO DE CASOS"
                System.out.println("hoy NO es laborable");
                break;
        }

    }

}
