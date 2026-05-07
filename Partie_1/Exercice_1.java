package Partie_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercice_1 {
	static class Calcul {
        public int division(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division par zero !");
            }
            return a / b;
        }
    }

	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	Calcul calcul = new Calcul();
        
    	try {
    		System.out.print("Enter the first number : ");
    		int a = scanner.nextInt();
    		
    		System.out.print("Enter the second number : ");
    		int b = scanner.nextInt();
    		
    		int result = calcul.division(a, b);
    		System.out.println("result = "+result);
    	} catch (InputMismatchException e) {
    		System.out.println("Error: Entering an int");
        } catch (ArithmeticException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    	scanner.close();
   }
}