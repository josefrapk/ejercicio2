package ej7;

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

			insertarNumeros(vector);
			mostrarVector(vector);
			System.out.println();
			System.out.println("positivos");
			System.out.println("0\t= " + sumar(vector));
			System.out.println();
			System.out.println("negativos");
			System.out.println("0\t= " + restar(vector));
		}

	private static int restar(int[][] vector) {
		int resta = 0;
		
		for (int i = 0; i < vector.length; i++) {

			for (int j = 0; j < vector[i].length; j++) {
				if (vector[i][j]>=0) {
					System.out.print(vector[i][j]+"\t-\t");
					resta-=vector[i][j];
				}
			}
		}
		return resta;
	}

	private static int sumar(int[][] vector) {
		int suma = 0;
		
		for (int i = 0; i < vector.length; i++) {

			for (int j = 0; j < vector[i].length; j++) {
				if (vector[i][j]>=0) {
					System.out.print(vector[i][j]+"\t+\t");
					suma+=vector[i][j];
				}
			}
		}		
		return suma;
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