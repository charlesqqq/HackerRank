package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Minimum_Absolute_Difference_in_an_Array {
	
	public static void main(String[] args) {
		int res = minimumAbsoluteDifference(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75));
		System.out.println(res);
	}
	
	public static int minimumAbsoluteDifference(List<Integer> arr) {
		arr.sort(Comparator.naturalOrder());
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < arr.size() - 1; i++) {
			int diff = Math.abs(arr.get(i) - arr.get(i + 1));
			res = Math.min(res, diff);
		}
		return res;
	}
	
}
