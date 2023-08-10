package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*
 * Realiza un programa que termine
 *  cuando el usuario haya metido todos los números comprendidos
 *   entre el 1 y el 10. */
public class ArrayBooleanos_36 {

	public static void main(String[] args) {
		boolean[] introducido = new boolean[11];
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		int aux;
		while (cont < introducido.length - 1) {
			System.out.print("Número: ");
			aux = sc.nextInt();
			if (aux >= 1 && aux <= 10) {
				if (introducido[aux] == false) {
					introducido[aux] = true;
					cont++;
				}
			}
		}
		sc.close();
	}
}