package medium;

import java.util.Arrays;
import java.util.List;

public class Candies {
	
	public static void main(String[] args) {
		long res = candies(6, Arrays.asList(1, 4, 3, 2, 3, 3, 6, 5, 7, 7, 6));
		System.out.println(res);
	}
	
	/**
	 * 4 6 4 5 6 2
	 * 1 2 1 2 3 1
	 * 1 2 1 2 3 1
	 * <p>
	 * 1 4 3 2 3 3 6 5 7 7 6
	 * 1 2 1 1 2 1 2 1 2 1 1
	 * 1 3 2 1 2 1 2 1 2 2 1
	 */
	public static long candies(int n, List<Integer> arr) {
		long[] candies = new long[arr.size()];
		candies[0] = 1;
		for (int i = 1; i < arr.size(); i++) {
			candies[i] = arr.get(i) > arr.get(i - 1) ? candies[i - 1] + 1 : 1;
		}
		for (int i = arr.size() - 2; i >= 0; i--) {
			if (arr.get(i) > arr.get(i + 1) && candies[i] <= candies[i + 1]) {
				candies[i] = candies[i + 1] + 1;
			}
		}
		return Arrays.stream(candies).sum();
	}
}
