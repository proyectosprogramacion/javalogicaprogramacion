package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que lee 10 números e indica si todos los números son iguales o no.
 */
public class TodosIgual_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int CANTIDAD = 10;
		System.out.println("Introduce un número: ");
		int primero = sc.nextInt();
		boolean todosIguales = true;
		int aux;
		for (int i = 0; i < CANTIDAD - 1; i++) {
			System.out.print("Introduce un número: ");
			aux = sc.nextInt();
			if (aux != primero) {
				todosIguales = false;
			}
		}
		sc.close();
		if (todosIguales) {
			System.out.println("Son todos iguales.");
		} else {
			System.out.println("No son todos iguales.");
		}
	}
}