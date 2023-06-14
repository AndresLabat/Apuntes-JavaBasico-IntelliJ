package Java_Basico.ejercicios_Bootcamp.ejercicio5;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*
		Crear una interfaz CocheCRUD.
		Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
		Como métodos de CocheCRUD podemos poner:
		save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
		Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

		Ejemplo:
		CocheCRUD cocheCrud = new CocheCRUDImpl()	*/


        CocheCRUDImpl coche = new CocheCRUDImpl();
        coche.Save();
        coche.findAll();
        coche.delete();

        dimeTodo(coche);	//	LLAMADA A LA FUNCION QUE AGRUPA LOS TRES METODOS

    }

    public static void dimeTodo(CocheCRUDImpl coche) {	//	METODO QUE AGRUPA LOS 3 METODOS
        coche.Save();
        coche.findAll();
        coche.delete();
    }
}
