//App Patrones By faraon138

package cl.faraon138;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		boolean continua;
		//iniciamos la utilidad Scanner
	Scanner sc= new Scanner (System.in);
	
	//inicio de patrones con el ingreso del usuario de un numero
	System.out.println("--------------------------------------------");
	System.out.println("---               Patrones               ---");
	System.out.println("--------------------------------------------");
	System.out.println("");
	try {
		
		 
		   do {
				try {
					continua=false;
	System.out.println("- Ingrese un numero para dar inicio a la muestra de Patrones:");//ingreso del numero que da inicio al patron
	   int n= sc.nextInt();
		
                // Patron 1 
	   System.out.println("");
	   System.out.println("");
	   System.out.println("Patron 1");
       for (int i = 1; i <= n; i++) {
           if (i % 2 == 0) {
               System.out.print(".");
           } else {
               System.out.print("*");
           }
       }
       System.out.println("");
       System.out.println("");
       
       			// Patron 2
       System.out.println("Patron 2");
       for (int i = 1; i <= n; i++) {
    		if ((i % 4) !=0) {
               System.out.print(i %4);
           } else {
               System.out.print(4);
           }
       }
       System.out.println("");
       System.out.println("");
		   
       			// Patron 3
       System.out.println("Patron 3");
       for (int i = 1; i <= n; i++) {
    		if ((i % 3) ==0) {
               System.out.print("*");
           } else {
               System.out.print("|");
           }
       }
       System.out.println("");
       System.out.println("");
       System.out.println("");
       System.out.println("--------------------------------------------");
       System.out.println("---           Fin de Patrones            ---");
       System.out.println("--------------------------------------------");
			} catch (InputMismatchException ex) {
				System.out.println("No acepto letras, ingrese un numero");
				   System.out.println("");
				   System.out.println("");
				sc.next();
				continua=true;
			}
			} while (continua=true);
	   
       sc.close();
	} catch (Exception e) {
		
	}
	
	}

}
