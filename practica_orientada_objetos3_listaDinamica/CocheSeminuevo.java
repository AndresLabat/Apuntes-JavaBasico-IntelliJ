package Java_Basico.practica_orientada_objetos3_listaDinamica;

public class CocheSeminuevo extends Coche implements Interface {

    public CocheSeminuevo() {

        AñosDeUso = 1;
        kilometraje = 20000.00;

    }

    public CocheSeminuevo(int velocidad, String color, String modelo, int AñosDeUso, Double kilometraje, int puertas) {

        super(velocidad, color, modelo, AñosDeUso, kilometraje, puertas);

    }

    @Override
    public void estableVelocidad(int velocidad) {
        // TODO Auto-generated method stub
        super.estableVelocidad(velocidad-20);
    }

    @Override
    public void estableceColor(String color) {
        // TODO Auto-generated method stub
        super.estableceColor("el nuevo color es: " + color);
    }

    @Override
    public void estableceModelo(String modelo) {
        // TODO Auto-generated method stub
        super.estableceModelo("el nuevo modelo es: " + modelo);
    }

    @Override
    public String toString() {
        return "CocheSeminuevo [velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + ", AñosDeUso="
                + AñosDeUso + ", kilometraje=" + kilometraje + ", puertas=" + puertas + "]";
    }



}