package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que lee 9 números, y en el caso en el que el primero introducido sea
 * igual al último, nos muestra la media. En caso contrario, no se mostrará
 * nada.
 */

public class PrimeroIgualUltimo_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMEROS_INTRODUCIDOS = 9;
		int aux = 0;
		System.out.println("Introduce un número: ");
		int primero = sc.nextInt();
		int suma = primero;
		for (int i = 0; i < NUMEROS_INTRODUCIDOS - 1; i++) {
			System.out.println("Introduce un número:");
			aux = sc.nextInt();
			suma += aux;

		}
		// Si el primero es igual al último
		if (primero == aux) {
			System.out.println("La media es: " + (suma / (double) NUMEROS_INTRODUCIDOS));
		}
		sc.close();

	}

}