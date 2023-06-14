package Java_Basico.practica_orientada_objetos5_clase_como_baseDeDatos;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        // guardar empleados
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patricia);
        empleadoCRUD.save(roberto);

        // consultar empleados

        System.out.println(empleadoCRUD.findAll());


    }

}
