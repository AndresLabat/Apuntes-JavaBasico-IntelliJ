package Java_Basico.apuntes;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class salidaDeDatos_PrintStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //	PRINTSTREAM:
        // 	puede imprimir no solo en pantalla, en un fichero, etc

//		PrintStream info = new PrintStream("copia.txt");
//		info.println("hola");
//		info.close();


        //	EJEMPLO DE COMO COPIAR UN FICHERO EN OTRO FICHERO NUEVO:

        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        } catch (Exception e) {
            System.out.println("exception es: " + e.getMessage());
        }


    }

}
