package Java_Basico.practica_orientada_objetos2;

public class VehiculoModificable2 extends Vehiculo implements Interface {

    @Override
    public void modificarPeso(Double peso) {
        // TODO Auto-generated method stub
        this.peso = peso + 1000;
    }

    @Override
    public void modificarTipo(String tipo) {
        // TODO Auto-generated method stub
        this.tipo = tipo + ", aunque no es seguro";
    }

    @Override
    public String toString() {
        return "VehiculoModificable2 [tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + "]";
    }


}