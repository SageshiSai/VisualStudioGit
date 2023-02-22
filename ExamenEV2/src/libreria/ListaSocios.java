package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaSocios {
    ArrayList<socio> listaSocios = new ArrayList<>();
    socio s = new socio();

    void fillData(){
        listaSocios.add(new socio("11111111G", "Leire", "Trabado", 34));
        listaSocios.add(new socio("22222222G", "Antonio", "Rodelgo", 35));
        listaSocios.add(new socio("33333333G", "Jon", "Gonzalez", 36));
        listaSocios.add(new socio("55555555G", "Laura", "Gomez", 12));
    }
    boolean esSocio(String a){
        boolean Socio = false;
        for(socio s: listaSocios){
            if(s.dni.equals(a)){
                Socio = true;
            }  
        }
        if(!Socio){
        return false;  
        }
        else{
            return true;
        }
    }
    void hacerSocio(){
        Scanner c = new Scanner(System.in);
        System.out.println("Ese socio no esta en nuestra base de datos, introduce tus datos por favor");
        System.out.println("Numero de DNI:");
        String d = c.nextLine();
        System.out.println("Nombre:");
        String n = c.nextLine();
        System.out.println("Apellido");
        String a = c.nextLine();
        int e = s.leer(c);
        listaSocios.add(new socio(d,n,a,e));
    }
    int posicionSocio(String a){
        int posicion = 0;
        for(socio o: listaSocios){
            if(o.dni.equals(a)){
                posicion = listaSocios.indexOf(o);
            }
        }
        return posicion;
    }
    
    
}
