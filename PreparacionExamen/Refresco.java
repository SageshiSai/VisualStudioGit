package PreparacionExamen;

public class Refresco extends Articulo {
    String sabor;
    boolean zumo;
    boolean gas;
    int azucar;
    


    //Constrcutor personalizado
    public Refresco(String c, String n, String m, double p, int ss, String s, boolean z, boolean g, int a){
        super(c, n, m, p, ss);
        this.sabor = s;
        this.zumo = z;
        this.gas = g;
        this.azucar = a;
    }



    @Override
    public String printCaracteristicas() {
        return ("Sabor: "+sabor+ "\n" + "Zumo: "+ zumo + "\n" + "Gas: "+ gas + "\n" + "Azucar: "+ azucar);
    }



    @Override
    public boolean sano() {
        return false;
    }

    
}
