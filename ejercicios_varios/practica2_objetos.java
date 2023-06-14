package Java_Basico.ejercicios_varios;

public class practica2_objetos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        vehiculo coche1 = new vehiculo();	// USA EL PRIMER CONSTRUCTOR PORQUE NO TIENE DATOS ENTRE EL PARENTESIS

        coche1.sacarRueda();
        coche1.sacarRueda();

        coche1.meterRueda();
        coche1.abrirPuerta();

        coche1.pintar_de_rojo();

        System.out.println("el coche uno tiene " + coche1.puerta + " puertas abiertas, es de color " + coche1.color +
                " y le quedan puestas " + coche1.rueda + " ruedas");

        if(coche1.color == "amarillo") {
            System.out.print("tiene su color original y ");
        } else {
            System.out.print("el color del coche es este porque esta tintado y ");
        }

        if(coche1.puerta == 0) {
            System.out.println("todas las puertas estan cerradas");
        } else if (coche1.puerta >= 1 && coche1.puerta < 4) {
            System.out.println("hay alguna puerta abierta");
        } else
            System.out.println("todas las puertas estan abiertas");

        if(coche1.rueda == 4) {
            System.out.println("OK, el coche puede circular porque tiene todas sus ruedas");
        } else {
            System.out.println("ATENCION, el coche no puede circular, le faltan una o mas ruedas");
        }

        //------------------------------------------------------------------------------------

        vehiculo coche2 = new vehiculo(2, 6);	// USA EL SEGUNDO CONSTRUCTOR PORQUE TIENE DATOS ENTRE EL PARENTESIS

        coche2.sacarRueda();
        coche2.sacarRueda();

        coche2.meterRueda();
        coche2.abrirPuerta();

        coche2.pintar_de_verde();

        System.out.println("el coche dos tiene " + coche2.puerta + " puertas abiertas, es de color " + coche2.color +
                " y le quedan puestas " + coche2.rueda + " ruedas");

    }

}

class vehiculo {

    int puerta;
    int rueda;
    String color;

    public void abrirPuerta(){
        puerta +=1;
    }
    public void cerrarPuerta(){
        puerta -=1;
    }
    public void meterRueda() {
        rueda +=1;
    }
    public void sacarRueda() {
        rueda -=1;
    }
    public void pintar_de_rojo() {
        color = "rojo";
    }
    public void pintar_de_verde() {
        color = "verde";
    }

    //-----------------------------------------------------------------------------------------

    public vehiculo() { 	//	ESTO ES EL PRIMER CONSTRUCTOR:

        rueda = 4;
        color = "amarillo";
        System.out.println("Nuevo vehiculo:");

    }

    public vehiculo(int puerta, int rueda) { 	//	ESTO ES EL SEGUNDO CONSTRUCTOR:
        this.puerta = puerta;	//	el primer puerta es la variable de clase, el segundo el de la funcion, para poder hacerlo usamos this.
        this.rueda = rueda;	//	el primer rueda es la variable de clase, el segundo el de la funcion, para poder hacerlo usamos this.
        System.out.println("Nuevo vehiculo con datos diferentes:");

    }

}
