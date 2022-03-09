package Kata;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Between {

	/*
	 * Complete the function that takes two integers (a, b, where a < b) and return
	 * an array of all integers between the input parameters, including them.
	 */

	public static int[] between(int a, int b) {

		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = a; i <= b; i++) {
			numbers.add(i);

		}

		Object[] arrBetween = numbers.toArray();

		int[] wynik = new int[arrBetween.length];

		for (int i = 0; i < arrBetween.length; i++) {
			wynik[i] = (int) arrBetween[i];
		}

		return wynik;
	}

	public static void main(String[] args) {


	    @Test
	    public void basicTests() {
	        assertArrayEquals(new int[]{1, 2, 3, 4}, between(1, 4));
	        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, between(-2, 2));
	    }	
	

		
	}

}
