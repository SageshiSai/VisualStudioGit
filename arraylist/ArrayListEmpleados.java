package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

import Objectos.Empleado;

public class ArrayListEmpleados {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Empleado> arrayEmpleado = new ArrayList<Empleado>();
        Empleado emp = new Empleado();
        Scanner teclado = new Scanner(System.in);
        
        boolean salir = false;
        while(!salir) {
            System.out.println("Añade un empleado");
            emp.leer(teclado);
            arrayEmpleado.add(new Empleado(emp));
            
            System.out.println("Quieres salir(s/n)?");
            char sino = teclado.nextLine().toLowerCase().charAt(0);
            if (sino == 's') {
                salir = true;
        }
            for(Empleado a : arrayEmpleado) {
                System.out.println(a);
            }
    }

}
}
