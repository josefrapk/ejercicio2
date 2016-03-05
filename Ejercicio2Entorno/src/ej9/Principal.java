package ej9;

public class Principal{

	public static void main(String[] args) {

			String mensaje = "Dime un numero de filas";
			int filas = Teclado.pedirInt(mensaje);
			mensaje = "Dime un numero de columnas";
			int columnas = Teclado.pedirInt(mensaje);
			int [][] vector = new int[filas][columnas];
			int [][] permutada = new int[filas][columnas];
			insertarNumeros(vector);
			mostrarVector(vector);
			System.out.println();
			mensaje = "Dime un numero de fila";
			int i = Teclado.pedirInt(mensaje);
			int j = Teclado.pedirInt(mensaje);
			System.out.println();
			permutada = copiaVector(vector,permutada);
			permutada = permutarVector(vector,permutada,(i-1),(j-1));
			mostrarVector(permutada);
		}

	private static int[][] copiaVector(int[][] vector, int[][] permutada) {

		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				permutada[i][j] = vector[i][j];
			}
		}
		
		return permutada;
	}

	private static int[][] permutarVector(int[][] vector, int[][] permutada, int i, int j) {
		
		
			for (int a = 0; a < vector[i].length; a++) {
				permutada[j][a] = vector[i][a];
			}
			
			for (int a = 0; a < vector[j].length; a++) {
				permutada[i][a] = vector[j][a];
			}
			
		
		return permutada;
	}

	private static void mostrarVector(int[][] vector) {
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println();
			for (int j = 0; j < vector[i].length; j++) {
				System.out.print(vector[i][j]+"\t");
			}
		}	
	}

	private static void insertarNumeros(int[][] vector) {
		
		String mensaje = "Dime un numero";
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {		
				vector[i][j] = Teclado.pedirInt(mensaje);
			}
		}
	}
	
}