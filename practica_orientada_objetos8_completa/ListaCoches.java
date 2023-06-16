package Java_Basico.practica_orientada_objetos8_completa;

import java.util.List;
import java.util.ArrayList;
public class ListaCoches {

    private List<Coche> listaCoches = new ArrayList<>();

    public void añadeCoche(Coche coche){
        listaCoches.add(coche);
    }

    public void borraCoche(Coche coche){
        listaCoches.remove(coche);
    }

    public List<Coche> dimelista(){
        return listaCoches;
    }

    public void dimelistaOrdenada(){ listaCoches.stream().forEach(x -> System.out.println(x)); }


}
