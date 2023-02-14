package tarea6;
// DAVID BERNÁRDEZ LUQUE
// DAVID BERNÁRDEZ LUQUE
// DAVID BERNÁRDEZ LUQUE
/**
 * @author David
 * @version 1.0
 */
public class Ordenacion2 {

	/**
	 * Método que ordena un array de números de manera ascendente
	 * @param array Array de números enteros que se desea ordenar de manera ascendente
	 */

	public void ordenarArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			intercambiar(array, i, maxValue);
			imprimirArray(array);
		}
	}

	/**
	 * Método que ordena un array de números enteros de manera ascendente
	 * @param numbers Array de números enteros que se desea ordenar de manera ascendente
	 * @return Regresa un array con los números del array introducido ordenados de manera ascendente
	 */
	
	public int[] ordenarArray2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}

	/**
	 * Método que imprime por consola un array con un formato específico
	 * @param array Array que se quiere mostrar por consola
	 */

	public void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	/**
	 * Método que intercambia la posición de dos elementos en un array de enteros
	 * @param array El array sobre el que se quiere hacer el intercambio de posición de elementos
	 * @param a La posición del array del primer elemento
	 * @param b La posición del array del segundo elemento
	 */

	public void intercambiar(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}





