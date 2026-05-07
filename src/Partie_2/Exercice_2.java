package Partie_2;

public class Exercice_2 {

    static class MontantInvalideException extends Exception {
        public MontantInvalideException(String message) {
            super(message);
        }
    }

    static class Operation {

        public void verifierMontant(double montant) throws MontantInvalideException {

            if (montant <= 0) {
                throw new MontantInvalideException("Montant invalide !");
            }

            System.out.println("Montant valide = " + montant);
        }
    }

    public static void main(String[] args) {

        Operation operation = new Operation();

        try {

            operation.verifierMontant(200);
            operation.verifierMontant(-100);

        } catch (MontantInvalideException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}