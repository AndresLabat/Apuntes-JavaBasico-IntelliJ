package Java_Basico.practica_orientada_objetos1;

public class cocheCompleto extends cocheSegundaMano implements interface_practica {

    // ATRIBUTO PRIVADO, IMPLEMENTACION DE LA INTERFACE, METODO TO STRING, POLIMORFISMO DE CONSTRUCTORES, METODO SUPER,
    // FUNCION PROPIA, GETTERS Y SETTERS

    private int cantidad;

    public cocheCompleto() {

        velocidad = 0;
        color = "color por definir";
        modelo = "modelo por definir";
        añosDeUso = 0;
        kilometros = 0;
        cantidad = 1;

        System.out.println("VEHICULO COMPLETO SIN ATRIBUTOS INICIALES DEFINIDOS");

    }

    public cocheCompleto(int velocidad, String color, String modelo, int añosDeUso, int kilometros, int cantidad) {

        super(velocidad, color, modelo, añosDeUso, kilometros);
        this.cantidad = cantidad;

        System.out.println("VEHICULO COMPLETO CON ATRIBUTOS INICIALES DEFINIDOS");

    }

    public void estableceCantidad(int cantidad) {		//		SETTER
        this.cantidad = cantidad;
    }

    public String dimeCantidad() {						//		GETTER
        return "la cantidad actual es " + cantidad;
    }

    public void aumentaCantidad(int cantidad) {
        this.cantidad = this.cantidad + cantidad;
    }


    @Override
    public void aumentaVelocidad(int velocidad) {
        // TODO Auto-generated method stub
        this.velocidad = this.velocidad + velocidad*2;
    }

    @Override
    public void cambiaColor(String color) {
        // TODO Auto-generated method stub
        this.color = color;
        System.out.println("el nuevo color es " + color);
    }

    @Override
    public String toString() {
        return "cocheCompleto [cantidad=" + cantidad + ", añosDeUso=" + añosDeUso + ", kilometros=" + kilometros
                + ", velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + "]";
    }


}
