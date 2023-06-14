package Java_Basico.practica_orientada_objetos3_listaDinamica;

abstract class Coche implements Interface{

    int velocidad;
    String color;
    String modelo;

    int AñosDeUso;
    Double kilometraje;

    int puertas;

    public Coche() {

        velocidad = 0;
        color = "color por definir";
        modelo = "modelo por definir";
        AñosDeUso = 0;
        kilometraje = 0.00;
        puertas = 5;
    }


    public Coche(int velocidad, String color, String modelo, int AñosDeUso, Double kilometraje, int puertas) {

        this.velocidad=velocidad;
        this.color=color;
        this.modelo=modelo;
        this.AñosDeUso=AñosDeUso;
        this.kilometraje=kilometraje;
        this.puertas=puertas;

    }


    @Override
    public String toString() {
        return "Coche [velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + ", AñosDeUso=" + AñosDeUso
                + ", kilometraje=" + kilometraje + ", puertas=" + puertas + "]";
    }


    @Override
    public void estableVelocidad(int velocidad) {
        // TODO Auto-generated method stub
        this.velocidad = velocidad;
    }


    @Override
    public void estableceColor(String color) {
        // TODO Auto-generated method stub
        this.color = color;
    }


    @Override
    public void estableceModelo(String modelo) {
        // TODO Auto-generated method stub
        this.modelo = modelo;
    }


}