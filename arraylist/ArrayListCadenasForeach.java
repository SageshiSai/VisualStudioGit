package arraylist;
    
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasForeach {
    
    
    
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
        for (String valor : arraylistString) {
            System.out.println(valor);
        }
        teclado.close();
    
}
}


