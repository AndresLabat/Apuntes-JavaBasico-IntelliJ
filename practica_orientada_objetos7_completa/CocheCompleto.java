package Java_Basico.practica_orientada_objetos7_completa;

public class CocheCompleto extends Coche implements InterfazCoches{

    public CocheCompleto() {

        color = "color por definir";
        velocidad = 0;
        modelo = "modelo por definir";
        kilometraje = 0;
        añosDeUso = 0;
        coste = 00.00;

    }

    public CocheCompleto(String color, int velocidad, String modelo, int kilometraje, int añosDeUso, double coste,
                         Motor motor) {
        super(color, velocidad, modelo, kilometraje, añosDeUso, coste, motor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void estableceColor(String color) {
        // TODO Auto-generated method stub
        this.color = "su nuevo color es " + color;
    }

    @Override
    public void estableceVelocidad(int velocidad) {
        // TODO Auto-generated method stub
        this.velocidad = velocidad;
    }

    @Override
    public void estableceModelo(String modelo) {
        // TODO Auto-generated method stub
        this.modelo = "su nuevo modelo es " + modelo;
    }

    @Override
    public String toString() {
        return "CocheCompleto [color=" + color + ", velocidad=" + velocidad + ", modelo=" + modelo + ", kilometraje="
                + kilometraje + ", añosDeUso=" + añosDeUso + ", coste=" + coste + ", motor=" + motor + "]";
    }

}