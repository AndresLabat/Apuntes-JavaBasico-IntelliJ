package Java_Basico.practica_orientada_objetos6_interfaz_como_baseDeDatos;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ListaEmpleados listaEmpleados = new ListaEmpleados();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        listaEmpleados.save(juanito);
        listaEmpleados.save(patricia);
        listaEmpleados.save(roberto);

        System.out.println(listaEmpleados.findAll());

    }


}

