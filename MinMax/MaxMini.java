package Kata;

import java.util.*;

public class MaxMini {

	// Write a function that returns both the minimum and maximum number of the given list/array.

	public static int[] minMax(int[] arr) {
		Arrays.sort(arr);

		int mini = arr[0];
		int max = arr[arr.length - 1];
		int[] result = { mini, max };

		return result;

	}

	public static void main(String[] args) {

		int[] result =
				 MaxMini.minMax(new int[]{1,2,3,4,5});
				//MaxMini.minMax(new int[] { 2334454, 5 });
	
		System.out.println("Mini: " + result[0] + "\n" + "Max: " +  result[1]);

	}

}
