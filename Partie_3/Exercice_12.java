package Partie_3;

import java.util.List;

public class Exercice_12 {

    public static void afficherNombres(List<? extends Number> liste) {

        for (Number n : liste) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        List<Integer> entiers = List.of(15, 90, 2);

        List<Double> decimals = List.of(8.5, 3.9, 1.5);

        System.out.println("Entiers:");
        afficherNombres(entiers);

        System.out.println("Décimaux:");
        afficherNombres(decimals);
    }
}