package PreparacionExamen;

import java.util.ArrayList;

public class Factura implements Facturacion{
    int numero;
    String nombre;
    String apellido;
    ArrayList<LineaFactura> lineaFacturas;
    double total;

    public Factura(int n, String nn, String a, ArrayList<LineaFactura> array){
        this.numero = n;
        this.nombre = nn;
        this.apellido = a;
        this.lineaFacturas = array;
    }

    public void añadirLineas(String codigo, int cantidad, double total){
        lineaFacturas.add(new LineaFactura(codigo, cantidad, total));
    }

    public void print(){
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println("Numero" + numero);
        System.out.println("Nombre" + nombre);
        System.out.println("Apellido" + apellido);
        for(LineaFactura l: lineaFacturas){
            System.out.println(l);
        }
        System.out.println(calcularTotal());
        System.out.println("*******************************************************");
        System.out.println();
        System.out.println();

    }

    @Override
    public double calcularTotal() {
        double totalLinea= 0;
        for(int posicion = 0; posicion < lineaFacturas.size(); posicion ++){
            totalLinea += lineaFacturas.get(posicion).totalLinea;
        }
        double total = totalLinea + (totalLinea * IVA); 
    return total;  
    }
    
}
