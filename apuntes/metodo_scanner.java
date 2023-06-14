package Java_Basico.apuntes;

import java.util.Scanner; // necesito traerme esta libreria (invocarla porque ya existe en eclipse) para poder introducir datos en la consola
// las librerias se importan siempre antes de la main class.

public class metodo_scanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // METODO SCANNER:

        Scanner sc=new Scanner(System.in); // es necesario inicializar Scanner como variable para poder utilizarla mas adelante

        System.out.println("dame un numero");

        double var1 = sc.nextDouble();

        System.out.println("dame otro numero");

        int var2 = sc.nextInt();

        System.out.println(var1 + var2);

		/*
		Diferentes tipos de variables para Scanner:

		boolean nextBoolean()
		Lee valores lógicos boléanos (true or false) introducidos por el usuario.

		byte nextByte()
		Lee valores byte introducidos por el usuario.

		double nextDouble()
		Lee valores double introducidos por el usuario.

		float nextFloat()
		Lee valores float introducidos por el usuario.

		int nextInt()
		Lee valores int introducidos por el usuario.

		String nextLine()
		Lee valores String introducidos por el usuario.

		long nextLong()
		Lee valores long introducidos por el usuario.

		short nextShort()
		Lee valores short introducidos por el usuario.*/

        //	EJEMPLO:

        boolean ok = false;
        do {
            System.out.print("Mete dos numeros: ");
            Scanner scanner=new Scanner(System.in);
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
            } catch(Exception e) {
                System.out.println("numeros invalidos");
            }

        }while (!ok);



    }

}