package Java_Basico.orientada_a_objetos;

public class a11_throw_throws {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // THROW LO UTILIZO PARA GENERAR UNA EXCEPCION
        // THROWS LO UTILIZO PARA DECLARAR QUE UNA FUNCION DEVUELVE EXCEPCIONES

        try {
            divide(4, 0);
        }	catch (ArithmeticException e) {
            System.out.println("esto no es posible");
        }


    }

    public static int divide(int A, int B) throws ArithmeticException { // el throw le indica que puede devolver ese tipo de excepcion
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }

}
