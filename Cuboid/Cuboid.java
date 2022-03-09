package Kata;

public class Cuboid {

	/*
	 * In this simple exercise, you will create a program that will take two lists
	 * of integers, a and b. Each list will consist of 3 positive integers above 0,
	 * representing the dimensions of cuboids a and b. You must find the difference
	 * of the cuboids' volumes regardless of which is bigger. For example, if the
	 * parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the
	 * volume of b is 20. Therefore, the function should return 8.
	 */

	public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

		int result;
		int first = 1;
		int second = 1;
		for (int elt : firstCuboid)
			first *= elt;
		for (int elt2 : secondCuboid)
			second *= elt2;

		result = Math.abs(first - second); 
		return result;
	}

	public static void main(String[] args) {

		int[] firstC = new int[] { 3, 2, 5 }; // 30
		int[] secondC = new int[] { 1, 4, 4 }; // 16
		int resultC = findDifference(firstC, secondC);

		System.out.println(resultC);

	}

}
