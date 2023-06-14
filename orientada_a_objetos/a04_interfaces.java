package Java_Basico.orientada_a_objetos;

public class a04_interfaces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // CONTINUA CON EL CODIGO Y LAS CLASES DE A1_CONSTRUCTORES y A2_HERENCIA Y A3_POLIMORFISMO:

        // aqui usamos polimorfismo en vez de sobre clases, sobre interfaces, para poder usarlos a posteriori como objetos del mismo tipo:

        CocheService service1 = new CocheServiceClassicImpl();
        Coche coche1 = service1.crearCocheDemo();

        CocheService service2 = new CocheServiceSportImpl();
        Coche coche2 = service2.crearCocheDemo();


    }

}

interface CocheService{

    public Coche crearCocheDemo();	//	ESTA FUNCION EN LUGAR DE TENER UN VOID O UN STRING, TIENE UNA CLASE

    public void destruirCoche(Coche coche);

}

class CocheServiceClassicImpl implements CocheService{

    // para crear esto: CLICK DERECHO, SOURCE, OVERRIDE/IMPLEMENT METHODS...Y SELECCION EL DE LA INTERFACE

    @Override
    public Coche crearCocheDemo() {
        // TODO Auto-generated method stub
        System.out.println("creando coche clasico");
        return new CocheElectrico(); // AQUI MODIFICO EL RETURN, PARA QUE EN LUGAR DE DARME UN NULL, ME DEVUELVA UN NEW COCHELECTRICO()
    }

    @Override
    public void destruirCoche(Coche coche) {
        // TODO Auto-generated method stub
        System.out.println("destruyendo coche");
    }


}

class CocheServiceSportImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        // TODO Auto-generated method stub
        System.out.println("creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        // TODO Auto-generated method stub
        System.out.println("destruyendo coche");
    }

}
