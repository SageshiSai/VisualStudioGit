package Objectos;

import java.util.Objects;

public class Complejo implements Comparable<Complejo>{
  //defino la clase Racional
    //propiedades
    private double real;
    private double imaginario;
    
    //constructores
    //constructor por defecto
    public Complejo(){
    }
    
    //constructor copia
    public Complejo(Complejo c) {
    this.real = c.real;
    this.imaginario = c.imaginario;
}
    //constructor personalizado
    public Complejo(double r){
    this.real = r;
    this.imaginario= 1;
}
    //constructor personalizado
    public Complejo(double r, double i){
        this.real = r;
        this.imaginario= i;
    }
    // ahora solo escribimos
    public void escribir() {
        System.out.println(real +"+"+ imaginario+"i");
    }
    @Override
    public int hashCode() {
        return Objects.hash(imaginario, real);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Complejo other = (Complejo) obj;
        return Double.doubleToLongBits(imaginario) == Double.doubleToLongBits(other.imaginario)
                && Double.doubleToLongBits(real) == Double.doubleToLongBits(other.real);
    }
    
    @Override
    public int compareTo(Complejo other) {
     if(this.real > other.real){
     return 1;
     }
     else if (this.real < other.real){
     return -1;
     }
     else {
     if (this.imaginario > other.imaginario){
     return 1;
     }
     else if (this.imaginario < other.imaginario){
     return -1;
     }
     else {
     return 0;
     }
     }
    }
    

    @Override
    public String toString() {
        return "Complejo [real=" + real + ", imaginario=" + imaginario + "]";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    // Lo destruimos
    public void finalize(){
        System.out.print("Racional destruido");
    }
    
   
}

