package libreria;

import java.util.Scanner;

public abstract class publicacion {
    String codigo;
    String titulo;
    int año;

    //Constructor personalizado
    public publicacion( String c, String t, int a){
        this.codigo = c;
        this.titulo = t;
        this.año = a;
    }
    public publicacion(){
    }
    public publicacion(publicacion p){
		this.codigo = p.codigo;
        this.titulo = p.titulo;
        this.año = p.año;
    }

	@Override
	public String toString() {
		return ("publicacion [Codigo=" + codigo + ", Titulo=" + titulo + ", Año=" + año+ "]");
	}

    public abstract void leer(Scanner s);

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

}
