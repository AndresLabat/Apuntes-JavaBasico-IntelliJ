package Java_Basico.practica_orientada_objetos3_listaDinamica;

public class CocheDeportivo extends Coche implements Interface {

    private int precio;

    public CocheDeportivo() {

        puertas = 3;
        precio = 50000;

    }

    public CocheDeportivo(int velocidad, String color, String modelo, int AñosDeUso, Double kilometraje, int puertas, int precio) {

        super(velocidad, color, modelo, AñosDeUso, kilometraje, puertas);
        this.precio = precio;

    }


    @Override
    public void estableceColor(String color) {
        // TODO Auto-generated method stub
        super.estableceColor("su nuevo color es: " + color + " iridiscente");
    }

    @Override
    public void estableceModelo(String modelo) {
        // TODO Auto-generated method stub
        super.estableceModelo(modelo + ", este modelo supera los 200 caballos");
    }

    @Override
    public String toString() {
        return "CocheDeportivo [precio=" + precio + ", velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo
                + ", AñosDeUso=" + AñosDeUso + ", kilometraje=" + kilometraje + ", puertas=" + puertas + "]";
    }

    public void establecePrecio(int precio) {	//	SETTER
        this.precio = precio;
    }

    public String dimePrecio() {				//	GETTER
        return "el precio de este coche deportivo es " + precio;
    }

}