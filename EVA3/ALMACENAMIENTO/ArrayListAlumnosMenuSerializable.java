package EVA3.ALMACENAMIENTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Objectos.Alumno;

public class ArrayListAlumnosMenuSerializable {
    public static void main(String[] args) {
        ArrayList<Alumno> arrayList = new ArrayList<>();
        FileInputStream fis;
        Alumno a = new Alumno();
        ObjectInputStream ois;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        Boolean Modificado = false;
        try {
            fis = new FileInputStream("arraalumno.dat");
            ois = new ObjectInputStream(fis);

            while (fis.available()>0) {
                a = (Alumno) ois.readObject();
                arrayList.add(a);
            }
            
            fis.close();
            ois.close();

        }   catch (FileNotFoundException e) {
            e.printStackTrace();
        }   catch (IOException e){
            e.printStackTrace();
        }   catch (ClassNotFoundException e){
            e.printStackTrace();
        }
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
                
                System.out.println("Alumno: ");
                a.leer(teclado);
                arrayList.add(new Alumno(a));
                Modificado = true;
                break;
                
            case 2:
                
                
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
                
                System.out.println("Cadena: ");
                a.leer(teclado);
                
                if(arrayList.remove(a)) {
                    System.out.println("El elemento "+a+" ha sido borrado");
                }
                else {
                    System.out.println("El elemento "+a+" NO se ha encontrado");
                }
                Modificado = true;
                break;
                
            case 4:
                for(posicion = 0; posicion < arrayList.size();posicion++) {
                    System.out.println(arrayList.get(posicion));
                }
                
                break;
            case 0:
                teclado.close();
                System.out.println("Fin del programa");
                if (Modificado) {
                    try {
                    FileOutputStream fos=new FileOutputStream("alEnteros.dat");
                    ObjectOutputStream oos = new ObjectOutputStream (fos);
            
                    for (Alumno cc : arrayList) {
                        oos.writeObject(cc);
                    }
                oos.close();
                fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
                System.exit(0);
        }
        
        } while(opcion != 0);
        teclado.close();
        
    }
}
