package Java_Basico.practica_orientada_objetos2;

public class Utilitario extends Vehiculo {

    int velocidad;

    public Utilitario() {

        velocidad = 0;
        tipo = "coche";
        peso = 0.00;
        estado = false;

    }

    public Utilitario(String tipo, Double peso, Boolean estado, int velocidad) {

        super(tipo, peso, estado);
        this.velocidad = velocidad;

    }

    @Override
    public String toString() {
        return "Utilitario [velocidad=" + velocidad + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + "]";
    }

    public void aumentarVelocidad(int velocidad) {
        this.velocidad = this.velocidad + velocidad;
    }

}