package Partie_3;

import java.util.List;

public class Exercice_11 {

    public static void afficherListe(List<?> liste) {

        for (Object element : liste) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        List<String> noms = List.of("safa", "Salma", "Omar");
        List<Integer> nums = List.of(12, 15, 30);

        System.out.println("Liste String:");
        afficherListe(noms);

        System.out.println("Liste Integer:");
        afficherListe(nums);
    }
}