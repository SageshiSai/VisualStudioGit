package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class socio {
    String dni;
    String nombre;
    String apellido;
    int edad;
    ArrayList<publicacion> aPublicacion = new ArrayList<>();

    public socio(){
    }

    public socio(String d, String n, String a, int e){
        this.dni = d;
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
    }

    public int leer(Scanner c){
        System.out.println("Edad:");
        int e = c.nextInt();
        if(e <0){
            while(e<0){
                System.out.println("ERROR! Edad incorrecta");
                System.out.println("Vuelva a escribir la edad(Un numero positivo)");
                e = c.nextInt();
            }
        }
        return e;
    }

    void añadirPublicaion(publicacion a){
        
        
    }
    public void print(){
        
    	System.out.println("DNI: " + dni );
        System.err.println("Nombre: =" + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
            for (publicacion p : aPublicacion) {
            System.out.println(p);
            }
        System.out.println("***********************");
    }
    
}
