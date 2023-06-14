package Java_Basico.practica_orientada_objetos2;

public class VehiculoModificable extends Utilitario implements Interface{

    private int velocidadMaxima;

    public VehiculoModificable() {

        tipo = "coche modificable";
        peso = 1200.00;
        estado = false;
        velocidad = 0;
        velocidadMaxima = 140;

    }

    public VehiculoModificable(String tipo, Double peso, Boolean estado, int velocidad, int velocidadMaxima) {

        super(tipo, peso, estado, velocidad);
        this.velocidadMaxima = velocidadMaxima;

    }


    @Override
    public void modificarPeso(Double peso) {
        // TODO Auto-generated method stub
        this.peso = peso;

    }

    @Override
    public void modificarTipo(String tipo) {
        // TODO Auto-generated method stub
        this.tipo = tipo;

    }

    public void establecerVelocidadMaxima(int velocidadMaxima) {			//		SETTER
        this.velocidadMaxima = velocidadMaxima;
    }

    public String dimeVelocidadMaxima() {									//		GETTER
        return "la velocidad maxima del vehiculo es " + this.velocidadMaxima;
    }


    public void disminuirVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = this.velocidadMaxima - velocidadMaxima;
    }

    @Override
    public String toString() {
        return "VehiculoModificable [velocidadMaxima=" + velocidadMaxima + ", velocidad=" + velocidad + ", tipo=" + tipo
                + ", peso=" + peso + ", estado=" + estado + "]";
    }


}