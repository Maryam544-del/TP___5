package Partie_1;

public class Exercice_6 {

    static class Machine {

        String etat = "OFF";

        public void demarrer() {
        	if (etat.equals("ON")) {
        		throw new IllegalStateException("La machine est déjà démarrée !");
            }
            etat = "ON";
            System.out.println("Machine démarrée.");
        }
    }

    public static void main(String[] args) {

        Machine machine = new Machine();

        try {

            machine.demarrer(); 
            machine.demarrer(); 

        } catch (IllegalStateException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}