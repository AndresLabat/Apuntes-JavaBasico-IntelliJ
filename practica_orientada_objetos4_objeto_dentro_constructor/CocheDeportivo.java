package Java_Basico.practica_orientada_objetos4_objeto_dentro_constructor;

public class CocheDeportivo extends Coche {

    public CocheDeportivo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public CocheDeportivo(int velocidad, String color, String modelo, Motor motor) {
        super(velocidad, color, modelo, motor);
        // TODO Auto-generated constructor stub
    }

    public CocheDeportivo(int velocidad, String color, String modelo) {
        super(velocidad, color, modelo);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "CocheDeportivo [velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + ", motor=" + motor
                + "]";
    }

}
