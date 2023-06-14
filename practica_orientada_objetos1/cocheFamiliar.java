package Java_Basico.practica_orientada_objetos1;

public class cocheFamiliar extends coche implements interface_practica {

    // IMPLEMENTACION DE LA INTERFACE (DARLE CUERPO A LOS METODOS IMPLEMENTADOS DE LA INTERFACE)

    @Override
    public void aumentaVelocidad(int velocidad) {
        // TODO Auto-generated method stub
        this.velocidad = this.velocidad + velocidad;
    }

    @Override
    public void cambiaColor(String color) {
        // TODO Auto-generated method stub
        this.color = color;
    }

    // A ESTAS FUNCIONES NI CASO, SON LAS QUE VAN FUERA DEL MAIN DEL LUGAR DONDE INSTANCIO LOS OBJETOS:

    public static void acelera(interface_practica cochefam) {
        cochefam.aumentaVelocidad(20);
    }

    public static void pintalo(interface_practica pinta) {
        pinta.cambiaColor("amarillo");
    }



}
