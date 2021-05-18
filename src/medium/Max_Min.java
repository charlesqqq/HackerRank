package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max_Min {
	
	public static void main(String[] args) {
		int res = maxMin(3, Arrays.asList(10, 100, 300, 200, 1000, 20, 30));
		System.out.println(res);
	}
	
	public static int maxMin(int k, List<Integer> arr) {
		arr.sort(Comparator.naturalOrder());
		int res = Integer.MAX_VALUE;
		for (int i = k; i <= arr.size(); i++) {
			res = Math.min(res, arr.get(i - 1) - arr.get(i - k));
		}
		return res;
	}
}
