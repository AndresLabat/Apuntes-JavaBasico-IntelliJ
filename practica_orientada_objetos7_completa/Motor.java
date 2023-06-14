package Java_Basico.practica_orientada_objetos7_completa;

public class Motor {

    String modeloMotor;
    int cilindros;
    Double potencia;

    public Motor(String modeloMotor, int cilindros, Double potencia) {
        super();
        this.modeloMotor = modeloMotor;
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    public Motor() {

        modeloMotor = "modelo de motor por definir";
        cilindros = 6;
        potencia = 135.00;

    }

    @Override
    public String toString() {
        return "Motor [modeloMotor=" + modeloMotor + ", cilindros=" + cilindros + ", potencia=" + potencia + "]";
    }


}
