package Java_Basico.practica_orientada_objetos5_clase_como_baseDeDatos;

import java.util.ArrayList;
import java.util.List;

/** SIGNIFICADO DE CRUD:
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */

public class EmpleadoCRUD {

    // ESTA CLASE TIENE COMO FUNCION SER LA BASE DE DATOS DE LA CLASE EMPLEADO

    // METODO PARA GUARDAR EMPLEADOS

    // estructura de datos
    private List<Empleado> empleados = new ArrayList<>();


    // OPERACIONES CRUD

    //	CREATE - guardar empleado
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> findAll() {
        return empleados;
    }

}
