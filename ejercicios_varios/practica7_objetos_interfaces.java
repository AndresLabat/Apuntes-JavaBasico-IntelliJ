package Java_Basico.ejercicios_varios;

public class practica7_objetos_interfaces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BoligrafoNuevo boli = new BoligrafoNuevo();

        substituirColor(boli);
        System.out.println(boli.dimeColor());
        cambiarCantidad(boli);
        System.out.println(boli.dimeCantidad());
        boli.EstableceMarca("Stadler");
        System.out.println(boli.dimeMarca());

        Lapices lapices = new Lapices();

        System.out.println(lapices.dimeColor());
        cambiarCantidad(lapices);
        cambiarCantidad(lapices);
        cambiarCantidad(lapices);
        System.out.println(lapices.dimeCantidad());
        lapices.EstableceMarca("Pino");
        System.out.println(lapices.dimeMarca());
        lapices.estableceEstado("nuevo");
        System.out.println(lapices.dimeEstado());

    }

    public static void substituirColor(Utensilios utensilios) {
        utensilios.CambiarColor("amarillo");
    }

    public static void cambiarCantidad(Utensilios utensilios) {
        utensilios.AumentarCantidad(5);
    }

}

interface Utensilios{

    void CambiarColor(String color);
    void AumentarCantidad(int cantidad);

}

class BoligrafoNuevo implements Utensilios{		//		CLASE QUE IMPLEMENTA LA INTERFACE

    String color;
    int cantidad;
    String marca;

    public BoligrafoNuevo() {		//		CONSTRUCTOR

        color = "aun por definir";
        cantidad = 1;
        marca = "sin marca";

        System.out.println("\nCARACTERISTICAS DE UN NUEVO UTENSILIO:");

    }

    public void CambiarColor(String color) {		//		SETTER DE LA INTERFACE AL QUE LE DAMOS UNA FUNCION CONCRETA
        this.color = "nada menos que " + color;
    }

    public void AumentarCantidad(int aumentoCantidad) {		//		SETTER DE LA INTERFACE AL QUE LE DAMOS UNA FUNCION CONCRETA
        this.cantidad = cantidad + aumentoCantidad;
    }

    public void EstableceMarca(String marca) {		//		SETTER PROPIO DE ESTA CLASE
        this.marca = marca;
    }

    public String dimeColor() {
        return "el color de este utensilio es: " + color;		//		GETTER
    }

    public String dimeCantidad() {		//		GETTER
        return "la cantidad actual de este tipo de utensilios es " + cantidad;
    }

    public String dimeMarca() {		//		GETTER
        return "la marca de estos utensilios es " + marca;
    }
}

class Lapices extends BoligrafoNuevo implements Utensilios{		//		CLASE QUE HEREDA DE LA ANTERIOR E IMPLEMENTA LA INTERFAZ

    boolean estado;

    public void estableceEstado(String estado) {
        if(estado == "nuevo") {
            this.estado = true;
        } else{
            this.estado = false;
        }
    }

    public String dimeEstado() {
        if(this.estado == true) {
            return "El estado de estos utensilios es NUEVO";
        } else {
            return "no estan nuevos";
        }

    }
}

