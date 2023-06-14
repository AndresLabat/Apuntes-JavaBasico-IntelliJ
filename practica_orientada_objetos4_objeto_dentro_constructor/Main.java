package Java_Basico.practica_orientada_objetos4_objeto_dentro_constructor;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //	AQUI INTRODUCIMOS UN OBJETO DENTRO DE CONSTRUCTOR (CREANDO PREVIAMENTE LAS CLASES DE AMBOS OBJETOS)


        Motor motor1 = new Motor();
        Coche coche1 = new CocheDeportivo(180, "blanco", "Renault Megane", motor1);

        System.out.println(coche1);

    }

}

