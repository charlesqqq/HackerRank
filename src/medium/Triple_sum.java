package medium;

import java.util.Arrays;

public class Triple_sum {
	
	public static void main(String[] args) {
		long res = triplets(new int[]{1, 3, 5, 7}, new int[]{5, 7, 9}, new int[]{7, 9, 11, 13});
		System.out.println(res);
	}
	
	static long triplets(int[] a, int[] b, int[] c) {
		a = Arrays.stream(a).sorted().distinct().toArray();
		b = Arrays.stream(b).sorted().distinct().toArray();
		c = Arrays.stream(c).sorted().distinct().toArray();
		long res = 0;
		for (Integer i : b) {
			res += search(a, i) * search(c, i);
		}
		return res;
	}
	
	private static long search(int[] arr, Integer i) {
		long count = 0;
		for (int j : arr) {
			if (i >= j) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
	
}
