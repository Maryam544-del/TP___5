package Partie_3;

public class Exercice_6 {

    public static <T> void afficherTableau(T[] tableau) {

        for (T element : tableau) {
            System.out.println(element);
        }
    }

    public static <T> T getPremier(T[] tableau) {

        if (tableau == null || tableau.length == 0) {
            return null;
        }

        return tableau[0];
    }

    public static void main(String[] args) {

        String[] noms = {"maryam", "Safa", "marwa"};

        System.out.println("Affichage tableau String:");
        afficherTableau(noms);

        System.out.println("Premier élément: " + getPremier(noms));

        Integer[] nums = {1, 2, 3};

        System.out.println("Affichage tableau Integer:");
        afficherTableau(nums);

        System.out.println("Premier élément: " + getPremier(nums));
    }
}