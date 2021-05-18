package medium;

import java.util.*;

public class Pairs {
	
	public static void main(String[] args) {
		int res = pairs(2, Arrays.asList(1, 5, 3, 4, 2));
		System.out.println(res);
	}
	
	public static int pairs(int k, List<Integer> arr) {
		Set<Integer> set = new HashSet<>(arr);
		int res = 0;
		for (Integer i : arr) {
			if (set.contains(i) && set.contains(i + k)) {
				res++;
			}
		}
		return res;
	}
}
