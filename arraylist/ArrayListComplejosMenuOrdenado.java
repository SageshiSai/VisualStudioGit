package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Objectos.Complejo;

public class ArrayListComplejosMenuOrdenado {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Complejo> arraylist = new ArrayList<Complejo>();
        //Creo un objecto de la clase del arraylist
        Complejo valor = new Complejo();
        int opcion;
        int Posicion;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1- Añadir");
            System.out.println("2- Buscar");
            System.out.println("3- Borrar");
            System.out.println("4- Listar Array");
            System.out.println("0- Salir");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
        
        switch(opcion) {
            case 1:
                teclado.nextLine();
                System.out.println("Valor: ");
                valor.leer(teclado);
                if(!arraylist.contains(valor)) {
                    //si arraylist NO contiene todavia valor
                    //creo una copia de ese objecto y lo añado a arraylist
                    arraylist.add(new Complejo(valor));
                    //ordeno arraylist
                    Collections.sort(arraylist);
                }
                
                
                break;
                
            case 2:
                
                
                System.out.println("Cadena: ");
                valor.leer(teclado);
                Posicion = arraylist.indexOf(valor);
                
                if(Posicion >=0) {
                    System.out.println("El elemento "+valor+" se encuentra en la posicion "+Posicion);
                }
                else {
                    System.out.println("El elemento "+valor+" NO se encuentra en el ArrayList");
                }
                break;
            case 3:
                teclado.nextLine();
                System.out.println("Cadena: ");
                valor.leer(teclado);
              
                
                if(arraylist.remove(valor)) {
                    System.out.println("El elemento "+valor+" ha sido borrado");
                }
                else {
                    System.out.println("El elemento "+valor+" NO se ha encontrado");
                }
                break;
                
            case 4:
                
                for(Posicion = 0; Posicion < arraylist.size();Posicion++) {
                    System.out.println(arraylist.get(Posicion));
                }
                break;
            case 0:
                teclado.close();
                System.out.println("Fin del programa");
                System.exit(0);
        }
        
        
        } while(opcion != 0);
        teclado.close();
    }

}
