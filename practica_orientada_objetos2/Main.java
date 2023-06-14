package Java_Basico.practica_orientada_objetos2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Vehiculo vehiculo1 = new Utilitario("cocheFamiliar", 1200.75, true, 50);
        vehiculo1.cambiarEstado(false);
        System.out.println(vehiculo1);

        Utilitario vehiculo2 = new Utilitario();
        vehiculo2.aumentarVelocidad(30);
        vehiculo2.cambiarEstado(true);
        System.out.println(vehiculo2);

        VehiculoModificable vehiculo3 = new VehiculoModificable("coche tipico", 1150.13, true, 50, 200);
        vehiculo3.aumentarVelocidad(20);
        vehiculo3.cambiarEstado(false);
        vehiculo3.establecerVelocidadMaxima(180);
        System.out.println(vehiculo3.dimeVelocidadMaxima());
        vehiculo3.disminuirVelocidadMaxima(20);
        cambiarPeso(vehiculo3);
        cambiarTipo(vehiculo3);
        menosVelocidadMaxima(vehiculo3);
        System.out.println(vehiculo3);

        VehiculoModificable2 vehiculo4 = new VehiculoModificable2();
        cambiarPeso(vehiculo4);
        cambiarTipo(vehiculo4);
        System.out.println(vehiculo4);

        List<VehiculoModificable> VehiculosModificables = new ArrayList<>();

        VehiculosModificables.add(vehiculo3);
        vehiculo3.aumentarVelocidad(20);

        VehiculosModificables.add(new VehiculoModificable("coche de Alba", 2550.05, false, 20, 180));
        VehiculosModificables.add(new VehiculoModificable("coche de Andres", 2320.06, false, 0, 190));
        VehiculosModificables.add(new VehiculoModificable("coche de Papa", 1920.06, true, 0, 220));

        for(VehiculoModificable i:VehiculosModificables) {	//	hago un for de la clase "VehiculoModificable", que recorra
            //	la lista "VehiculosModificables"
            System.out.println(i);
        }

    }

    public static void cambiarPeso(Interface camPeso) {
        camPeso.modificarPeso(1250.75);
    }

    public static void cambiarTipo(Interface camTipo) {
        camTipo.modificarTipo("coche definitivo");
    }

    public static void menosVelocidadMaxima(VehiculoModificable menos) {
        menos.disminuirVelocidadMaxima(10);
    }

}
