package Java_Basico.practica_orientada_objetos4_objeto_dentro_constructor;

public class Motor {

    private String modelo;
    private int cilindros;
    private Double potencia;


    public Motor() {

        modelo = "modelo por definir";
        cilindros = 6;
        potencia = 135.00;

    }


    public Motor(String modelo, int cilindros, Double potencia) {

        this.modelo = modelo;
        this.cilindros = cilindros;
        this.potencia = potencia;
    }


    @Override
    public String toString() {
        return "Motor [modelo=" + modelo + ", cilindros=" + cilindros + ", potencia=" + potencia + "]";
    }

}
