package Partie_2;

public class Exercice_3 {

    static class SoldeInsuffisantException extends Exception {
        public SoldeInsuffisantException(String message) {
            super(message);
        }
    }

    static class MontantInvalideException extends Exception {
        public MontantInvalideException(String message) {
            super(message);
        }
    }

    static class CompteBancaire {

        double solde;

        public CompteBancaire(double solde) {
            this.solde = solde;
        }

        public void retirer(double montant)
                throws SoldeInsuffisantException, MontantInvalideException {

            if (montant <= 0) {
                throw new MontantInvalideException("Montant invalide !");
            }

            if (montant > solde) {
                throw new SoldeInsuffisantException("Solde insuffisant !");
            }

            solde -= montant;
            System.out.println("Retrait effectué. Solde = " + solde);
        }
    }

    public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire(1500);

        try {
            compte.retirer(500);
        } catch (MontantInvalideException e) {
            System.out.println("Erreur montant : " + e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur solde : " + e.getMessage());
        }

        try {
            compte.retirer(-100);
        } catch (MontantInvalideException e) {
            System.out.println("Erreur montant : " + e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur solde : " + e.getMessage());
        }

        try {
            compte.retirer(2000);
        } catch (MontantInvalideException e) {
            System.out.println("Erreur montant : " + e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur solde : " + e.getMessage());
        }
    }
}