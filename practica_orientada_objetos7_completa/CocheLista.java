package Java_Basico.practica_orientada_objetos7_completa;

import java.util.ArrayList;
import java.util.List;

public class CocheLista implements InterfazLista {

    private List<Coche> listacoches = new ArrayList<>();

    @Override
    public void save(Coche lista) {
        // TODO Auto-generated method stub
        listacoches.add(lista);
    }

    @Override
    public void delete(Coche lista) {
        // TODO Auto-generated method stub
        listacoches.remove(lista);
    }

    @Override
    public List<Coche> dimeLista() {
        // TODO Auto-generated method stub
        return listacoches;
    }

}
