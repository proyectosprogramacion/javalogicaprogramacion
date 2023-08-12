package logicaProgramacionBasicaEjerciciosRepaso;

import java.util.Scanner;

/*
* Rellenar un array de enteros de tamaño escogido por el usuario,
* con el siguiente patrón:
* Para 10: 1 2 3 4 5 5 4 3 2 1
* Para 11: 1 2 3 4 5 6 5 4 3 2 1
*/
public class RellenarArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tamaño del array: ");
		int[] numeros = new int[sc.nextInt()];
		sc.close();

		int cont = 1;
		for (int i = 0; i < numeros.length / 2; i++) {
			numeros[i] = cont;
			numeros[numeros.length - 1 - i] = cont;
			cont++;
		}

		if (numeros.length % 2 != 0) {
			numeros[numeros.length / 2] = cont;
		}

		for (int num : numeros) {
			System.out.print(num + " ");
		}

	}
}