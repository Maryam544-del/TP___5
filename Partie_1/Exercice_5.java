package Partie_1;

public class Exercice_5 {

    static class CALCUL {

        public int racineCarree(int x) {

            if (x < 0) {
            	throw new IllegalArgumentException( "Impossible de calculer la racine carrée d'un nombre négatif !");
            }

            return (int) Math.sqrt(x);
        }
    }

    public static void main(String[] args) {

        CALCUL m = new CALCUL();

        try {

            int r1 = m.racineCarree(16);
            System.out.println("Résultat = " + r1);

            int r2 = m.racineCarree(-4);
            System.out.println("Résultat = " + r2);

        } catch (IllegalArgumentException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}