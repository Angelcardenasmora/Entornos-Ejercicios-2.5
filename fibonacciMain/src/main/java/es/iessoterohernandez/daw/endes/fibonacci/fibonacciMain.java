package es.iessoterohernandez.daw.endes.fibonacci;


import java.util.Scanner;
import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;
/**
 * Hello world!
 *
 */

public class fibonacciMain 
{
	  public static void main(String[] args) {
	        Fibonacci fc = new Fibonacci();
		
	        Scanner scanner = new Scanner(System.in);
	     
	        System.out.print("Introduce el número hasta el cual calcular la sucesión de Fibonacci: ");
	        int n = scanner.nextInt();  
	        
	        System.out.println("La sucesión de Fibonacci hasta el " + n + "-ésimo número es:");
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print(fc.fibonacci(i) + " ");
	        }
	    }
}