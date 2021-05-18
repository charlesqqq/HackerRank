package easy;

import java.util.Arrays;
import java.util.List;

public class Picking_Numbers {
	
	public static void main(String[] args) {
		int res = pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1));
		System.out.println(res);
	}
	
	public static int pickingNumbers(List<Integer> a) {
		int[] count = new int[101];
		for (int i = 0; i < a.size(); i++) {
			count[a.get(i)]++;
		}
		int res = 0;
		for (int i = 1; i < count.length; i++) {
			res = Math.max(res, count[i] + count[i - 1]);
		}
		return res;
	}
	
}
