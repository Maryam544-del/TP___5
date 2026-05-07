package Partie_1;

public class Exercice_2 {
	static class StringLong{
		
		// without try/catch 
		public void LongueurSansException(String texte) {
			if(texte == null) {
				System.out.println("The string is null");
			}else {
				System.out.println("length = " + texte.length());
			}
		}
		
		// with try/catch
		public void LongueurAvecException(String texte) {
            try {
                System.out.println("length = " + texte.length());
            } catch (NullPointerException e) {
                System.out.println("The string is null");
            }
        }
	}
	
	public static void main(String[] args) {

        StringLong stringlong = new StringLong();

        String s1 = "Bonjour";
        String s2 = null;

        
        stringlong.LongueurSansException(s1);
        stringlong.LongueurSansException(s2);

        stringlong.LongueurAvecException(s1);
        stringlong.LongueurAvecException(s2);
    }

}
