package Partie_2;

public class Exercice_7 {

    static class QuotaDepasseException extends Exception {
        public QuotaDepasseException(String message) {
            super(message);
        }
    }

    static class DownloadService {

        double limite = 500.0; 

        public void telechargerFichier(double taille)
                throws QuotaDepasseException {

            if (taille > limite) {
                throw new QuotaDepasseException("Quota dépassé !");
            }

            System.out.println("Téléchargement réussi . Taille = " + taille + " MB");
        }
    }

    public static void main(String[] args) {

        DownloadService d = new DownloadService();

        try {

            d.telechargerFichier(250);   
            d.telechargerFichier(1500);  

        } catch (QuotaDepasseException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
