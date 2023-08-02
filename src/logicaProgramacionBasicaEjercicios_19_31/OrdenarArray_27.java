package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Random;

/**
 * Realiza un programa que lea 23 números para posteriormente mostrarlos en
 * orden ascendente.
 * 
 */
public class OrdenarArray_27 {

	public static void main(String[] args) {

		final int NUM = 23;
		int[] numeros = new int[NUM];
		// rellenamos el array con números aleatorios random
		Random random = new Random();
		// Rellenamos de forma aleatoria
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100);
		}

		// Método ordenar buscando mínimos
		System.out.println("Metodo ordenación por mínimos");
		int iMenor;
		int aux;
		// Si queremos saber los tiempos de cada uno.Dara 0 porque son pocos valores. Si
		// pones final int NUM = 10000; saldrá más
		long tiempoInicio = System.currentTimeMillis();
		for (int i = 0; i < numeros.length - 1; i++) {
			iMenor = i;
			for (int j = i; j < numeros.length; j++) {
				if (numeros[j] < numeros[iMenor]) {
					iMenor = j;
				}
			}
			aux = numeros[i];
			numeros[i] = numeros[iMenor];
			numeros[iMenor] = aux;
		}
		long tiempoFin = System.currentTimeMillis();
		System.out.println("Total tiempo: " + (tiempoFin - tiempoInicio) + " milisegundos.");

		// Mostramos con un for each
		for (int num : numeros) {
			System.out.println(num);
		}

		// Ordenar con el método burbuja
		System.out.println("Método ordenación burbuja");
		boolean ordenado = false;
		for (int i = 0; i < numeros.length - 1; i++) {
			ordenado = true;
			for (int j = 0; j < numeros.length - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					ordenado = false;
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}

		// Mostramos con un for each
		for (int num : numeros) {
			System.out.println(num);
		}

	}

}