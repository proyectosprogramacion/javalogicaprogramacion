package logicaProgramacionBasicaEjercicios_42_51;

import java.util.Scanner;

/* Realiza un programa que lea una frase y muestre las palabras en el orden inverso. 
Ejemplo: 
Cadena: Me gusta programar.
Resultado: programar. Gusta Me 

 * */
public class PalabrasAlReves_50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Frase: ");
		String[] palabras = sc.nextLine().split(" ");
		sc.close();
		String alReves = "";
		for (int i = palabras.length - 1; i >= 0; i--) {
			alReves += palabras[i] + " ";
		}
		alReves = alReves.toLowerCase();
		alReves = alReves.replace(".", "");
		alReves = alReves.substring(0, 1).toUpperCase() + alReves.substring(1) + ".";
		alReves = alReves.replace(" .", ".");
		System.out.println(alReves);
	}
}