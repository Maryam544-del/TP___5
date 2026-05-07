package Partie_1;

public class Exercice_4 {

    static class Conversion {

        public int convertirEnEntier(String texte) {

            try {
                return Integer.parseInt(texte);

            } catch (NumberFormatException e) {

                System.out.println("Error: The string is not a valid integer!");
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        String string1 = "2005";
        String string2 = "abcd";

        int nbr1 = conversion.convertirEnEntier(string1);
        System.out.println("result = " + nbr1);

        int nbr2 = conversion.convertirEnEntier(string2);
        System.out.println("result = " + nbr2);
    }
}
