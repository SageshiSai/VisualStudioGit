package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumVeces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> ArrayInt = new ArrayList<Integer>();
        
        Scanner teclado = new Scanner(System.in);
        int n, valor;
        
        
        for(int posicion=0;posicion<5;posicion++) {
            ArrayInt.add(0);
        }
        System.out.println("Introduzca un numero de 1 a 5");
        n = teclado.nextInt();
        while(n !=0 && n <= 5){
            // cojo el valor que hay en esa posicion en arraylist
            valor = ArrayInt.get(n-1);
            // le sumo 1
            valor = valor + 1;
            // actualizo el valor que hay en esa posicion en arrayList
            ArrayInt.set(n-1, valor);
            //Leo otro valor 
            System.out.println("Introduzca un numero de 1 a 5");
            n = teclado.nextInt();
        }
        for(int posicion=0;posicion<ArrayInt.size();posicion++) {
            valor = ArrayInt.get(posicion);
            System.out.println(posicion +1 + ": "+valor+" veces");
        }
        teclado.close();
        System.exit(0);
    }

}
