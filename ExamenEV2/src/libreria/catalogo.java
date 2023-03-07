package libreria;

import java.util.ArrayList;

public class catalogo {
    ArrayList<publicacion> lista = new ArrayList<>();

    public void fillData(){
        lista.add(new libro("l1", "Pájaros a golpes", 1997, 30));
        lista.add(new libro("l2", "123", 2000, 40));
        lista.add(new libro("l3", "Nada", 1897, 50));
        lista.add(new libro("l4", "Caperucita Roja", 1997, 40));
        lista.add(new revista("r1", "El mundo", 2020, 1));
        lista.add(new revista("r2", "El mundo", 2020, 2));
        lista.add(new revista("r3", "Historia", 2020, 1));
        lista.add(new revista("r4", "Animales", 2020, 1));
    }

    public int posicionPublicacion(String Codigo){
        int posicion = 0;
        for(publicacion p : lista){
            if(p.codigo.equals(Codigo)){
                posicion = lista.indexOf(p);
            }
        }
        return posicion;
    }
}
