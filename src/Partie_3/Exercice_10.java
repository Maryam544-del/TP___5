package Partie_3;

public class Exercice_10 {

    static class Repository<T> {

        public void save(T obj) {
            System.out.println("Objet sauvegardé : " + obj);
        }
    }

    static class User {
        String nom;

        public User(String nom) {
            this.nom = nom;
        }

        public String toString() {
            return nom;
        }
    }

    static class UserRepository extends Repository<User> {
    }

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        User u1 = new User("safa");
        User u2 = new User("basma");

        repo.save(u1);
        repo.save(u2);
    }
}
