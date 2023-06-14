package Java_Basico.apuntes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class entradaDeDatos_ImputStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // el FileInputStream es para leer desde fichero:

        try {
            InputStream fichero = new FileInputStream("ruta/del/archivo"); //	esto es para indicarle que fichero leer

            try {
                byte[] datos = fichero.readAllBytes();	//	aqui lo instanciamos

                for(byte dato : datos) {				//	aqui lo recorremos
                    System.out.println((char)dato);		//	con el (char) delante, lo estoy convirtiendo a tipo caracter
                }

            } catch (Exception e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("el programa da error " + e.getMessage());
        }

        //	---------------------------------------------------------------------------

        // BufferInputStream en lugar de con ficheros, trabaja con entradas:

        try {

            InputStream fichero2 = new FileInputStream("ruta/del/archivo");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero2);

        } catch (Exception e) {
            System.out.println("el programa da error " + e.getMessage());
        }


    }

}
