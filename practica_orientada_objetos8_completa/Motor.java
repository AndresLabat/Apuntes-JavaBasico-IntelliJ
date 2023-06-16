package Java_Basico.practica_orientada_objetos8_completa;

public class Motor {

    int caballos;
    int cilindros;
    String modelo;

public Motor(){

    caballos = 100;
    cilindros = 8;
    modelo = "TDI";
}

    public Motor(int caballos, int cilindros, String modelo) {
        this.caballos = caballos;
        this.cilindros = cilindros;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "caballos=" + caballos +
                ", cilindros=" + cilindros +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
