package Java_Basico.practica_orientada_objetos8_completa;

public class CocheUtilitario extends Coche implements interfaceCoches{

    public CocheUtilitario() {

        velocidad = 0;
        color = "color por definir";
        modelo = "modelo por definir";
        peso = 0.00;
        puertas = 5;

    }

    public CocheUtilitario(int velocidad, String color, String modelo, Double peso, int puertas) {
        this.velocidad = velocidad;
        this.color = color;
        this.modelo = modelo;
        this.peso = peso;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "CocheUtilitario{" +
                "velocidad=" + velocidad +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", puertas=" + puertas +
                '}';
    }

    @Override
    public void estableceColor(String color) {
        this.color = color;
    }

    @Override
    public String dimecolor() {
        return "el color es: " + color;
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
        return "el modelo es: " + modelo;
    }
}
