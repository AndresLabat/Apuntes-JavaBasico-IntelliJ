package Java_Basico.ejercicios_varios;

public class practica8_objetos_interfaces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Conejo gorda = new Conejo();

        cuantosHay(gorda);
        gorda.aumentaCantidad(20);
        cualEsSuRaza(gorda);

        System.out.println(gorda.dimeCantidad());
        System.out.println(gorda.dimeNombre());

        Raton raton = new Raton();

        cuantosHay(raton);
        cualEsSuRaza(raton);
        raton.estableceTamaño("grande");

        System.out.println(raton.dimeTamaño());

        Cobaya cobaya = new Cobaya();

        cobaya.estableceTamaño("pequeño");

        System.out.println(cobaya.dimeTamaño());

    }

    public static void cuantosHay(Roedores roedores) {
        roedores.estableceCantidad(10);
    }

    public static void cualEsSuRaza(Roedores roedores) {
        roedores.estableceNombre("super saiyans");
    }

}

interface Roedores{

    void estableceCantidad(int cantidad);
    void estableceNombre(String nombre);

}

class Conejo implements Roedores{

    private int cantidad;
    private String nombreRaza;


    public Conejo() {

        cantidad = 1;
        nombreRaza = "aun por determinar";
        System.out.println("\nCARACTERISTICAS DEL CONEJO:");

    }


    public void estableceCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String dimeCantidad() {
        return "la cantidad que tenemos es " + cantidad;
    }

    public void estableceNombre(String nombre) {
        nombreRaza = nombre;
    }

    public String dimeNombre() {
        return "el nombre de esta raza es " + nombreRaza;
    }

    public void aumentaCantidad(int cantidad) {
        this.cantidad = this.cantidad + cantidad;
    }

}

class Raton implements Roedores{

    private int cantidad;
    private String nombreRaza;
    private String tamaño;


    public Raton() {

        cantidad = 1;
        nombreRaza = "aun por determinar";
        System.out.println("\nCARACTERISTICAS DEL RATON:");

    }


    public void estableceCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void estableceNombre(String nombre) {
        nombreRaza = nombre;
    }

    public void estableceTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String dimeTamaño() {
        return "es de tamaño " + tamaño;
    }

}

class Cobaya extends Raton{

}
