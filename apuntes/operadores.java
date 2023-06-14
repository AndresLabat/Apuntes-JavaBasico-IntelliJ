package Java_Basico.apuntes;

public class operadores {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // VARIABLES:

        int number1 = 3;		//	4 BYTE
        long number2 = 4;		//	8 BYTE

        float decimal1= 4.9f;	//	AL AÑADIR LA f AL FINAL, LE INDICO QUE ES UN FLOAT
        double decimal2= 5.66d;	//	AL AÑADIR LA d AL FINAL, LE INDICO QUE ES UN DOUBLE

        boolean verdadero = true;
        boolean falso = false;

        String nombre = "Jorge";

        Integer numero = null;	//	PARA CUANDO NECESITAMOS TRABAJAR CON UN DATO QUE AUN NO SABEMOS SU VALOR
        Long numero2 = 2L;		//	ENVOLTORIO PARA UN NUMERO LARGO

        // OPERADORES

        int a=5;
        int b;

        b=7;

        int c=b+a;

        c++; // incrementa el valor en 1
        c+=6; // incrementa el valor en 6
        c-=5; //decrementa el valor en 5


        System.out.println(c);

        double d=5;
        double e=2;

        double f=d/e;

        // la division genera numero decimal, por lo que el tipo
        // de dato que nos da es un double, y los tipos de datos que
        // maneja tambien deben ser double

        System.out.println(f);

        int g=5;

        g=7;  //modifica su valor porque g es una variable

        System.out.println(g);

        // si añadimos a una variable la palabra final se convierte en una constante, no podriamos hacer lo anterior,por ejemplo:

        final int h=8;

        System.out.println(h);

        // podemos anular lineas de codigo sin borrarlas añadiendo // al principio de la linea

        // uso real de una constante, de pulgadas a centimetros, ejemplo:

        final double apulgadas=2.54;

        double cm=6;

        double resultado=cm/apulgadas;

        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");

        // hemos usado el operador concatenar usando el simbolo +
        // variando el valor de cm, nos calcula el resultado en pulgadas

        int operador1, operador2, result;

        operador1=7;
        operador2=8;

        result=operador1+operador2;

        System.out.println(result);


        // en java se pueden declarar multiples variables en una sola linea

        //EJEMPLOS:

        // *importancion de funcion con concatenacion:

        int f4;
        f4=operacion(10, 11, 12);
        System.out.println("el resultado es " + f4);

        // creada en el main con concatenacion:

        int s1,s2,s3;
        s1=10;
        s2=11;
        s3=12;
        s1++;
        s1-=1;

        int s4=s1*s2-s3;

        System.out.println("ahora da " + s4);

        // conversion practica de centimetros a metros:

        final double metros=100;
        double centimetros=4.5;
        double conversion=centimetros/metros;
        System.out.println("En " + centimetros + " centimetros hay " + conversion + " metros");


        // conversion practica de kilometros a metros:


        final double kilometros=1000;
        double metrs=5.3;
        double consola=metrs/kilometros;
        System.out.println("En " + consola + " kilometros hay " + metrs + " metros");

        // en java, si declaramos una variable y no le damos valor, su valor es 0:

        int variable = 0;
        int vari;	//esta tambien es igual a cero, como la anterior

        // APUNTES VARIOS:

        String tu_yo="tu y yo"; // como enunciar un string
        System.out.println(tu_yo + " somos felices");

        System.out.print("hola\n"); //	el \n provoca un salto de linea en la consola (equivalente al ln de println)
        System.out.print("hola\t"); //	el\t provoca un tabulado en la misma linea en la consola
        //  (incluso aunque al escribir el codigo lo escribas en otra linea)

        // EJEMPLO 1:

        System.out.print("hola\n");
        System.out.print("hola\t"); System.out.print("adios");

        // EJEMPLO 2:

        System.out.print("Hola\n");	//	el \n provoca un salto de linea en la consola (equivalente al ln de println)
        System.out.print("Hola\t\t\t"); System.out.print("Hola\n\n"); // tabula 3 veces y luego doble salto de linea
        System.out.print("Adios"); // termina en adios


    }

    // *FUNCION EXTERNA AL MAIN PARA USARLA EN EL EJEMPLO:

    public static int operacion(int f1, int f2, int f3) {
        return f1 * f2 - f3;
    }

    //	"ESTATIC" INDICA QUE SE PUEDE LLAMAR AL MAIN SIN USAR PROGRAMACION ORIENTADA A OBJETOS

}
