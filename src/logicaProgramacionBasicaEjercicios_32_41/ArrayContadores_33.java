package logicaProgramacionBasicaEjercicios_32_41;

import java.util.Scanner;

/*Realiza un programa que lea desde teclado 10 puntuaciones numéricas enteras que han de estar comprendidas entre el 0 y el 5, ambos inclusive. 
Al finalizar se mostrará por cada una de las puntuaciones, su frecuencia. 
Frecuencias:
 0: 23 veces.
 1: 34 veces. 
2: 0 veces. 
3: 78 veces. 
4: 54 veces. 
5: 11 veces. 
 * */
public class ArrayContadores_33 {

	public static void main(String[] args) {
		int[] puntuaciones = new int[6];
		Scanner sc = new Scanner(System.in);
		final int NUM = 10;
		int cont = 0;
		int puntuacion;
		while (cont < NUM) {
			System.out.print("Puntuación (0..5): ");
			puntuacion = sc.nextInt();
			if (puntuacion >= 0 && puntuacion <= 5) {
				puntuaciones[puntuacion]++;
				cont++;
			} else {
				System.out.println("Debe estar entre 0 y 5.");
			}
		}
		sc.close();
		System.out.println("Frecuencias:");
		for (puntuacion = 0; puntuacion < puntuaciones.length; puntuacion++) {
			System.out.println(puntuacion + ": " + puntuaciones[puntuacion] + " veces.");
		}
	}
}