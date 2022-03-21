
package strings;



public class Main {
	public static void main(String[] args) {
		
		EditString string = new EditString(args[0]);
		String arg2 = args[1];


		// Number of chars
		System.out.println("1) " +  string.stringLength());
		// First and last letter
		System.out.println("2) " + string.firstandLast());
		// Substring from index 4 
		System.out.println("3) " + string.substringFrom4());
		//Substring from 4 without last letter
		System.out.println("4) " + string.substringWithoutLastLetter());
		//How many times second arg is in first arg
		System.out.println("5) " + string.countSubstring(arg2));
		// tab of words separated by a "_"
		System.out.println("6) " + string.createTab());
		// Whether the first word matches the last?
		System.out.println("7) " + string.checklWord());
		
		
	}
}
