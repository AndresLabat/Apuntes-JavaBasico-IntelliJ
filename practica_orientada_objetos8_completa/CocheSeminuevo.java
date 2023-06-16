package Java_Basico.practica_orientada_objetos8_completa;

public class CocheSeminuevo extends Coche {

    boolean robado;
    public CocheSeminuevo() {

        modelo = "modelo por definir";;
        puertas = 5;
        kilometraje = 0;
        añosDeUso = 0;
        robado = false;
    }

    public CocheSeminuevo(String modelo, int puertas, int kilometraje, int añosDeUso, boolean robado) {
        this.modelo = modelo;
        this.puertas = puertas;
        this.kilometraje = kilometraje;
        this.añosDeUso = añosDeUso;
        if(robado == true){
            System.out.println("El siguiente coche es un coche ROBADO:");
        }

    }

    @Override
    public String toString() {
        return "CocheSeminuevo{" +
                "modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", kilometraje=" + kilometraje +
                ", añosDeUso=" + añosDeUso +
                '}';
    }


}
