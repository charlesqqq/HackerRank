package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sales_by_Match {
	
	public static void main(String[] args) {
		int res = sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		System.out.println(res);
	}
	
	public static int sockMerchant(int n, List<Integer> ar) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer color : ar) {
			map.put(color, map.getOrDefault(color, 0) + 1);
		}
		int res = 0;
		for (Integer count : map.values()) {
			if (count >= 2) {
				res += count / 2;
			}
		}
		return res;
	}
}
