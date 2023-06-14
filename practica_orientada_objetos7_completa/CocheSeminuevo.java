package Java_Basico.practica_orientada_objetos7_completa;

public class CocheSeminuevo extends Coche implements InterfazCoches {

    public CocheSeminuevo() {
        super();
        // TODO Auto-generated constructor stub

        color = "color por definir";
        velocidad = 0;
        modelo = "modelo por definir";
        kilometraje = 0;
        añosDeUso = 0;

    }

    public CocheSeminuevo(String color, int velocidad, String modelo, int kilometraje, int añosDeUso) {
        this.color = color;
        this.velocidad = velocidad;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.añosDeUso = añosDeUso;

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


    @Override
    public String toString() {
        return "CocheSeminuevo [color=" + color + ", velocidad=" + velocidad + ", modelo=" + modelo + ", kilometraje="
                + kilometraje + ", añosDeUso=" + añosDeUso + "]";
    }

}
