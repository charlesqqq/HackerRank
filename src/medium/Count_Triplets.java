package medium;

import java.util.*;

public class Count_Triplets {
	
	public static void main(String[] args) {
		long res = countTriplets(Arrays.asList(1L, 2L, 1L, 2L, 4L), 2);
		System.out.println(res);
	}
	
	static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> rightMap = new HashMap<>();
		Map<Long, Long> leftMap = new HashMap<>();
		for (Long i : arr) {
			rightMap.put(i, rightMap.getOrDefault(i, 0L) + 1);
		}
		long res = 0;
		for (Long i : arr) {
			rightMap.put(i, rightMap.get(i) - 1);
			if (i % r == 0) {
				Long rightCount = rightMap.get(i * r);
				Long leftCount = leftMap.get(i / r);
				if (rightCount != null && leftCount != null) {
					res += rightCount * leftCount;
				}
			}
			leftMap.put(i, leftMap.getOrDefault(i, 0L) + 1);
		}
		return res;
	}
	
}
