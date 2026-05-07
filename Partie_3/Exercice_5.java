package Partie_3;

public class Exercice_5 {

    interface Comparateur<T> {
        int comparer(T a, T b);
    }

    static class ComparateurInteger implements Comparateur<Integer> {

        public int comparer(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }

    static class ComparateurString implements Comparateur<String> {

        public int comparer(String a, String b) {
            return Integer.compare(a.length(), b.length());
        }
    }

    public static void main(String[] args) {

        Comparateur<Integer> c1 = new ComparateurInteger();
        System.out.println(c1.comparer(98, 9));

        Comparateur<String> c2 = new ComparateurString();
        System.out.println(c2.comparer("salut", "bonjour"));
    }
}