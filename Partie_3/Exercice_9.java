package Partie_3;

public class Exercice_9 {

    static class Vehicule<T> {
        T vitesse;
    }

    static class Voiture<T> extends Vehicule<T> {

        public Voiture(T vitesse) {
            this.vitesse = vitesse;
        }

        public void afficherVitesse() {
            System.out.println("Vitesse = " + vitesse);
        }
    }

    public static void main(String[] args) {

        Voiture<Integer> v1 = new Voiture<>(123);
        v1.afficherVitesse();

        Voiture<Double> v2 = new Voiture<>(34.5);
        v2.afficherVitesse();
    }
}