package Partie_3;

public class Exercice_1 {

    static class Boite<T> {

        private T contenu;

        public void setContenu(T contenu) {
            this.contenu = contenu;
        }

        public T getContenu() {
            return contenu;
        }
    }

    public static void main(String[] args) {

        Boite<String> boite1 = new Boite<>();
        boite1.setContenu("Bonjour");
        System.out.println("Boite String = " + boite1.getContenu());

        Boite<Integer> boite2 = new Boite<>();
        boite2.setContenu(2005);
        System.out.println("Boite Integer = " + boite2.getContenu());
    }
}