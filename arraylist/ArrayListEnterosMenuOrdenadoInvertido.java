    package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenadoInvertido {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        
        ArrayList<Double> ArrayList = new ArrayList<Double>();
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
            System.out.println("Cadena: ");
            Double cadena = teclado.nextDouble();
            
            //.contains(cadena)
            if(ArrayList.indexOf(cadena)<0) {
            ArrayList.add(cadena);
            }
            break;
            
        case 2:
            
            teclado.nextLine();
            System.out.println("Cadena: ");
            cadena = teclado.nextDouble();
            int posicion = ArrayList.indexOf(cadena);
            
            if(posicion >=0) {
                System.out.println("El elemento "+cadena+" se encuentra en la posicion "+posicion);
            }
            else {
                System.out.println("El elemento "+cadena+" NO se encuentra en el ArrayList");
            }
            break;
        case 3:
            teclado.nextLine();
            System.out.println("Cadena: ");
            cadena = teclado.nextDouble();
          
            
            if(ArrayList.remove(cadena)) {
                System.out.println("El elemento "+cadena+" ha sido borrado");
            }
            else {
                System.out.println("El elemento "+cadena+" NO se ha encontrado");
            }
            break;
            
        case 4:
            Collections.sort(ArrayList, Collections.reverseOrder());
            for(posicion = 0; posicion < ArrayList.size();posicion++) {
                System.out.println(ArrayList.get(posicion));
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
