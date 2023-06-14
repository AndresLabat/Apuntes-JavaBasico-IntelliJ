package Java_Basico.practica_orientada_objetos6_interfaz_como_baseDeDatos;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpleados implements IntefazEmpleadoCRUD {


    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void save(Empleado empleado) {
        // TODO Auto-generated method stub
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> findAll() {
        // TODO Auto-generated method stub
        return empleados;
    }

    @Override
    public void delete(Empleado empleado) {
        // TODO Auto-generated method stub
        empleados.remove(empleado);
    }

}
