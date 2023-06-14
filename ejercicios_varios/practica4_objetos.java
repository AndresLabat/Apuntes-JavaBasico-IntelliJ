package Java_Basico.ejercicios_varios;

public class practica4_objetos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        estancias casa = new estancias(4, 1, "rojo");

        casa.aumentarHabitaciones();
        casa.aumentarBaños();

        System.out.println("la casa tiene " + casa.habitaciones + " habitaciones de color " + casa.color + " y " + casa.baños + " baños");

        if(casa.color == "rojo") {
            casa.pintarAzul();	//	METODO DENTRO DE LA LOGICA
            System.out.println("pintaremos las habitaciones de " + casa.color);
        } else {
            System.out.println("las habitaciones de quedaran del color que tienen");
        }

    }

}

class estancias {

    int habitaciones;
    int baños;
    String color;

    public void aumentarHabitaciones() {
        habitaciones++;
    }

    public void aumentarBaños() {
        baños++;
    }

    public void pintarBlanco() {
        color = "blanco";
    }

    public void pintarAzul() {
        color = "azul";
    }


    public estancias(int habitaciones, int baños, String color) {	// 	CONTRUCTOR
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.color = color;
        System.out.println("HOGAR:");

    }

}
