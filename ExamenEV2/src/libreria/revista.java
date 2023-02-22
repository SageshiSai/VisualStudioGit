package libreria;

import java.util.Scanner;

public class revista extends publicacion {
    int numero;
    //Constructor personalizado
    public revista(String c, String t, int a, int n){
        super(c, t, a);
        this.numero = n;
    }
    public revista(){
        super();
        this.numero = 0;
    }
    public revista(revista a){
        super(a);
        this.numero = a.numero;
    }


    @Override
    public void leer(Scanner s) {
        System.out.println("Codigo");
        String codigo = s.nextLine();
        this.codigo = codigo;
        System.out.println("Titulo");
        String titulo = s.nextLine();
        this.titulo = titulo;
        System.out.println("Año");
        int año = s.nextInt();
        this.año = año;
        System.out.println("Numero");
        int numero = s.nextInt();
        this.numero = numero;
    }


	@Override
	public String toString() {
		return "Revista: "+super.toString()+", Numero:" + numero;
	}
    
    
}
