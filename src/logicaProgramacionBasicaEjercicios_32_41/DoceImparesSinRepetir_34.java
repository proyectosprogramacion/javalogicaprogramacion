package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*Realiza un programa que lea números enteros desde teclado
 *  hasta que se introduzcan 12 impares sin repetir. 
 * */
public class DoceImparesSinRepetir_34 {

	public static void main(String[] args) {
		final int NUM = 12;
		int[] impares = new int[NUM];
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		int aux;
		boolean encontrado;
		while (cont < impares.length) {
			System.out.print("Número: ");
			aux = sc.nextInt();
			if (aux % 2 != 0) {
				encontrado = false;
				for (int i = 0; i < cont && !encontrado; i++) {
					if (aux == impares[i]) {
						encontrado = true;
					}
				}
				if (!encontrado) {
					impares[cont] = aux;
					cont++;
				} else {
					System.out.println("Repetido.");
				}
			} else {
				System.out.println("El número debe ser impar.");
			}
		}
		sc.close();
	}
}