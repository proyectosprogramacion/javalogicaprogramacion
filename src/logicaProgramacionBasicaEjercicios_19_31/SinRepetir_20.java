package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 7 números distintos Si se
 * introdujera un número repetido se mostrará el mensaje “Repetido” y no será
 * tenido en cuenta. Al acabar el programa mostrará los 7 números introducidos.
 */

public class SinRepetir_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int NUM = 7;
		int[] numeros = new int[NUM];
		int cont = 0;
		int aux;
		boolean encontrado;
		while (cont < NUM) {
			System.out.print("Introduce un número: ");
			aux = sc.nextInt();
			// Buscamos ese número entre los ya guardados en el array
			encontrado = false;
			// para de buscar en el array en el momento que lo encuentra
			for (int i = 0; i < cont && !encontrado; i++) {
				if (aux == numeros[i]) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				numeros[cont] = aux;
				cont++;
			} else {
				System.out.println("Repetido. ");
			}
		}
		sc.close();
		// Mostramos con un for each
		for (int num : numeros) {
			System.out.println(num);
		}
	}

}