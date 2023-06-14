package Java_Basico.apuntes;

public class logica_if_else {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // LOGICAS:
        // "Y" &&
        // "O" || (SE PONE PULSANDO ALT+1)

        // COMPARATIVAS:
        // "MAYOR QUE" >
        // "MENOR QUE" <
        // "MAYOR O IGUAL QUE" >=
        // "MENOR O IGUAL QUE" <=
        // "IGUAL A" ==
        // "DISTINTO A" !=

        // 40 MAYOR QUE 30 => CIERTO
        // 40 MENOR QUE 30 => FALSO
        // (40 MAYOR QUE 30) Y (30 MENOR QUE 50)
        //	^^^^^^^^^^^^^^^^ Y ^^^^^^^^^^^^^^^^^
        //			SI		 Y 			SI
        //					 SI

        // (40 MAYOR QUE 30) O (30 MENOR QUE 50)
        //	^^^^^^^^^^^^^^^^ O ^^^^^^^^^^^^^^^^^
        //			SI		 O 			SI
        //					 SI

        // VAR ESTACION = "VERANO"
        // VAR TEMPERATURA = 19

//			SI (ESTACION IGUAL A "VERANO") Y (TEMPERATURA MAYOR QUE 20) ENTONCES
//				AQUI LAS ACCIONES A TOMAR (EN ESTA LINEA)
//				BEBER_AGUA()
//				BAÑARSE_EN_LA_PISCINA()
//				TOMARSE_UN_MOJITO()
//				IRSE_AL_BAR()

        // ESTO NO SE EJECUTARIA PORQUE LA TEMPERATURA NO ES MAYOR QUE 20


//			SI (ESTACION IGUAL A "VERANO")		"if"
//				AQUI LAS ACCIONES A TOMAR (EN ESTA LINEA)
//				BEBER_AGUA()
//				BAÑARSE_EN_LA_PISCINA()
//				TOMARSE_UN_MOJITO()
//				IRSE_AL_BAR()

//			EN CASO CONTRARIO SI (ESTACION IGUAL A "PRIMAVERA") ENTONCES		"else if"
//				SALIR_DE_PASEO()
//				IR_A_VER_A_LOS_AMIGOS()

//			EN CASO CONTRARIO ENTONCES:			"else"
//				PONERSE_EL_ABRIGO()
//				BEBER_CHOCOLATE_CALIENTE()
//		 		VER_LA_TELE()

        // EJEMPLOS:

        var estacion = "primavera"; // dependiento de lo que pongamos aqui varia el resultado

        if (estacion == "primavera") {
            System.out.println(" es primavera");
        } else if (estacion == "verano") {
            System.out.println(" es verano");
        } else {
            System.out.println("es otra estacion...");
        }

    }

}