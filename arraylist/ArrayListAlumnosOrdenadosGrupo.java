package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Objectos.Alumno;
import Objectos.FechaT5;

public class ArrayListAlumnosOrdenadosGrupo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        ArrayList<Alumno> arrayList = new ArrayList<Alumno>();
        
        arrayList.add(new Alumno("d2","n2","a2",new FechaT5(),"2Dw3"));
        arrayList.add(new Alumno("d1","n1","a1",new FechaT5(),"2Dw4"));
        arrayList.add(new Alumno("d3","n3","a3",new FechaT5(),"2Dw5"));
        arrayList.add(new Alumno("d4","n5","a5",new FechaT5(),"1Dw3"));
        arrayList.add(new Alumno("d5","n5","a5",new FechaT5(),"1Dw3"));
        
        
        
        Collections.sort(arrayList, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno p1, Alumno p2) {
                // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                int comparacion = new String(p1.getGrupo()).compareTo(new String(p2.getGrupo()));
                if(comparacion == 0) {
                    comparacion = new String(p1.getDni()).compareTo(new String(p2.getDni()));
                    return (comparacion);
                }
                else{
                 return (comparacion);   
                }             
            } 
        });
        
        for(Alumno a : arrayList) {
                System.out.println("Alumno: "+a);
            }
        
    }

}
