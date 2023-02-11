package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import Objectos.*;
public class bittor {

public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
ArrayList<Alumno> arraylistalumnos = new ArrayList<Alumno>();
Alumno valor = new Alumno();
int posicion;
int opc;

do {
System.out.println("***MENU***");
System.out.println("1-Añadir Alumno");
System.out.println("2-Buscar Alumno");
System.out.println("3-Borrar Alumno");
System.out.println("4-Listar Alumnos");
System.out.println("5-Salir");
opc = sc.nextInt();

switch(opc) {
case 1:


sc.nextLine();
System.out.println("Introduce un alumno");
valor.leer(sc);
if(!arraylistalumnos.contains(valor)) {
arraylistalumnos.add(new Alumno(valor));

System.out.println("***Se ha añadido con exito***");
}else {
System.out.println("***El alumno ya existe***");

}



System.out.println();

break;

case 2:
sc.nextLine();
System.out.println("***Buscar un alumno***");
valor.leer(sc);
System.out.println(valor);
posicion = arraylistalumnos.indexOf(valor);
System.out.println(posicion);
if(posicion >= 0) {
System.out.println("El alumno se encuentra en la posicion " + posicion);

}else {
System.out.println("El alumno no se encuentra en el array");
}
System.out.println();
break;

case 3:
sc.nextLine();
System.out.println("***Eliminar un alumno***");
valor.leer(sc);
if(arraylistalumnos.remove(valor)) {
System.out.println("El elemento " + valor + " ha sido borrado");
}else {
System.out.println("El elemento " + valor + " no ha sido borrado");

}

break;
case 4:
System.out.println();
System.out.println("***Listar array***");
for(Alumno a:arraylistalumnos) {
System.out.println(a);
}

}

}while(opc !=5 && opc < 5 && opc >0);




}

}
