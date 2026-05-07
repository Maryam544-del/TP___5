package Partie_2;

public class Exercice_1 {

    static class SoldeInsuffisantException extends Exception {
        public SoldeInsuffisantException(String message) {
            super(message);
        }
    }

    static class CompteBancaire {

        int code;
        double solde;

        public CompteBancaire(int code, double solde) {
            this.code = code;
            this.solde = solde;
        }

        public void verser(double montant) {
            solde += montant;
            System.out.println("Versement effectué.");
        }

        public void retirer(double montant) throws SoldeInsuffisantException {

            if (montant > solde) {
                throw new SoldeInsuffisantException("Solde insuffisant !");
            }

            solde -= montant;
            System.out.println("Retrait effectué.");
        }
    }

    public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire(123, 10000);

        try {

            compte.verser(2000);
            compte.retirer(5000);
            compte.retirer(20000); 
            
        } catch (SoldeInsuffisantException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}