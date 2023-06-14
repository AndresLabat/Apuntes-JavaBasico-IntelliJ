package Java_Basico.practica_orientada_objetos1;

abstract class coche {

    //	CLASE PADRE ABSTRACTA, TO STRING Y POLIMORFISMO DE CONSTRUCTORES

    // atributos (que van fuera del main)

    int velocidad;
    String color;
    String modelo;


    // constructores (que van fuera del main)

    public coche() {

        velocidad = 0;
        color = "color por definir";
        modelo = "modelo por definir";

        System.out.println("VEHICULO SIN ATRIBUTOS INICIALES DEFINIDOS");

    }

    public coche(int velocidad, String color, String modelo) {

        this.velocidad = velocidad;
        this.color = color;
        this.modelo = modelo;

        System.out.println("VEHICULO CON ATRIBUTOS INICIALES DEFINIDOS");
    }

    // funciones (que van fuera del main)

    @Override
    public String toString() {
        return "coche [velocidad=" + velocidad + ", color=" + color + ", modelo=" + modelo + "]";
    }

}

