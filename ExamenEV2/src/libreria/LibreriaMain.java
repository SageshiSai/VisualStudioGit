package libreria;

import java.util.Scanner;

public class LibreriaMain {

	public static void main(String[] args) {
		int opcion;
		socio s = new socio();
		revista r =new revista();
		libro l =new libro();
		String librorevista = "";
		ListaSocios li = new ListaSocios();
		li.fillData();
		catalogo ca = new catalogo();
		ca.fillData();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido a la libreria virtual.");
		System.out.println("Cual es su numero de DNI");
		String dni = teclado.nextLine();
		
		if(!li.esSocio(dni)){
			li.hacerSocio();
		}
		
		do{
			System.out.println("0- Salir");
			System.out.println("1- Mostrar Catalogo");
			System.out.println("2- Alquilar algo");
			System.out.println("3- Mostrar todos los socios");
			System.out.println("4- Añadir una revista o un libro");
			System.out.println("5- Mostrar las publicacion que tiene un socio alquiladas");
			System.out.println("Que quieres hacer?");
			opcion = teclado.nextInt();
			switch (opcion) {
				case 1:
						System.out.println("1- Mostrar Catalogo");
						for(publicacion c: ca.lista){
							System.out.println(c);
						}
					break;
				case 2:
				System.out.println("Codigo del articulo que queres alquilar");
				String codigo = teclado.nextLine().toLowerCase();
				for (publicacion a : s.aPublicacion) {
					if(a.codigo.equals(codigo)){
					}
				}
						
					break;
				case 3:
					for(socio c: li.listaSocios){
						c.print();
					}
					break;
				case 4:
				teclado.nextLine();
				System.out.println("¿Es un libro o una revista");
				librorevista = teclado.nextLine().toLowerCase();
				
        	if(librorevista.equalsIgnoreCase("libro")){
				l.leer(teclado);
				ca.lista.add(new libro(l)); 
			}
			if(librorevista.equalsIgnoreCase("revista")){
				r.leer(teclado);
				ca.lista.add(new revista(r));
			}
        
					
					break;
				case 5:
				teclado.nextLine();
					System.out.println("Introduce el DNI");
					int pos = 0;
					String dNi = "";
					dNi = teclado.nextLine();
					pos = li.posicionSocio(dNi);
					li.listaSocios();
					s.print();
					break;
			}
		}while(opcion > 0);

		teclado.close();
	}

}
