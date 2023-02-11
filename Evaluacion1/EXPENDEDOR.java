package Evaluacion1;

import java.util.Scanner;

public class EXPENDEDOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  lee por teclado un saldo en euros al cliente, muestra un menú donde
		 *  elegir café (0,43 €), refrescos (1,11 €), o agua (0,36 €) y, si el saldo es mayor o igual que el importe del
		 *  producto saca el mensaje “Su producto. Gracias” y le devuelve el cambio indicando el número de
		 *  monedas de cada tipo de las que se compone el cambio (2€, 1€, 50cts, 20cts, 10cts, 5cts, 2cts, 1cts). Si el
		 *  saldo no es mayor o igual que el importe del producto muestra el mensaje “Saldo insuficiente” y devuelve
		 *  el saldo. Si se introduce una opción incorrecta muestra el mensaje “Opción incorrecta” y devuelve el
		 *  saldo. Para evitar problemas a la hora de convertir en un número entero el saldo a devolver podemos
		 *  usar la función Java Math.round que redondea un valor real.
		 */
		Scanner teclado = new Scanner(System.in);
		double saldo, precio;
		int e2,e1,c50,c20,c10,c5,c2,c1;
		System.out.println("Importe saldo");
		saldo=teclado.nextDouble();
		
		System.out.printf("A Importado %.2f");
		teclado.close();
		
		
	}

}
