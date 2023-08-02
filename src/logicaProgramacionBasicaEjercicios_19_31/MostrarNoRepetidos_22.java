package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que lea 10 números desde consola Una vez introducidos se
 * mostrarán lo números no repetidos.
 */

public class MostrarNoRepetidos_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM = 10;
		int[] numeros = new int[NUM];
		boolean repetido;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Los números no repetidos: ");
		for (int i = 0; i < numeros.length; i++) {
			repetido = false;
			for (int j = 0; j < numeros.length && !repetido; j++) {
				if (numeros[i] == numeros[j] && i != j) {
					repetido = true;
				}
			}
			if (!repetido) {
				System.out.println(numeros[i]);
			}
		}
	}

}