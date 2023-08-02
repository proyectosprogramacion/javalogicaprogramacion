package logicaProgramacionBasicaEjercicios_19_31;

import java.util.Scanner;

/**
 * Realiza un programa que lea 20 números decimales y al final muestre la media
 * de todos ellos y los que son superiores a dicha media.
 */

public class SuperioresMedia_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM = 20;
		double[] numeros = new double[NUM];
		double media = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero: ");
			numeros[i] = sc.nextDouble();
			media += numeros[i];
		}
		sc.close();
		media /= NUM;
		System.out.println("La media es: " + media + ".");
		System.out.println("Numeros superiores a la media: ");
		for (double num : numeros) {
			if (num > media) {
				System.out.println(num);
			}
		}
	}

}