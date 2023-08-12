package logicaProgramacionBasicaEjerciciosRepaso;

import java.util.Scanner;

/*
 * Leer números enteros hasta que la suma de los impares sea 27 o más,
 * o bien, se introduce el -1.
 * Al terminar se muestra la suma de los impares (sin contar con el -1).
 */

public class SumaImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int num = 0;
		while (suma < 27 && num != -1) {
			System.out.print("Número: ");
			num = sc.nextInt();
			if (num % 2 != 0 && num != -1) {
				suma += num;
			}
		}
		sc.close();
		System.out.println("Suma de los impares: " + suma);
	}

}