package Java_Basico.apuntes;

public class metodo_math {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // CLASE MATH:
        // - math.sqrt(n): raiz cuadrada de un numero
        // - math.pow(base, exponente): potencia, base y exponente son doubles
        // - math.round(decimal): redondeo de un numero
        // - math.PI: constante de clase con el numero PI
        // - math.random: me da un numero random


        //COMO GENERAR UN NUMERO ALEATORIO DE TIPO INT, CON UN RANGO MAXIMO DE 20:

        int prueba = 0; //	GUARDAMOS LA VARIABLE
        prueba=(int) (Math.random() * 20); 	// PONEMOS EL *20 PARA INDICARLE EL RANGO MAXIMO (NO PUEDE SALIR MAS DE 20)
        System.out.println(prueba);


        // ejemplo del uso del metodo math.sqrt(n)

        double raiz=Math.sqrt(9);

        System.out.print(raiz);

    }

}
