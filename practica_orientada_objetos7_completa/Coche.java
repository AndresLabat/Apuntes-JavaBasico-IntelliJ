package Java_Basico.practica_orientada_objetos7_completa;

abstract class Coche implements InterfazCoches {

    String color;
    int velocidad;
    String modelo;

    int kilometraje;
    int añosDeUso;

    double coste;

    Motor motor;


    public Coche() {}

    public Coche(String color, int velocidad, String modelo, int kilometraje, int añosDeUso, double coste,
                 Motor motor) {
        super();
        this.color = color;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.añosDeUso = añosDeUso;
        this.coste = coste;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche [color=" + color + ", velocidad=" + velocidad + ", modelo=" + modelo + ", kilometraje="
                + kilometraje + ", añosDeUso=" + añosDeUso + ", coste=" + coste + "]";
    }

    @Override
    public void estableceColor(String color) {
        // TODO Auto-generated method stub
        this.color = color;
    }

    @Override
    public void estableceVelocidad(int velocidad) {
        // TODO Auto-generated method stub
        this.velocidad = velocidad;
    }

    @Override
    public void estableceModelo(String modelo) {
        // TODO Auto-generated method stub
        this.modelo = modelo;
    }

}