package Java_Basico.practica_orientada_objetos8_completa;

public class CocheCompleto extends Coche implements interfaceCoches{

    public CocheCompleto() {

        velocidad = 160;
        color = "color por definir";
        modelo = "modelo por definir";
        peso = 1200.00;
        puertas = 5;
        kilometraje = 0;
        añosDeUso = 0;

    }

    public CocheCompleto(int velocidad, String color, String modelo, Double peso, int puertas, int kilometraje, int añosDeUso, Motor motor) {
        super(velocidad, color, modelo, peso, puertas, kilometraje, añosDeUso, motor);
    }

    @Override
    public String toString() {
        return "CocheCompleto{" +
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
        this.color = color + " y es definitivo";
    }

    @Override
    public String dimecolor() {
        return "el color es y siempre sera: " + color;
    }

    @Override
    public void estableceVelocidad(int velocidad) {
        this.velocidad = velocidad * 2;
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
        return "este modelo es: " + modelo;
    }
}


