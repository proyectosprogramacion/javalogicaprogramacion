package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que lee dos números desde consola y nos muestra su suma y el
 * resultado de la división del primero entre el segundo.
 */

public class SumarDivisores_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		double num1 = sc.nextDouble();
		System.out.print("Introduce el segundo número: ");
		double num2 = sc.nextDouble();

		sc.close();
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
		if (num2 == 0) {
			System.out.println("División por cero no permitida.");
		} else {
			System.out.println("La división de: " + num1 + " entre " + num2 + " es: " + (num1 / num2));
		}
	}

}