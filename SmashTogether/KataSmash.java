package Kata;

public class KataSmash {

	/*
	 * Write a function that takes an array of words and smashes them together into
	 * a sentence and returns the sentence. You can ignore any need to sanitize
	 * words or add punctuation, but you should add spaces between each word. Be
	 * careful, there shouldn't be a space at the beginning or the end of the
	 * sentence!
	 */

	public static String smash(String... words) {
		String joined = String.join(" ", words);
		return joined;
	}

	public static void main(String[] args) {
		String[] arr = { "Ala", "Kot", "Pies", "tralala" };

		String wynik = smash(arr);

		System.out.println(wynik.equals("Ala Kot Pies tralala"));

	}

}
