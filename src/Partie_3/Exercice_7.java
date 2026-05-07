package Partie_3;

public class Exercice_7 {

    public static <T extends Number> double somme(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(somme(12, 20));

        System.out.println(somme(9.7, 3.5));
    }
}