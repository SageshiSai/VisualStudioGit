package libreria;

import java.util.Scanner;

public class libro extends publicacion {
    //Constructor personalizado
    int numPaginas;
    public libro(String c, String t, int a, int n){
        super(c, t, a);
        this.numPaginas = n;
    }
    public libro(){
        super();
        this.numPaginas = 0;
    }
    public libro(libro a){
        super(a);
        this.numPaginas = a.numPaginas;
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
                    System.out.println("Numero de Paginas");
                    int paginas = s.nextInt();
                    this.numPaginas = paginas;
    }

	@Override
	public String toString() {
		return "Libro: "+super.toString()+", Numero de Paginas:" + numPaginas;
	}
    
    
    
}