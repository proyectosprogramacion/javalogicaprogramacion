package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Random;

/**
 * Realiza un programa que muestre 10 números aleatorios enteros y sin repetir
 * de entre el 1 y el 100, ambos inclusive.
 */

public class DiezAleatoriosDistintos_30 {

	public static void main(String[] args) {
		final int NUM = 10;
		int[] numeros = new int[NUM];
		Random random = new Random();
		int cont = 0;
		int aux;
		boolean encontrado;

		while (cont < numeros.length) {
			aux = random.nextInt(10) + 1;
			encontrado = false;
			for (int i = 0; i < cont && !encontrado; i++) {
				if (aux == numeros[i]) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				numeros[cont] = aux;
				cont++;
			}
		}
		for (int num : numeros) {
			System.out.print(num + " ");
		}

	}

}
