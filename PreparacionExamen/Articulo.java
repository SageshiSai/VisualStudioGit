package PreparacionExamen;

public abstract class Articulo {
    String codigo;
    String nombre;
    String marca;
    double precio;
    int stock;


    //Constructor Personalizado
    public Articulo(String c, String n, String m, double p, int s){
        this.codigo = c;
        this.nombre = n;
        this.marca = m;
        this.precio = p;
        this.stock = s;
    }

    public int sumarStock(int sumarNum){
        
        return 0;
    }
    public int quitarStock(int quitarNum){
        return 0;
    }
    public abstract String printCaracteristicas();
    public abstract boolean sano();
    @Override
    
    public String toString() {
        return ("Articulo"+"\n"+"Codigo: " + codigo + "\n"+ "Nombre: "+ nombre + "\n" + "Marca: "+ "\n"+"Precio"+ precio + "\n" + "Stock: "+stock + "\n");
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public double getStock(){
        return stock;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    
}
