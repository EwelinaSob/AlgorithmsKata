package Kata;


public class KataTest {

	// Complete the solution so that it reverses all of the words within the string passed in.
	
		public static String reverse(String s) {
    	String[] splitted;
    	StringBuffer sb = new StringBuffer();
    	String wynik = null;

    	String s1 = s.trim();
    	splitted = s1.split(" ");
    	
    	for (int i = splitted.length - 1; i >= 0; i--) {

		sb.append(splitted[i]).append(" ");
		wynik = sb.toString().trim();
		}
    	
        return wynik;
    }

		public static void main(String[] args) {
		

		String tekst = "yoda doesn't speak like this";
		String reverse = reverse(tekst);
		System.out.print(reverse);
		

	}

}
