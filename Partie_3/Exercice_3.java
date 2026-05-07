package Partie_3;

public class Exercice_3 {

    interface Calcul<T> {
        T addition(T a, T b);
    }

    static class CalculInteger implements Calcul<Integer> {

        public Integer addition(Integer a, Integer b) {
            return a + b;
        }
    }

    static class CalculDouble implements Calcul<Double> {

        public Double addition(Double a, Double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {

        Calcul<Integer> c1 = new CalculInteger();
        System.out.println("Integer = " + c1.addition(1, 12));

        Calcul<Double> c2 = new CalculDouble();
        System.out.println("Double = " + c2.addition(3.4, 9.5));
    }
}