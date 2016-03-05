package ej2;

import ej2.Teclado;

public class Principal{
	public static void main(String[] args) {
		
		String mensaje = "Dime cuatos numeros quiere insertar";
		int numeros = Teclado.pedirInt(mensaje);
		int [] array = new int[numeros];
		
		for (int i = 0; i < array.length; i++) {
			mensaje = "Dime un numero";
			array[i] = Teclado.pedirInt(mensaje);
		}
		mensaje +=" para buscar en el array";
		int valor = Teclado.pedirInt(mensaje);
		int posicion = buscarValor(array, valor);
		switch (posicion) {
		case -1:
			System.out.println("El valor no fue encontrado");
			break;

		default:
			System.out.println("El valor "+ valor +" se encuentra en la posicion "+ (posicion+1));
			break;
		}

	}

	private static int buscarValor(int[] array, int valor) {
		int posicion = -1;
		boolean encontrado = false;

		for (int j = 0; j < array.length&&!encontrado; j++) {
				if(valor==array[j]){
					posicion= j;
					encontrado = true;
				}
		}
			
		return posicion;
	}

}

