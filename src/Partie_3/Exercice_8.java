package Partie_3;

public class Exercice_8 {

    static class Animal<T> {
        T nom;
    }

    static class Chien extends Animal<String> {

        public Chien(String nom) {
            this.nom = nom;
        }

        public void afficherNom() {
            System.out.println("Nom du chien = " + nom);
        }
    }

    public static void main(String[] args) {

        Chien c = new Chien("jak");
        c.afficherNom();
    }
}
