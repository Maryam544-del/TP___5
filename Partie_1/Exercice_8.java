package Partie_1;

public class Exercice_8 {

    static class Validation {

        public void verifierAge(int age) throws Exception {

            if (age < 18) {
                throw new Exception("Age non valide!");
            }

            System.out.println("Age valid");
        }
    }

    public static void main(String[] args) {

        Validation validation = new Validation();

        try {

            validation.verifierAge(50);
            validation.verifierAge(10);

        } catch (Exception e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}