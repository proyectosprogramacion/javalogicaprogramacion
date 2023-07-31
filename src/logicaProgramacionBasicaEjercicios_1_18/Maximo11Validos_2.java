package logicaProgramacionBasicaEjercicios_1_18;

import java.util.Scanner;

/**
 * Programa que lee 11 números comprendidos entre el 20 y 40, ambos inclusive.
 * En el caso en el que algún número introducido no se encontrara dentro del
 * rango permitido, se mostrará un mensaje de error y seguirá pidiendo números
 * El programa finalizará cuando se hayan introducido 11 números válidos y
 * mostrará el número máximo introducido de los 11 válidos Además indicará
 * cuántos números de los introducidos no han sido válidos.
 */

public class Maximo11Validos_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int contValidos = 0;
		int contNovalidos = 0;
		int num;

		while (contValidos < 11) {
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
			// Si esta dentro del rango
			if (num >= 20 && num <= 40) {
				contValidos++;
				if (num > max) {
					max = num;
				}
			} else {
				contNovalidos++;
				System.out.println("Fuera de rango permitido entre 20 y 40");

			}
		}
		sc.close();
		System.out.println("Maximo: " + max);
		System.out.println("Números fuera de rango: " + contNovalidos);
	}

}