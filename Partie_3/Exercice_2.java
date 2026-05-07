package Partie_3;

public class Exercice_2 {

    static class Paire<T, U> {

        private T premier;
        private U second;

        public Paire(T premier, U second) {
            this.premier = premier;
            this.second = second;
        }

        public void afficherPaire() {
            System.out.println("Paire = (" + premier + ", " + second + ")");
        }
    }

    public static void main(String[] args) {

        Paire<String, Integer> p1 = new Paire<>("Age", 30);
        p1.afficherPaire();

        Paire<Integer, Double> p2 = new Paire<>(2, 7.5);
        p2.afficherPaire();
    }
}