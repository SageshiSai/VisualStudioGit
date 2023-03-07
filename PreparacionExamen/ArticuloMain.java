package PreparacionExamen;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticuloMain {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n = 0;
    int cantidadProducto = 0;
    String codigoProducto = "";
    ListarArticulo la = new ListarArticulo();
    la.filldata();
    do {
    System.out.println("*******GESTIONAR VENTAS*******");
    System.out.println("1- Realizar una venta (crear factura)");
    System.out.println("2- Listar articulos");
    System.out.println("3- Listar articulos sanos");
    System.out.println("4- Pedir un codigo y mostrar los articulos que tienen el precio equivalente del articulo");
    System.out.println("5- Listar los productos mas caros");
    System.out.println("6- Listar los productos con Stock bajo");
    System.out.println("7- Pedir codigo de articulo y aumentar stock");
    System.out.println("0- Salir");
    System.out.println("Opcion: ");
    n = teclado.nextInt();
    switch(n) {
        case 1:
        teclado.nextLine();
        codigoProducto = "";
                System.out.println("Numero factura");
                int num = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Nombre cliente:");
                String nombre = teclado.nextLine();
                System.out.println("Apellido cliente:");
                String apellido = teclado.nextLine();
                
                Factura f = new Factura(num, nombre, apellido, new ArrayList<LineaFactura>());
                
                while (!codigoProducto.equalsIgnoreCase("END")) {
                    System.out.println("Codigo producto: (END para acabar)");
                    codigoProducto = teclado.next();
                    if (!codigoProducto.equalsIgnoreCase("END")) {
                        System.out.println("Cantidad producto:");
                        cantidadProducto = teclado.nextInt();
                        double totalLinea = la.precio(codigoProducto) * cantidadProducto;
                        f.añadirLineas(codigoProducto, cantidadProducto, totalLinea);
                        for(Articulo a: la.lista) {
                            if(a.codigo.equals(codigoProducto)) {
                                a.quitarStock(cantidadProducto);
                                
                            }
                            
                        }
                        
                    }else {
                        f.print();
                        System.out.println();
                        System.out.println();
                    }
                    
                }
                break;
        case 2:
        
        System.out.println();
        System.out.println();
        for(Articulo a: la.lista ) {
            System.out.println(a.printCaracteristicas());
            
        }
        System.out.println();
        System.out.println();

        break;
        
        case 3:
        
        System.out.println();
        System.out.println();
        for(Articulo a: la.lista ) {
            if(a.sano()){
            System.out.println(a.printCaracteristicas());  
            }
        }
        System.out.println();
        System.out.println();
        break;
        case 4:
            teclado.nextLine();
            System.out.println("Escriba el codigo");
            codigoProducto = teclado.nextLine();
            
            
            for(Articulo a : la.equivalente(codigoProducto)){
            System.out.println(a.printCaracteristicas());  
            }
        break;
        case 5:
        for(Articulo a : la.mascaro()){
            System.out.println(a.printCaracteristicas());
        }
            
        break;
        case 6:
            for(Articulo a : la.reponer()){
                System.out.println(a.printCaracteristicas());
            }
        break;

        case 7:
        teclado.nextLine();
            System.out.println("Escriba el codigo");
            codigoProducto = teclado.nextLine();

            for(Articulo a : la.lista){
                if(a.codigo.equals(codigoProducto)){
                        System.err.println("Stock a aumentar");
                        num = teclado.nextInt();
                        a.sumarStock(num);
                        System.out.println("Stock Aumentado");
                }
            }
    }
    }while(n != 0);
    teclado.close();
}
}

