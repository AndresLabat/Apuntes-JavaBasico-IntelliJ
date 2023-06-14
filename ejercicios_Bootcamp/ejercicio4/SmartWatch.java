package Java_Basico.ejercicios_Bootcamp.ejercicio4;

public class SmartWatch extends SmartDevice {

    String tipoDeReloj;
    String colorCorrea;

    public SmartWatch() {

        color = "color por definir";
        bateria = 0.00;
        marca = "marca por definir";
        tipoDeReloj = "no se conoce el tipo de reloj";
        colorCorrea = "negra";

    }

    public SmartWatch(String color, Double bateria, String marca, String tipoDeReloj, String colorCorrea) {
        super(color, bateria, marca);
        this.tipoDeReloj = tipoDeReloj;
        this.colorCorrea = colorCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch [tipoDeReloj=" + tipoDeReloj + ", colorCorrea=" + colorCorrea + ", color=" + color
                + ", bateria=" + bateria + ", marca=" + marca + "]";
    }


}