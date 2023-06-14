package Java_Basico.orientada_a_objetos;

public class a10_try_catch_finally {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //	USAMOS ESTE METODO PARA HACER QUE EL PROGRAMA CONTINUE AUN CUANDO PARTE DEL CODIGO DA ERROR,
        //	IDENTIFICANDO EL TIPO DE EXCEPCION:

        int numeroA = 5;
        int nummeroB = 0;


        try {	//	DENTRO DEL TRY METEMOS SIEMPRE EL CODIGO QUE NOS ESTA DANDO PROBLEMAS
            int result = numeroA/nummeroB;	//	ESTO ES LO QUE CAUSA LA EXCEPCION

        } catch (ArithmeticException e) {	//	AQUI LA CONSOLA NOS HA INDICADO EL TIPO DE EXCEPCION Y LO PONEMOS
            //	SI NO SABEMOS EL TIPO DE EXCEPCION, ESCRIBIREMOS DENTRO DEL PARENTESIS
            //	Exception e, QUE NOS RECOGERA TODAS LAS EXCEPCIONES
            System.out.println("bOOm!, excepcion es: " + e.getClass());
            int result = numeroA/1;

        }	catch (Exception e) {			//	SI LA EXCEPCION ES DE OTRO TIPO QUE NO SEA ARITMETICA, SALTARA ESTA EXCEPCION
            System.out.println("bOOm!, esta excepcion no es aritmetica");

        } finally {		//	EL FINALLY SE EJECUTA INDEPENDIENTEMENTE DE SI HA IDO BIEN O DE SI HA IDO MAL
            System.out.println("cierre de recursos");
        }

        System.out.println("por aqui continuaria el resto de codigo");

    }

}
