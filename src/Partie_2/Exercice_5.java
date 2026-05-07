package Partie_2;

public class Exercice_5 {

    static class AuthentificationException extends Exception {
        public AuthentificationException(String message) {
            super(message);
        }
    }

    static class AuthService {

        public void login(String username, String password)
                throws AuthentificationException {

            if (!username.equals("admin") || !password.equals("2005")) {
                throw new AuthentificationException("Identifiants incorrects");
            }

            System.out.println("Connexion réussie");
        }
    }

    public static void main(String[] args) {

        AuthService auth = new AuthService();

        try {

            auth.login("admin", "2005");     
            auth.login("user", "3030");      

        } catch (AuthentificationException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}