package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*Realiza un programa que lea un array de enteros de tamaño 10. 
 * Se deberá invertir la ubicación de los elementos y posteriormente mostrarlo:
*/

public class ArrayInverso_39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de elementos del array: ");
		// Creación del array con el tamaño introducido
		int[] numeros = new int[sc.nextInt()];
		// Lectura del array desde teclado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		int aux;
		// TODO Voltear el array
		for (int i = 0; i < numeros.length / 2; i++) {
			// System.out.println(i + " - " + (numeros.length - 1 - i));
			aux = numeros[i];
			numeros[i] = numeros[numeros.length - 1 - i];
			numeros[numeros.length - 1 - i] = aux;
		}

		// Mostrar el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}