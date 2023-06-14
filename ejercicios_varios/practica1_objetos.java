package Java_Basico.ejercicios_varios;

public class practica1_objetos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Juguete señorPatata = new Juguete();
        System.out.println(señorPatata.ojosPatata);
        señorPatata.sacarojos();
        System.out.println(señorPatata.ojosPatata);
        señorPatata.quitarPierna();
        System.out.println(señorPatata.piernasPatata);
        señorPatata.añadirbrazos();
        System.out.println(señorPatata.brazosPatata);

        System.out.println("al señor patata le quedan " + señorPatata.piernasPatata + " piernas,"
                + señorPatata.ojosPatata + " ojos y " + señorPatata.brazosPatata + " brazos");

        señorPatata.añadirbrazos();
        señorPatata.añadirbrazos();
        señorPatata.quitarPierna();
        señorPatata.sacarojos();

        System.out.println("ahora, al señor patata le quedan " + señorPatata.piernasPatata + " piernas,"
                + señorPatata.ojosPatata + " ojos y " + señorPatata.brazosPatata + " brazos");

        if(señorPatata.ojosPatata <= 0) {
            System.out.println("esto no es posible, solo se le pueden quitar 2 ojos");
        } else {
            System.out.println("aun le quedan ojos");
        }

    }
}

class Juguete {

    int ojosPatata;
    int brazosPatata;
    int piernasPatata;

    public void quitarPierna() {
        piernasPatata -= 1;
    }

    public void añadirbrazos() {
        brazosPatata += 1;
    }

    public void sacarojos() {
        ojosPatata -= 2;
    }

    // CONTRUCTOR:

    public Juguete() {

        ojosPatata = 2;
        brazosPatata = 2;
        piernasPatata = 2;

        System.out.println("estoy en el constructor");

    }

}
