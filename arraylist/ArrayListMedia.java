package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMedia {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            
        //Creamos la ArrayList
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        int valor;
        //Creamos el teclado
        Scanner teclado = new Scanner(System.in);
        
        //Leemos el valor
        System.out.println("Introduzca una temperatura");
        valor = teclado.nextInt();
        
        while(valor >=0) {
            ArrayList.add(valor);
            
            System.out.println("introduce otra cadena");
            valor=teclado.nextInt();
        }
        teclado.close();
        
        int suma = 0;
        for(int posicion = 0; posicion < ArrayList.size();posicion++) {
            valor = ArrayList.get(posicion);
            suma = suma + valor;
        }
        double media;
        media = (double)suma / (double)ArrayList.size();
        System.out.println("Media: "+ media);
        
    }

}
