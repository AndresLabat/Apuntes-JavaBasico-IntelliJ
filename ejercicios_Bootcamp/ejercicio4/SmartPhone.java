package Java_Basico.ejercicios_Bootcamp.ejercicio4;

public class SmartPhone extends SmartDevice {

    String modelo;
    boolean linterna;


    public SmartPhone() {

        color = "color por definir";
        bateria = 0.00;
        marca = "marca por definir";
        modelo = "no se sabe el modelo";
        linterna = false;

    }


    public SmartPhone(String color, Double bateria, String marca, String modelo, boolean linterna) {
        super(color, bateria, marca);
        this.modelo = modelo;
        this.linterna = linterna;
    }


    @Override
    public String toString() {
        return "SmartPhone [modelo=" + modelo + ", linterna=" + linterna + ", color=" + color + ", bateria=" + bateria
                + ", marca=" + marca + "]";
    }


}
