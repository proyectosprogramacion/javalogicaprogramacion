package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que lea números enteros desde teclado hasta que se
 * introduzcan 9, o bien hasta que se introduzca un número repetido. Al acabar
 * el programa mostrará los números introducidos, sin incluir el número repetido
 * en caso de existir.
 */
public class HastaRepetido_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM = 9;
		int[] numeros = new int[NUM];
		int aux;
		boolean encontrado = false;
		int cont = 0;
		while (cont < NUM && !encontrado) {
			System.out.print("Introduce un número: ");
			aux = sc.nextInt();
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
		sc.close();
		System.out.println("Números introducidos. ");
		for (int i = 0; i < cont; i++) {
			System.out.println(numeros[i]);
		}
	}

}