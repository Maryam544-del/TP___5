package Partie_1;

public class Exercice_7 {

    static class Propagation {

        public void methodeA() {
        	try {
        		methodeB();
            } catch (NullPointerException e) {

                System.out.println("Erreur gérée dans A : " + e.getMessage());
            }
        }

        public void methodeB() {

            methodeC();
        }

        public void methodeC() {

            String texte = null;
            System.out.println(texte.length());
        }
    }

    public static void main(String[] args) {

        Propagation propagation = new Propagation();

        propagation.methodeA();
    }
}
