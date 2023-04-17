//App patrones anidados Java by Faraon138

package cl.desafiolatam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatronesAnidados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continua;
			//inicio de patrones con el ingreso del usuario de un numero
		System.out.println("--------------------------------------------");
		System.out.println("---           Patrones  Anidados         ---");
		System.out.println("--------------------------------------------");
		System.out.println("");

		do {
		try {
			continua=false;
		
	
		// Patron 1
		System.out.print("Para el patron 1, ingrese el numero: ");
		int lado = sc.nextInt();
		Cuadrado(lado);
		System.out.println("");
		
		// Patron 2
		System.out.print("Para el patron 2, ingrese el numero: ");
		int Z = sc.nextInt();
		Zeta(Z);
		System.out.println("");
		
		// Patron 3
		System.out.print("Para el Patron 3 ingrese el numero: ");
		int X = sc.nextInt();
		laX(X);
		System.out.println("");
		
		// Patron 4
		System.out.print("Para el patron 4, ingrese el nuemero: ");
		int el4 = sc.nextInt();
		Papiro(el4);
		System.out.println("");
		
		
	       System.out.println("");
	       System.out.println("--------------------------------------------");
	       System.out.println("---      Fin de Patrones Anidados        ---");
	       System.out.println("--------------------------------------------");
	       System.out.println("");
		   System.out.println("");
		   System.out.println("");
		   System.out.println("");
	       
		} catch (InputMismatchException ex) {
			System.out.println("No acepto letras, ingrese un numero");
			   System.out.println("");
			   System.out.println("");
			sc.next();
			continua=true;
		}
		} while (continua=true);
		
		sc.close();
		
	
	}

		
	public static void Cuadrado(int largo) {
		for (int i = 1; i <= largo; i++) {
			for (int j = 1; j <= largo; j++) {
				if (i == 1 || i == largo || j == 1 || j == largo) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void Zeta(int largo) {
		for (int i = 1; i <= largo; i++) {
			for (int j = 1; j <= largo; j++) {
				if (i == 1 || i == largo || i + j == largo + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void laX(int largo) {
		for (int i = 1; i <= largo; i++) {
			for (int j = 1; j <= largo; j++) {
				if (i == j || i + j == largo + 1) {
					System.out.print("x");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void Papiro(int largo) {

		int LargoLinea1 = largo - 1; // largo linea 1
		int LargoUltima = largo == 1 ? 1 :LargoLinea1; // largo de la ultima linea

		// crea la linea
		if (largo == 1) {
			System.out.println("*");
		}

		else {
			for (int i = 1; i <= LargoLinea1; i++) {
				System.out.print("*");
			}
			System.out.println();

			// crea cuadrado de adentro
			for (int i = 3; i <= largo; i++) {

				for (int j = 1; j <= largo; j++) {
					if (j == 1 || j == largo) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}

				System.out.println(); 
			}

			// crea ultima linea
			if (largo > 1) {
				for (int i = 1; i <= LargoUltima; i++) {
					if (i == 1) {
						System.out.print(" *");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}

		}
	}

}
