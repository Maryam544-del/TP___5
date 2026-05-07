package Partie_2;

public class Exercice_8 {

    static class ChampObligatoireException extends Exception {
        public ChampObligatoireException(String message) {
            super(message);
        }
    }

    static class FormulaireService {

        public void validerFormulaire(String nom, String email)
                throws ChampObligatoireException {

            if (nom == null || nom.trim().isEmpty()) {
                throw new ChampObligatoireException("Nom obligatoire !");
            }

            if (email == null || email.trim().isEmpty()) {
                throw new ChampObligatoireException("Email obligatoire !");
            }

            System.out.println("Formulaire valide ");
        }
    }

    public static void main(String[] args) {

        FormulaireService f = new FormulaireService();

        try {

            f.validerFormulaire("Maryam", "maryam@gmail.com"); 
            f.validerFormulaire("", "test@gmail.com");                           

        } catch (ChampObligatoireException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
