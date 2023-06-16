package Java_Basico.practica_orientada_objetos8_completa;

abstract class Coche implements interfaceCoches{

    int velocidad;
    String color;
    String modelo;
    Double peso;
    int puertas;
    int kilometraje;
    int añosDeUso;
    Motor motor;

    public Coche() {

        velocidad = 0;
        color = "color por definir";
        modelo = "modelo por definir";
        peso = 0.00;
        puertas = 5;
        kilometraje = 0;
        añosDeUso = 0;

    }

    public Coche(int velocidad, String color, String modelo, Double peso, int puertas, int kilometraje, int añosDeUso, Motor motor) {
        this.velocidad = velocidad;
        this.color = color;
        this.modelo = modelo;
        this.peso = peso;
        this.puertas = puertas;
        this.kilometraje = kilometraje;
        this.añosDeUso = añosDeUso;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "velocidad=" + velocidad +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", puertas=" + puertas +
                ", kilometraje=" + kilometraje +
                ", añosDeUso=" + añosDeUso +
                ", motor=" + motor +
                '}';
    }

    @Override
    public void estableceColor(String color) {
        this.color = color;
    }

    @Override
    public String dimecolor() {
        return color;
    }

    @Override
    public void estableceVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int dimevelocidad() {
        return velocidad;
    }

    @Override
    public void estableceModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String dimeModelo() {
        return modelo;
    }
}
