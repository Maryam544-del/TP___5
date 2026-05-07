package Partie_1;

import java.util.Scanner;

public class Exercice_3 {

    static class Tableau {

        int[] tab = {5, 10, 15, 20, 25};

        //with if
        public void indexSansException(int index) {
            if (index >= 0 && index < tab.length) {
                System.out.println("Value = " + tab[index]);
            } else {
                System.out.println("Invalid index !");
            }
        }

        //with try/catch
        public void indexAvecException(int index) {
            try {
                System.out.println("Value = " + tab[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index !");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tableau tableau = new Tableau();

        System.out.print("Give an index (0-4): ");
        int index = scanner.nextInt();

        tableau.indexSansException(index);

        tableau.indexAvecException(index);

        scanner.close();
    }
}
