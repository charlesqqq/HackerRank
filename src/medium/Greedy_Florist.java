package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Greedy_Florist {
	
	public static void main(String[] args) {
		int res = getMinimumCost(3, new int[]{1, 3, 5, 7, 9});
		System.out.println(res);
	}
	
	static int getMinimumCost(int k, int[] c) {
		List<Integer> list = Arrays.stream(c).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		int res = 0;
		for (int i = 0; i < list.size(); i++) {
			res += list.get(i) * (i / k + 1);
		}
		return res;
	}
	
}
