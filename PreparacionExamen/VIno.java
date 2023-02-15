package PreparacionExamen;
public class VIno extends Articulo{
    String color;
    String origen;
    int año;
    String uva;

    public VIno(String c, String n, String m, double p, int s, String cc, String o, int a, String u){
        super(c, n, m, p, s);
        this.color = cc;
        this.origen = o;
        this.año = a;
        this.uva = u;
    }

    @Override
    public String printCaracteristicas() {
        return (super.toString()+"Color: " + color+ "\n" + "Origen: "+ origen + "\n" + "Año: "+ año + "\n"+ " Uva" + uva);
    }

    @Override
    public boolean sano() {
        if(origen.equalsIgnoreCase("riojano") || origen.equalsIgnoreCase("rioja")){
            return true;
        }
        else{
            return false;
        }
    }
    
}
