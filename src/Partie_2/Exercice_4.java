package Partie_2;

public class Exercice_4 {

    static class EmailInvalideException extends Exception {
        public EmailInvalideException(String message) {
            super(message);
        }
    }

    static class AgeInvalideException extends Exception {
        public AgeInvalideException(String message) {
            super(message);
        }
    }

    static class UtilisateurService {
    	
    	public void inscrire(String email, int age)
                throws EmailInvalideException, AgeInvalideException {

            if (email == null || !email.contains("@")) {
                throw new EmailInvalideException("Email invalide !");
            }

            if (age < 18) {
                throw new AgeInvalideException("Âge invalide !");
            }

            System.out.println("Inscription réussie");
        }
    }

    public static void main(String[] args) {

        UtilisateurService service = new UtilisateurService();

        try {
            service.inscrire("bonjour@gmail.com", 20);
        } catch (EmailInvalideException | AgeInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            service.inscrire("bonjourl", 25);
        } catch (EmailInvalideException | AgeInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            service.inscrire("bon@.com", 15);
        } catch (EmailInvalideException | AgeInvalideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}