package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/*
 * Realiza un programa que lea una cadena y elimine las letras ‘a’ que pudiera contener. Finalmente se mostrará la cadena. 
Ejemplo:
Cadena: Hace buen día.
Resultado: Hce buen dí. 
*/
public class MostrarSinA_51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena: ");
		String cadena = sc.nextLine();
		sc.close();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != 'a') {
				System.out.print(cadena.charAt(i));
			}
		}

	}

}