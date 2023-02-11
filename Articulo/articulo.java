package Articulo;

import java.util.Scanner;

public abstract class articulo {
    //Declaramos las variables necesarias 
    protected String Codigo;
    protected String Nombre;
    protected String Marca;
    protected double precio;
    protected int stock;
        //Creamos el constructor por defecto
        public articulo() {
            
        }
        //Constructor copia
        public articulo ( articulo a) {
            this.Codigo = a.Codigo;
            this.Nombre = a.Nombre;
            this.Marca = a.Marca;
            this.precio = a.precio;
            this.stock = a.stock;
        }
        //Constructor personalizado
        public articulo( String c, String n, String m, double p, int s) {
            this.Codigo= c;
            this.Nombre = n;
            this.Marca = m;
            this.precio = p;
            this.stock = s;
        }
    
    public int sumarStock() {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Cuanto Stock quieres aumentar?");
        n = teclado.nextInt();
        teclado.close();
        return n;
    }
    public int quitarStock() {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Cuanto Stock quieres restar?");
        n = teclado.nextInt();
        teclado.close();
        return n;
    }
    public abstract boolean sano();
    public abstract String printCaracteristicas();
    @Override
    public String toString() {
        return ("Codigo=" + Codigo + ", Nombre=" + Nombre + ", Marca=" + Marca + ", precio=" + precio
                + ", Stock=" + stock );
    }
    //GettersSetters
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String codigo) {
        Codigo = codigo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
