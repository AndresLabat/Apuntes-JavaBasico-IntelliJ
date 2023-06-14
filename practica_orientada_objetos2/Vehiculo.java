package Java_Basico.practica_orientada_objetos2;

abstract class Vehiculo {

    String tipo;
    Double peso;
    Boolean estado;

    public Vehiculo() {

        tipo = "por definir";
        peso = 0.00;
        estado = false;

        if(estado == true) {
            System.out.println("\nES UN COCHE NUEVO");
        }
        if(estado == false) {
            System.out.println("\nNO SABEMOS SI ES UN COCHE NUEVO");
        }

        System.out.println("CARACTERISTICAS DEL VEHICULO DESCONOCIDAS, POR LO TANTO:");

    }

    public Vehiculo(String tipo, Double peso, Boolean estado) {

        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;

        if(estado == true) {
            System.out.println("\nES UN COCHE NUEVO");
        }
        if(estado == false) {
            System.out.println("\nES UN COCHE DE SEGUNDA MANO");
        }

        System.out.println("CARACTERISTICAS DEL VEHICULO:");

    }

    @Override
    public String toString() {
        return "Vehiculo [tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + "]";
    }


    public void cambiarEstado(Boolean estado) {
        this.estado = estado;

        if(estado == true) {
            System.out.println("finalmente, es un coche nuevo");
        }
        if(estado == false) {
            System.out.println("finalmente, no es un coche nuevo");
        }

    }
}