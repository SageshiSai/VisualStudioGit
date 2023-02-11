package Objectos;

public class ComplejoMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo(c1);
        Complejo c3 = new Complejo(3.1);
        Complejo c4 = new Complejo(3.2,4.3);
        
        // escribimos lo que tenemos
        c1.escribir();
        c2.escribir();
        c3.escribir();
        c4.escribir();
    }

}
