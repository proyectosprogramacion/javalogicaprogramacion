package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que muestra todos los divisores de un número introducido. Entre los
 * divisores no se incluirá el propio número.
 */
public class MostrarDivisores_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		sc.close();

		for (int div = 1; div <= num / 2; div++) {
			if (num % div == 0) {
				System.out.println(div);
			}
		}

	}

}