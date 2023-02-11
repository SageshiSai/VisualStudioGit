package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMediaTemperatura {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            
        //Creamos la ArrayList
        ArrayList<Double> ArrayList = new ArrayList<Double>();
        double temp;
        //Creamos el teclado
        Scanner teclado = new Scanner(System.in);
        
        //Leemos el valor
        System.out.println("Introduzca una temperatura");
        temp = teclado.nextInt();
        
        while(temp != -999) {
            ArrayList.add(temp);
            
            System.out.println("introsuce otra cadena");
            temp=teclado.nextDouble();
        }
        teclado.close();
        
        double suma = 0;
        for(int posicion = 0; posicion < ArrayList.size();posicion++) {
            temp = ArrayList.get(posicion);
            suma = suma + temp;
        }
        double media, mayor=0.0, menor=0.0, igual;
        media = suma / ArrayList.size();
        System.out.println("Media: "+ media);
        igual = media;
        for(int posicion = 0 ; posicion < ArrayList.size();posicion++) {
            if(ArrayList.get(posicion).compareTo(mayor)>0) {
                mayor = mayor + 1;
            }
            else if(ArrayList.get(posicion).compareTo(mayor)<0) {
                menor = menor +1;
            }
            else {
                igual = igual + 1;
            }
        }
        System.out.println("Media: "+media+" Mayores: "+mayor+" Iguales: "+igual+" Menores: "+menor);
        
    }
    
    

}
