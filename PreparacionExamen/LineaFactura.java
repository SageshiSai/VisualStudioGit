package PreparacionExamen;

public class LineaFactura {
    String codigo;
    int cantidad;
    double totalLinea;

    public LineaFactura(String c, int cc, double t){
        this.codigo = c;
        this.cantidad = cc;
        this.totalLinea = t;
    }
    @Override
	public String toString() {
		return "LineaFactura [Codigo=" + codigo + ", Cantidad=" + cantidad + ", totalLinea=" + totalLinea + "]";
	}
}
