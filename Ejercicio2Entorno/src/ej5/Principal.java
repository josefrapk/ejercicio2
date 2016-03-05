package ej5;

/**
 * @author Carlos
 * 5. Sin usar vectores auxiliares diseñar un algoritmo que 
 * permita invertir el contenido de un vector. Ejemplo:  
 * Vector Original: 24 12 45 90 7 9 15  
 * Vector Invertido: 15 9 7 90 45 12 24 
 */

public class Principal{

	public static void main(String[] args) {

			String mensaje = "Dime cuatos numeros quiere insertar";
			int numeros = Teclado.pedirInt(mensaje);
			int [] vector = new int[numeros];

			for (int i = 0; i < vector.length; i++) {
				mensaje = "Dime un numero";
				vector[i] = Teclado.pedirInt(mensaje);
			}
			
			invertir(vector);
			
		}

	private static void invertir(int[] vector) {
		
		for (int i = vector.length-1; i >= 0; i--) {
			System.out.print(vector[i]+"\t");
		}
		
	}

}