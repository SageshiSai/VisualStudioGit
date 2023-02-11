package arraylist;
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCadenasOrdenadoDescendente {
    
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> arraylistString = new ArrayList<String>();
        
        Scanner teclado = new Scanner(System.in);
        String s;
        
        System.out.println("Añade una Palabra");
        s = teclado.nextLine();
        
        
        while(!s.isEmpty()) {
            arraylistString.add(s);
            
            System.out.println("introsuce otra cadena");
            s=teclado.nextLine();
        }
        //Comparator<String> comparador = Collections.reverseOrder(); (CON IMPORT)
        Collections.sort(arraylistString,Collections.reverseOrder());
        for (int posicion=0; posicion < arraylistString.size(); posicion++) {
            System.out.println(arraylistString.get(posicion));
        }
        teclado.close();
    
}
}


