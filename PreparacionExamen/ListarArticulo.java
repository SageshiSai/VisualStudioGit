package PreparacionExamen;

import java.util.ArrayList;

public class ListarArticulo {
    ArrayList<Articulo> lista = new ArrayList<>();

    public void filldata(){
        lista.add(new Refresco("c1","CocaCola","CocaCola",1.50,400,"Dulce",false,true,100));
        lista.add(new Refresco("f2","Fanta","CocaCola",1.50,400,"Dulce",false,true,50));
        lista.add(new Refresco("a3","Aquarius","CocaCola",1.50,400,"Dulce",false,true,24));

    }

    public ArrayList<Articulo> reponer(){
        return reponer();
    }
    public ArrayList<Articulo> mascaro(){
        return mascaro();
    }
    public ArrayList<Articulo> equivalente(String Codigo){
        return equivalente(Codigo);
    }
    public double precio(String Codigo){
        return precio(Codigo);
    }

    
}
