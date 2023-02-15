package PreparacionExamen;

import java.util.ArrayList;

public class ListarArticulo {
    ArrayList<Articulo> lista = new ArrayList<>();

    public void filldata(){
        lista.add(new Refresco("c1","CocaCola","CocaCola",1.50,400,"Dulce",false,true,100));
        lista.add(new Refresco("f2","Fanta","CocaCola",1.50,400,"Dulce",false,true,50));
        lista.add(new Refresco("a3","Aquarius","CocaCola",1.50,50,"Dulce",false,true,24));
        lista.add(new VIno("l1", "LaGranMentira", "LaVerdad", 4, 400, "tinto", "rioja", 1700, "Mentirius"));
        lista.add(new VIno("l2", "LaGranVerdad", "LosMentirosos", 4, 400, "tinto", "rioja", 1700, "vartia"));
        lista.add(new VIno("l3", "Esperanza", "Desesperanzados", 4, 400, "tinto", "rioja", 1700, "esprira"));

    }

    public ArrayList<Articulo> reponer(){
        ArrayList<Articulo> ListaStock = new ArrayList<>();
        for(Articulo a : lista){
            
            if(a.stock < 50){
                ListaStock.add(a);
            }
            
        }
        return ListaStock;
    }
    public ArrayList<Articulo> mascaro(){
        ArrayList<Articulo> ListaCaro = new ArrayList<>();
        double max = 0;
        for(Articulo a : lista){
            if(max < a.precio){
                max = a.precio;
            }
        }
        for(Articulo a : lista){
            if(max == a.precio){
                ListaCaro.add(a);
            }
        }

        return ListaCaro;
    }
    public ArrayList<Articulo> equivalente(String Codigo){
        ArrayList<Articulo> ListaMismoPrecio = new ArrayList<>();
        double mismo = precio(Codigo);
        for(Articulo a : lista){
            if(a.getPrecio() == mismo){
                ListaMismoPrecio.add(a);
            }
        }
        return ListaMismoPrecio;
    }
    public double precio(String Codigo){
        return precio(Codigo);
    }

    
}
