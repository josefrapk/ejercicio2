package ej3;

/**
 * @author Carlos
 *  Hacer una función que reciba un array Vector de n números naturales
 *   distintos de cero. La función deberá averiguar si alguno de los números 
 *   del vector está repetido, devolverá -1 si no hay ninguno repetido y el 
 *   índice del primer repetido que encuentre, en otro caso. 
 *
 */
public class Principal{
	
	public static void main(String[] args) {
		
		String mensaje = "Dime cuatos numeros quiere insertar";
		int numeros = Teclado.pedirInt(mensaje);
		float [] vector = new float[numeros];
		
		for (int i = 0; i < vector.length; i++) {
			mensaje = "Dime un numero";
			vector[i] = Teclado.pedirFloat(mensaje);
		}
		mensaje +=" para buscar en el vector si esta repetido";
		float valor = Teclado.pedirFloat(mensaje);
		int posicion = buscarValorRepetido(vector, valor);
		switch (posicion) {
		case -1:
			System.out.println("El valor no se repite");
			break;

		default:
			System.out.println("El valor "+ valor +" que se repite se encuentra en la posicion "+ (posicion+1));
			break;
		}

	}

	private static int buscarValorRepetido(float[] vector, float valor) {
		int posicion = -1;
		boolean encontrado = false;

		for (int i = 0; i < vector.length; i++) {
			for (int j = i+1; j < vector.length&&!encontrado; j++) {
				if(vector[i]==vector[j]){
					posicion = i;
					encontrado = true;
				}
			}
		}
			
		return posicion;
	}

}