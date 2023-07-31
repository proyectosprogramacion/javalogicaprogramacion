package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que lee de manera consecutiva números hasta que se introducen dos
 * números iguales seguidos.
 */
public class NumerosConsecutivos_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int actual;
		int anterior;
		System.out.print("Introduce un número: ");
		anterior = sc.nextInt();
		System.out.print("Introduce otro número: ");
		actual = sc.nextInt();
		while (anterior != actual) {
			System.out.print("Introduce otro número: ");
			anterior = actual;
			actual = sc.nextInt();

		}
		sc.close();
	}
}