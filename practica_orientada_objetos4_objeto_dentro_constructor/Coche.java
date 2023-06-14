package Java_Basico.practica_orientada_objetos4_objeto_dentro_constructor;

abstract class Coche {


    int velocidad;
    String color;
    String modelo;

    Motor motor;


    public Coche() {

        velocidad = 0;
        color = "color por definir";
        modelo = "modelo por definir";
    }


    public Coche(int velocidad, String color, String modelo) {
        super();
        this.velocidad = velocidad;
        this.color = color;
        this.modelo = modelo;
    }


    public Coche(int velocidad, String color, String modelo, Motor motor) {
        super();
        this.velocidad = velocidad;
        this.color = color;
        this.modelo = modelo;
        this.motor = motor;
    }


    @Override
    public String toString() {
        return "Coche [velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + ", motor=" + motor + "]";
    }


}