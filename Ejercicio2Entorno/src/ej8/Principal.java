package ej8;

/**
 * @author Carlos
 *    Escribir un algoritmo que permita sumar el número de elementos positivos y 
 *    el de negativos de una matriz T, siendo T una matriz de M × N elementos recibida como parámetro
 */

public class Principal{

	public static void main(String[] args) {

			String mensaje = "Dime un numero de filas";
			int filas = Teclado.pedirInt(mensaje);
			mensaje = "Dime un numero de columnas";
			int columnas = Teclado.pedirInt(mensaje);
			int [][] vector = new int[filas][columnas];
			int [][] traspuesta = new int[columnas][filas];
			
			insertarNumeros(vector);
			System.out.println("A =");
			mostrarVector(vector);
			System.out.println();
			traspuesta = trasponerVector(vector,traspuesta);
			System.out.println();
			System.out.println("A(t) =");
			mostrarVector(traspuesta);
		}

	private static int[][] trasponerVector(int[][] vector, int[][] traspuesta) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {		
				traspuesta[j][i] = vector[i][j];
			}
		}
		return traspuesta;
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