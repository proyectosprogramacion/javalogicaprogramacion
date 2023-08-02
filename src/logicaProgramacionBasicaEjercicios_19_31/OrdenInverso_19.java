package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que lea desde teclado 11 números enteros para
 * posteriormente mostrarlos en el orden inverso al que fueron introducidos.
 */

public class OrdenInverso_19 {

	public static void main(String[] args) {

		final int NUM = 11;
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[NUM];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero: ");
			numeros[i] = sc.nextInt();
		}

		sc.close();
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	}

}