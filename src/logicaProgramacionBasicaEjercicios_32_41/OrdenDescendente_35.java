package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*
 * Realiza un programa que lea 8 números 
 * y los muestre de manera descendente. 
*/
public class OrdenDescendente_35 {
	public static void main(String[] args) {
		final int NUM = 8;
		int[] numeros = new int[NUM];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		// Ordenar el array
		int iMayor = 0;
		int aux;
		for (int i = 0; i < numeros.length - 1; i++) {
			iMayor = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] > numeros[iMayor]) {
					iMayor = j;
				}
			}
			aux = numeros[i];
			numeros[i] = numeros[iMayor];
			numeros[iMayor] = aux;
		}
		// Mostrar el array
		for (int num : numeros) {
			System.out.println(num);
		}
	}
}