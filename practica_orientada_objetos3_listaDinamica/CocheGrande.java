package Java_Basico.practica_orientada_objetos3_listaDinamica;

public class CocheGrande extends Coche implements Interface {

    public CocheGrande() {

        puertas = 7;

    }

    public CocheGrande(int velocidad, String color, String modelo, int AñosDeUso, Double kilometraje, int puertas) {

        super(velocidad, color, modelo, AñosDeUso, kilometraje, puertas);

    }

    @Override
    public String toString() {
        return "CocheGrande [velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + ", AñosDeUso="
                + AñosDeUso + ", kilometraje=" + kilometraje + ", puertas=" + puertas + "]";
    }

}