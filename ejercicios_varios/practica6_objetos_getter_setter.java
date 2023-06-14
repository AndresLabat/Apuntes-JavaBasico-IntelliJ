package Java_Basico.ejercicios_varios;

public class practica6_objetos_getter_setter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boligrafo boli = new boligrafo();

        System.out.println(boli.dimeInicial());

        boli.estableceCantidad(10);
        boli.aumentarCantidad(5);

        System.out.println(boli.dimeCantidad());

        boli.estableceColor("amarillo");

        System.out.println(boli.dimeColor());

        boli.estableceBelleza("si");

        System.out.println(boli.dimeBelleza());

    }

}

class boligrafo {

    private int longitud;
    private String material;

    private int cantidad;
    private String color;
    private boolean belleza;

    public boligrafo() {

        longitud = 12;
        material = "plastico";
        System.out.println("CARACTERISTICAS DE ESTE BOLI:");

    }

    public String dimeInicial() {	//	GETTER
        return "los bolis son de " + longitud + " cm de largo, y estan hechos de " + material;
    }

    public void estableceCantidad(int cantidad) {	//	SETTER
        this.cantidad = cantidad;
    }

    public void aumentarCantidad(int aumentar) {	//	SETTER
        cantidad = cantidad + aumentar;
    }

    public String dimeCantidad() {		// 	GETTER
        return "la cantidad de boligrafos que tengo es " + cantidad;
    }

    public void estableceColor(String color) {	//	SETTER
        this.color = color;
    }

    public String dimeColor() {		//	GETTER
        return "son de color " + color + " y ademas...";
    }

    public void estableceBelleza(String bonito) {	//	SETTER
        if ( bonito == "si") {
            belleza = true;
        } else {
            belleza = false;
        }
    }

    public String dimeBelleza() {	//	GETTER
        if (belleza == true) {
            return "son bolis bonitos";
        } else {
            return "son bolis feos";
        }
    }

}
