package Partie_2;

public class Exercice_6 {

    static class StockInsuffisantException extends Exception {
        public StockInsuffisantException(String message) {
            super(message);
        }
    }

    static class Produit {

        int stock;

        public Produit(int stock) {
            this.stock = stock;
        }

        public void retirerDuStock(int quantite)
                throws StockInsuffisantException {

            if (quantite > stock) {
                throw new StockInsuffisantException("Stock insuffisant !");
            }

            stock -= quantite;
            System.out.println("Retrait effectué. Stock restant = " + stock);
        }
    }

    public static void main(String[] args) {

        Produit produit = new Produit(1300);

        try {

            produit.retirerDuStock(123);  
            produit.retirerDuStock(2000);  

        } catch (StockInsuffisantException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}