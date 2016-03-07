package ej4;

import ej6.Teclado;

/**
 * @author Carlos
 *  Diseñar una función lógica que nos indique si dos vectores de enteros son 
 *  ‘circularmente iguales’, esto signiﬁca, tener los mismos elementos y en el 
 *  mismo orden relativo: circularmente {3, 4, 1, 5} = {5, 3, 4, 1}.
 *
 */
public class Principal{
	
	public static void main(String[] args) {
		
		boolean continuar;
		do{
		String mensaje = "Dime cuatos numeros quiere insertar";
		int numeros = Teclado.pedirInt(mensaje);
		int [] vector = new int[numeros];
		int [] array = new int[numeros];
		
		for (int i = 0; i < vector.length; i++) {
			mensaje = "Dime un numero para la primera array";
			vector[i] = Teclado.pedirInt(mensaje);
		}
		
		for (int i = 0; i < array.length; i++) {
			mensaje = "Dime un numero para la segunda array";
			array[i] = Teclado.pedirInt(mensaje);
		}
		
		boolean circular = circular(vector,array);
		if(circular) 
			System.out.println("Estos dos vectores siguen un orden circular");
		else
			System.out.println("Estos dos vectores no siguen orden circular");
		
		mensaje = "Desea realizar de nuevo la operacion";
		continuar = Teclado.pedirBoolean(mensaje);
		
	}while(continuar);
}
	
	private static boolean circular(int[] vector, int[] array) {

		boolean ordenado = false;
		int posicionArray = posicionVector(vector,array);
		if (posicionArray>-1) {

			int recorrido = array.length;
			
			for (int i = 0; i <recorrido ; i++) {

				if(vector[i]==array[(posicionArray+i)%recorrido]){
					ordenado = true;	
				}
			}	
		}		
		return ordenado;
	}

	private static int posicionVector(int[] vector, int[] array) {
		
		int posicionArray = 0;
		boolean ordenado = false;
		
		for (int i = 0; i < vector.length; i++) {
			if(array[i]==vector[0]){
				posicionArray = i;
				ordenado = true;
			}
		}
		if(ordenado == false) posicionArray = -1;
		
		return posicionArray;
	}

}