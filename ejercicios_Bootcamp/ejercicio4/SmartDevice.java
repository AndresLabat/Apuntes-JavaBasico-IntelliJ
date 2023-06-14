package Java_Basico.ejercicios_Bootcamp.ejercicio4;

abstract class SmartDevice {

    String color;
    Double bateria;
    String marca;


    public SmartDevice() {

        color = "color por definir";
        bateria = 0.00;
        marca = "marca por definir";

    }


    public SmartDevice(String color, Double bateria, String marca) {
        super();
        this.color = color;
        this.bateria = bateria;
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "SmartDevice [color=" + color + ", bateria=" + bateria + ", marca=" + marca + "]";
    }


}
