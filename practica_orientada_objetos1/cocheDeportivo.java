package Java_Basico.practica_orientada_objetos1;

public class cocheDeportivo extends coche{

    // ATRIBUTO PRIVADO, GETTERS Y SETTERS

    private int velocidadMaxima;

    public cocheDeportivo(int velocidad, String color, String modelo, int velocidadMaxima) {

        super(velocidad, color, modelo);
        this.velocidadMaxima = velocidadMaxima;
    }


    public void estableceVelocidadMaxima(int velocidadMaxima) {		//		SETTER
        this.velocidadMaxima = velocidadMaxima;
    }


    public String dimeVelocidadMaxima() {		//		GETTER
        return "la velocidad maxima de este coche es " + velocidadMaxima;
    }


    @Override
    public String toString() {
        return "cocheDeportivo [velocidadMaxima=" + velocidadMaxima + ", velocidad=" + velocidad + ", color=" + color
                + ", modelo=" + modelo + "]";
    }

}

