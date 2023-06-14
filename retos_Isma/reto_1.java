package Java_Basico.retos_Isma;

import java.util.Scanner;

public class reto_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


		/*	COSAS A COMENTAR CON ISMA:

		 * Como no podia transformar de Char a Int directamente, he transformado el Char de una posicion determinada en String,
		   y despues ese String a Int.

		 * Queria hacer para hacer el ejercicio 4 Strings, uno de 4 digitos con la entidad bancaria, otro de 4 digitos con
		   la oficina, otro de 2 con el numero de control, y otro de 10 con el numero de cuenta, pero al convertir el String
		   del numero de cuenta a Int, quedaba un Int de 10 cifras, y no me lo permitia, en vez de dividirlo en 2 Strings de
		   5 digitos, quedandome 4+4+2+5+5, que me parecian muchos Strings, he decidido hacerlo en 3 Strings de 8+8+4.

		 * En el primer numero de control el resultado tambien puede ser 10 o 11, le he puesto la misma limitacion cuando
		   se dan esos casos que al segundo numero de control, si da 10 es 1, y si da 11 es 0.
		   */

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce los 8 primeros numeros de tu CCC y despues dale al INTRO");
        String CCC = sc.nextLine();

        System.out.println("Introduce los 8 siguientes numeros de tu CCC y despues dale al INTRO");
        String CCC2= sc.nextLine();

        System.out.println("Introduce los 4 ultimos numeros de tu CCC y despues dale al INTRO");
        String CCC3= sc.nextLine();

        //	1)	COMPROBACION DE QUE EL CCC INTRODUCIDO TIENE 20 NUMEROS:

        //	Comprobacion de que la longitud total de los String es de 20 (8 + 8 + 4), si no lo es, salta un aviso

        boolean LongitudtotalCCC;

        if (CCC.length() + CCC2.length() + CCC3.length() != 20) {
            LongitudtotalCCC = false;
            System.out.println("este CCC es incorrecto, no tiene 20 digitos");
        } else {
            LongitudtotalCCC = true;
            System.out.println("tiene la longitud correcta, 20 digitos");
        }


        //	2)	COMPROBACION DE QUE TODOS LOS DATOS SEAN NUMEROS:

        //	Aviso de excepcion cuando algun dato introducido no es un numero (int)

        boolean StringToIntCCC;
        boolean StringToIntCCC2;
        boolean StringToIntCCC3;

        try {
            int CCCnum = Integer. parseInt(CCC);
            StringToIntCCC = true;

        } catch(NumberFormatException e) {
            StringToIntCCC = false;
            System.out.println("se han introducido digitos que no son numeros, EXCEPTION tipo: " + e.getMessage());
        }


        try {
            int CCCnum2 = Integer. parseInt(CCC2);
            StringToIntCCC2 = true;

        } catch(NumberFormatException e) {
            StringToIntCCC2 = false;
            System.out.println("se han introducido digitos que no son numeros, EXCEPTION tipo: " + e.getMessage());
        }


        try {
            int CCCnum3 = Integer. parseInt(CCC3);
            StringToIntCCC3 = true;

        } catch(NumberFormatException e) {
            StringToIntCCC3 = false;
            System.out.println("se han introducido digitos que no son numeros, EXCEPTION tipo: " + e.getMessage());
        }

        if(StringToIntCCC == true && StringToIntCCC2 == true && StringToIntCCC3 == true) {
            System.out.println("todos los digitos introducidos son numeros");
        }


        // 	3)	COMPROBACION QUE LOS DIGITOS DE CONTROL SON CORRECTOS:

        //	NUM DE CONTROL 1:

        //	LOS 8 NUMEROS DE LA PRIMERA PARTE DEL CCC (CCC) PARA PODER OPERAR CON ELLOS:

        // char -> String -> Int

        int NumPosicion0 = 0;
        int NumPosicion1 = 0;
        int NumPosicion2 = 0;
        int NumPosicion3 = 0;
        int NumPosicion4 = 0;
        int NumPosicion5 = 0;
        int NumPosicion6 = 0;
        int NumPosicion7 = 0;


        try {
            char Posicion0 = CCC.charAt(0);							//	localizo el char de la posicion 0
            String StringPosicion0 = String.valueOf(Posicion0);		//	transformo el char en un String
            NumPosicion0 = Integer. parseInt(StringPosicion0);		//	transformo el String en un numero

            char Posicion1 = CCC.charAt(1);
            String StringPosicion1 = String.valueOf(Posicion1);
            NumPosicion1 = Integer. parseInt(StringPosicion1);

            char Posicion2 = CCC.charAt(2);
            String StringPosicion2 = String.valueOf(Posicion2);
            NumPosicion2 = Integer. parseInt(StringPosicion2);

            char Posicion3 = CCC.charAt(3);
            String StringPosicion3 = String.valueOf(Posicion3);
            NumPosicion3 = Integer. parseInt(StringPosicion3);

            char Posicion4 = CCC.charAt(4);
            String StringPosicion4 = String.valueOf(Posicion4);
            NumPosicion4 = Integer. parseInt(StringPosicion4);

            char Posicion5 = CCC.charAt(5);
            String StringPosicion5 = String.valueOf(Posicion5);
            NumPosicion5 = Integer. parseInt(StringPosicion5);

            char Posicion6 = CCC.charAt(6);
            String StringPosicion6 = String.valueOf(Posicion6);
            NumPosicion6 = Integer. parseInt(StringPosicion6);

            char Posicion7 = CCC.charAt(7);
            String StringPosicion7 = String.valueOf(Posicion7);
            NumPosicion7 = Integer. parseInt(StringPosicion7);

        }	catch(NumberFormatException e) {			//	excepcion tipo: no reconoce algun elemento como numero
        }	catch(StringIndexOutOfBoundsException e) {}	//	excepcion tipo: al acceder a una posicion del String, no hay nada



		/*	DE LAS 4 PRIMERAS CIFRAS, LA PRIMERA POR 4, LA SEGUNDA POR 8, LA TERCERA POR 5 Y LA CUARTA POR 10, LO SUMAMOS TODO
			Y A LA SUMA LA LLAMAMOS A.
			DE LAS SIGUIENTES 4 CIFRAS, LA PRIMERA POR 9, LA SEGUNDA POR 7, LA TERCERA POR 3 Y LA CUARTA POR 6, LO SUMAMOS TODO
			Y LLAMAMOS A LA SUMA B.
			SUMAMOS A Y B Y CALCULAMOS CUANTO VALE A+B MODULO 11, ES DECIR, DIVIDIMOS A+B ENTRE 11 Y NOS QUEDAMOS CON EL RESTO,
			A ESTE RESTO LE LLAMAMOS C.
			RESTAMOS 11 MENOS C Y ESE ES EL PRIMER DIGITO DE CONTROL.	*/


        int A = (NumPosicion0*4) + (NumPosicion1*8) + (NumPosicion2*5) + (NumPosicion3*10);
        int B = (NumPosicion4*9) + (NumPosicion5*7) + (NumPosicion6*3) + (NumPosicion7*6);
        int C = (A + B)%11;
        int NumControl1Real = 11 - C;	// este es el que debe de ser


        if(NumControl1Real == 10) {
            NumControl1Real = 1;
        }
        if(NumControl1Real == 11) {
            NumControl1Real = 0;
        }


        //	NUM DE CONTROL 2:

        // char -> String -> Int

        int NumPosicion2CCC2 = 0;
        int NumPosicion3CCC2 = 0;
        int NumPosicion4CCC2 = 0;
        int NumPosicion5CCC2 = 0;
        int NumPosicion6CCC2 = 0;
        int NumPosicion7CCC2 = 0;

        int NumPosicion0CCC3 = 0;
        int NumPosicion1CCC3 = 0;
        int NumPosicion2CCC3 = 0;
        int NumPosicion3CCC3 = 0;


        try {
            char Posicion2CCC2 = CCC2.charAt(2);							//	localizo el char de la posicion 2
            String StringPosicion2CCC2 = String.valueOf(Posicion2CCC2);		//	transformo el char en un String
            NumPosicion2CCC2 = Integer. parseInt(StringPosicion2CCC2);		//	transformo el String en un numero

            char Posicion3CCC2 = CCC2.charAt(3);
            String StringPosicion3CCC2 = String.valueOf(Posicion3CCC2);
            NumPosicion3CCC2 = Integer. parseInt(StringPosicion3CCC2);

            char Posicion4CCC2 = CCC2.charAt(4);
            String StringPosicion4CCC2 = String.valueOf(Posicion4CCC2);
            NumPosicion4CCC2 = Integer. parseInt(StringPosicion4CCC2);

            char Posicion5CCC2 = CCC2.charAt(5);
            String StringPosicion5CCC2 = String.valueOf(Posicion5CCC2);
            NumPosicion5CCC2 = Integer. parseInt(StringPosicion5CCC2);

            char Posicion6CCC2 = CCC2.charAt(6);
            String StringPosicion6CCC2 = String.valueOf(Posicion6CCC2);
            NumPosicion6CCC2 = Integer. parseInt(StringPosicion6CCC2);

            char Posicion7CCC2 = CCC2.charAt(7);
            String StringPosicion7CCC2 = String.valueOf(Posicion7CCC2);
            NumPosicion7CCC2 = Integer. parseInt(StringPosicion7CCC2);



            char Posicion0CCC3 = CCC3.charAt(0);
            String StringPosicion0CCC3 = String.valueOf(Posicion0CCC3);
            NumPosicion0CCC3 = Integer. parseInt(StringPosicion0CCC3);

            char Posicion1CCC3 = CCC3.charAt(1);
            String StringPosicion1CCC3 = String.valueOf(Posicion1CCC3);
            NumPosicion1CCC3 = Integer. parseInt(StringPosicion1CCC3);

            char Posicion2CCC3 = CCC3.charAt(2);
            String StringPosicion2CCC3 = String.valueOf(Posicion2CCC3);
            NumPosicion2CCC3 = Integer. parseInt(StringPosicion2CCC3);

            char Posicion3CCC3 = CCC3.charAt(3);
            String StringPosicion3CCC3 = String.valueOf(Posicion3CCC3);
            NumPosicion3CCC3 = Integer. parseInt(StringPosicion3CCC3);

        }	catch(NumberFormatException e) {
        }	catch(StringIndexOutOfBoundsException e) {}


		/*	MULTIPLICAMOS EN ORDEN CADA UNA DE LAS 10 CIFRAS DEL NUMERO DE CUENTA (SON LAS 10 ULTIMAS DEL CCC COMPLETO) POR
			1, 2, 4, 8, 5, 10, 9, 7, 3, 6 Y LOS SUMAMOS TODOS, LO LLAMAREMOS D.
			CALCULAMOS CUANTO VALE D MODULO 11, QUEDANDONOS CON EL RESTO DE DIVIDIR D ENTRE 11, LLAMAMOS A ESE RESTO E.
			AHORA SOLO QUEDA CALCULA 11 MENOS E, SI SALES 10 PONEMOS UN 1, SI NOS SALE 11 PONEMOS UN 0	*/


        int D = (NumPosicion2CCC2*1) + (NumPosicion3CCC2*2) + (NumPosicion4CCC2*4)+ (NumPosicion5CCC2*8)
                + (NumPosicion6CCC2*5) + (NumPosicion7CCC2*10) + (NumPosicion0CCC3*9)+ (NumPosicion1CCC3*7)
                + (NumPosicion2CCC3*3)+ (NumPosicion3CCC3*6);
        int E = D%11;

        int NumControl2Real = 11-E;

        if(NumControl2Real == 10) {
            NumControl2Real = 1;
        }
        if(NumControl2Real == 11) {
            NumControl2Real = 0;
        }


        //	COMPROBAR SI LOS NUMEROS DE CONTROL SON CORRECTOS:

        //	LOS 2 PRIMEROS NUMEROS DE LA SEGUNDA PARTE DEL CCC (CCC2) PARA PODER OPERAR CON ELLOS (LOS DIGITOS DE CONTROL):

        // char -> String -> Int

        int NumControl1 = 0;
        int NumControl2 = 0;

        try {
            char Posicion0CCC2 = CCC2.charAt(0);						//	localizo el char de la posicion 0
            String StringPosicion0CCC2 = String.valueOf(Posicion0CCC2);	//	transformo el char en un String
            NumControl1 = Integer. parseInt(StringPosicion0CCC2);		//	transformo el String en un numero

            char Posicion1CCC2 = CCC2.charAt(1);
            String StringPosicion1CCC2 = String.valueOf(Posicion1CCC2);
            NumControl2 = Integer. parseInt(StringPosicion1CCC2);

        }	catch(NumberFormatException e) {
        }	catch(StringIndexOutOfBoundsException e) {}


        boolean NumControl1Boolean;
        boolean NumControl2Boolean;

        if(NumControl1 == NumControl1Real) {
            NumControl1Boolean = true;
            System.out.println("el primer digito de control es correcto");
        }else {
            NumControl1Boolean = false;
            System.out.println("el primer digito de control es incorrecto, deberia de ser un " + NumControl1Real);
        }

        if(NumControl2 == NumControl2Real) {
            NumControl2Boolean = true;
            System.out.println("el segundo digito de control es correcto");
        }else {
            NumControl2Boolean = false;
            System.out.println("el segundo digito de control es incorrecto, deberia de ser un " + NumControl2Real);
        }


        // 	4)	MENSAJE FINAL:

        if(LongitudtotalCCC == true && StringToIntCCC == true && StringToIntCCC2 == true && StringToIntCCC3 == true
                && NumControl1Boolean == true && NumControl2Boolean == true) {
            System.out.println("\nPOR TODO ESTO, ESTA CUENTA ES CORRECTA");
        } else {
            System.out.println("\nPOR TODO ESTO, ESTA CUENTA NO ES CORRECTA");
        }

    }

}
