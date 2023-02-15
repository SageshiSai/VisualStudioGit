package PreparacionExamen;

import java.util.ArrayList;

public class Factura {
    int numero;
    String nombre;
    String apellido;
    ArrayList<LineaFactura> lineaFacturas;
    double total;

    public Factura(int n, String nn, String a, ArrayList<LineaFactura> array, double t){
        this.numero = n;
        this.nombre = nn;
        this.apellido = a;
        this.lineaFacturas = array;
        this.total = t;
    }

    public void añadirLineas(String codigo, int cantidad, double total){
        lineaFacturas.add(new LineaFactura(codigo, cantidad, total));
    }

    public void print(){
        System.out.println();
    }
}
