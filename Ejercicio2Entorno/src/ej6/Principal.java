package ej6;

/**
 * @author Carlos
 *   Dado un tipo desarrollar una función que recibiendo un vector de tal tipo calcule la longitud de la subsecuencia
 *   común más larga (lcs), esto es, la longitud de la mayor secuencia de elementos repetidos dentro del vector, por ejemplo,
 *   en (2, 5, 4, 2, 2, 5, 6, 6, 6, 3) sería 3; en (3, 2, 4, 1, 2) sería 1   
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
			int secuencial = secuencialMayor(vector); 
			System.out.println(secuencial);
		}

	private static int secuencialMayor(int[] vector) {
		
		boolean iguales = false;
		int total = 0;
		int repetido = 1;
		for (int i = 0; i < vector.length-1; i++) {
			iguales = igualPosterior(vector, i);
			if(iguales)
				repetido++;
			else
				repetido = 1;
			if (total<repetido) 
				total = repetido;
			
		}
		
		return total;
	}

	private static boolean igualPosterior(int[] vector, int i) {
		
		if (vector[i]==vector[i+1]) {
			return true;
		}
		
		return false;
	}
}