package easy;

import java.util.Arrays;
import java.util.List;

public class TwoD_Array_DS {
	
	public static void main(String[] args) {
		int res = hourglassSum(Arrays.asList(
				Arrays.asList(-9, -9, -9, 1, 1, 1),
				Arrays.asList(0, -9, 0, 4, 3, 2),
				Arrays.asList(-9, -9, -9, 1, 2, 3),
				Arrays.asList(0, 0, 8, 6, 6, 0),
				Arrays.asList(0, 0, 0, -2, 0, 0),
				Arrays.asList(0, 0, 1, 2, 4, 0)
		));
		System.out.println(res);
	}
	
	public static int hourglassSum(List<List<Integer>> arr) {
		int res = Integer.MIN_VALUE;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				int sum = arr.get(i - 1).get(j - 1);
				sum += arr.get(i - 1).get(j);
				sum += arr.get(i - 1).get(j + 1);
				sum += arr.get(i).get(j);
				sum += arr.get(i + 1).get(j - 1);
				sum += arr.get(i + 1).get(j);
				sum += arr.get(i + 1).get(j + 1);
				res = Math.max(res, sum);
			}
		}
		return res;
	}
	
}
