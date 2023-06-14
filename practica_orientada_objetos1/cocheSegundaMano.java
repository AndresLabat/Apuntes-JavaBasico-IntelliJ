package Java_Basico.practica_orientada_objetos1;

public class cocheSegundaMano extends coche{

    // HERENCIA SIMPLE, METODO SUPER, POLIMORFISMO DE CONSTRUCTORES Y METODO TO STRING CON LOS ATRIBUTOS PROPIOS Y HEREDADOS

    int añosDeUso;
    int kilometros;

    public cocheSegundaMano() {

        añosDeUso = 0;
        kilometros = 0;

        System.out.println("ES UN COCHE DE SEGUNDA MANO SIN USAR");

    }

    public cocheSegundaMano(int velocidad, String color, String modelo, int añosDeUso, int kilometros) {

        super(velocidad, color, modelo);
        this.añosDeUso = añosDeUso;
        this.kilometros = kilometros;

        System.out.println("ES UN COCHE DE SEGUNDA MANO USADO");

    }

    @Override
    public String toString() {
        return "cocheSegundaMano [añosDeUso=" + añosDeUso + ", kilometros=" + kilometros + ", velocidad=" + velocidad
                + ", color=" + color + ", modelo=" + modelo + "]";
    }

}

