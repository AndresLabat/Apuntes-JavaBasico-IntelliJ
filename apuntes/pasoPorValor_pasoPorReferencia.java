package Java_Basico.apuntes;

public class pasoPorValor_pasoPorReferencia {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // EJEMPLO DE PASO POR VALOR:

        int valA = 5;	//	int = 32 bits, = 4 bytes
        int valB = 10;	//	int = 32 bits, = 4 bytes

        resta(valA, valB);	//	AQUI HAY 8 BYTES PORQUE SUMA EL ESPACIO DE MEMORIA DE LOS DOS VALORES

        System.out.println(valA);
        System.out.println(valB);

        // CUANDO USAMOS NEW, OSEASE AL CREAR UN OBJETO, HACEMOS PASO POR REFERENCIA

        Referencia referencia = new Referencia();
        referenciaChanger(referencia);
        referenciaChanger(referencia);

        System.out.println(referencia.velocidad);

        // USO DE LA FUNCION RECURSIVA SUMA +++++++++++

        suma(10, 20);

    }

    // FUNCION CREADA PARA USARLA EN EL MAIN EN EL PASO POR VALOR

    public static int resta(int a, int b) {
        return a - b;
    }

    // FUNCION CREADA PARA USARLA EN EL MAIN EN EL PASO POR REFERENCIA

    public static void referenciaChanger(Referencia refer) {
        refer.velocidad += 50;
    }

    // FUNCION RECURSIVA, ES AQUELLA QUE SE LLAMA A SI MISMA UNA Y OTRA VEZ +++++++++++

    // EJEMPLO COMPLICADO:

    public static int factorial(int numero) {
        int resultado;
        if(numero == 1) {
            return 1;
        }

        resultado = factorial(numero) * numero;
        return resultado;
    }

    // EJEMPLO SIMPLE:

    public static void suma(int a, int b) {
        var temp = a + b;
        System.out.println(" a vale " + a + " b vale " + b + " temp vale " + temp);
        if (b >= 90) {
            return;
        }
        suma(a, temp);
    }

}

    class Referencia{	//	CLASE CREADA PARA USARLA EN EL MAIN EN EL PASO POR REFERENCIA
        int velocidad = 0;
}