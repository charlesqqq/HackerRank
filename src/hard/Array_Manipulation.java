package hard;

import java.util.Arrays;
import java.util.List;

public class Array_Manipulation {
	
	public static void main(String[] args) {
		long res = arrayManipulation(5, Arrays.asList(
				Arrays.asList(1, 2, 100),
				Arrays.asList(2, 5, 100),
				Arrays.asList(3, 4, 100)
		));
		System.out.println(res);
	}
	
	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		long[] arr = new long[n + 1];
		for (List<Integer> query : queries) {
			arr[query.get(0) - 1] += query.get(2);
			arr[query.get(1)] -= query.get(2);
		}
		// 3 0 0 7 0 -2 0 0 -7 0
		long res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
			res = Math.max(res, arr[i]);
		}
		return res;
	}
	
}
