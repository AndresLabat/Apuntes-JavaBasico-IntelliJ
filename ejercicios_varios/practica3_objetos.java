package Java_Basico.ejercicios_varios;

public class practica3_objetos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        movil samsung = new movil();

        samsung.encenderCamara();
        samsung.romperBoton();
        samsung.cambiarColorVerde();

        System.out.println("al movil le quedan sanos " + samsung.botones + " botones");
        System.out.println("actualmente es de color " + samsung.color);
        System.out.println("y tiene la camara " + samsung.camara);

        if(samsung.botones < 4) {
            System.out.print("\nel movil esta roto,");
        } else {
            System.out.print("\nel movil se puede vender,");
        }
        if (samsung.camara == "encendida") {
            System.out.print(" hay que apagar la camara y ");
        } else {
            System.out.print(" la camara esta apagada y ");
        }
        if (samsung.color == "rojo") {
            System.out.print("tiene su color original");
        } else {
            System.out.print("NO tiene su color original, es tintado");
        }

        movil iphone = new movil("encendida", 6, "rojo");


        iphone.apagarCamara();

        System.out.println("al movil le quedan sanos " + iphone.botones + " botones");
        System.out.println("actualmente es de color " + iphone.color);
        System.out.println("y tiene la camara " + iphone.camara);


        if(iphone.botones < 6) {
            System.out.print("\nel movil esta roto,");
        } else {
            System.out.print("\nel movil se puede vender,");
        }
        if (iphone.camara == "encendida") {
            System.out.print(" hay que apagar la camara y ");
        } else {
            System.out.print(" la camara esta apagada y ");
        }
        if (iphone.color == "rojo") {
            System.out.print("tiene su color original");
        } else {
            System.out.print("NO tiene su color original, es tintado");
        }
    }
}

class movil {

    String camara;
    int botones;
    String color;

    public void romperBoton() {
        botones--;
    }

    public void cambiarColorVerde() {
        color = "verde";
    }

    public void encenderCamara () {
        camara = "encendida";
    }

    public void apagarCamara () {
        camara = "apagada";
    }

    public movil () {	//	PRIMER CONSTRUCTOR
        camara = "apagada";
        botones = 4;
        color = "rojo";
        System.out.println("CARACTERISTICAS DEL MOVIL:");
    }

    public movil (String camara, int botones, String color) {	//	SEGUNDO CONSTRUCTOR
        this.camara = camara;
        this.botones = botones;
        this.color = color;
        System.out.println("\n\nCARACTERISTICAS DEL MOVIL:");
    }
}
