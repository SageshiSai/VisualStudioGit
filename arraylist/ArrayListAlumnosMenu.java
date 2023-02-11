package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Objectos.*;

public class ArrayListAlumnosMenu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        ArrayList<Alumno> arrayList = new ArrayList<Alumno>();
        Alumno a = new Alumno();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        
        
    
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
            System.out.println("Añada un alumno: ");
            a.leer(teclado);
            
            if (arrayList.contains(a))
                System.out.println("El alumno ya existe");
            else {
                arrayList.add(new Alumno(a));
                System.out.println("El alumno a sido añadido correctamente");
            }
            break;
            
        case 2:
            
            teclado.nextLine();
            System.out.println("Alumno: ");
            a.leer(teclado);
            int posicion = arrayList.indexOf(a);
            
            if(posicion >=0) {
                System.out.println("El elemento "+a+" se encuentra en la posicion "+posicion);
            }
            else {
                System.out.println("El elemento "+a+" NO se encuentra en el ArrayList");
            }
            break;
        case 3:
            teclado.nextLine();
            System.out.println("Alumno: ");
            a.leer(teclado);
            
            if(arrayList.remove(a)) {
                System.out.println("El elemento "+a+" ha sido borrado");
            }
            else {
                System.out.println("El elemento "+a+" NO se ha encontrado");
            }
            break;
            
        case 4:
            Collections.sort(arrayList, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno p1, Alumno p2) {
                    // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                    int comparacion = new String(p1.getGrupo()).compareTo(new String(p2.getGrupo()));
                    if(comparacion == 0) {
                        comparacion = new String(p1.getDni()).compareTo(new String(p2.getDni()));
                        return (-comparacion);
                    }
                    else{
                     return (-comparacion);   
                    }             
                } 
            });
            
            for(Alumno al : arrayList) {
                    System.out.println("Alumno: "+al);
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
