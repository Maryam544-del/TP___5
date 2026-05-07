package Partie_2;

public class Exercice_9 {

    static class PaiementRefuseException extends Exception {
        public PaiementRefuseException(String message) {
            super(message);
        }
    }

    static class CarteExpireeException extends Exception {
        public CarteExpireeException(String message) {
            super(message);
        }
    }

    static class PaiementService {

        double plafond = 1000.0;
        boolean carteExpiree = false; // simulation

        public void payer(double montant)
                throws PaiementRefuseException, CarteExpireeException {

            if (carteExpiree) {
                throw new CarteExpireeException("Carte expirée !");
            }

            if (montant > plafond) {
                throw new PaiementRefuseException("Paiement refusé : plafond dépassé !");
            }

            System.out.println("Paiement effectué  Montant = " + montant);
        }
    }

    public static void main(String[] args) {

        PaiementService p = new PaiementService();

        try {

            p.payer(500);   
            p.payer(2000);  

        } catch (CarteExpireeException e) {

            System.out.println("Erreur carte : " + e.getMessage());

        } catch (PaiementRefuseException e) {

            System.out.println("Erreur paiement : " + e.getMessage());
        }
    }
}