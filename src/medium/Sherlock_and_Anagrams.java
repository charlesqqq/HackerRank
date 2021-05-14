package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sherlock_and_Anagrams {
	
	public static void main(String[] args) {
		int res = sherlockAndAnagrams("ifailuhkqq");
		System.out.println(res);
	}
	
	public static int sherlockAndAnagrams(String s) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String subStr = s.substring(i, j + 1);
				char[] chars = subStr.toCharArray();
				Arrays.sort(chars);
				subStr = String.valueOf(chars);
				map.put(subStr, map.getOrDefault(subStr, 0) + 1);
			}
		}
		int res = 0;
		for (Integer pairs : map.values()) {
			if (pairs > 1) {
				res += pairs * (pairs - 1) / 2;
			}
		}
		return res;
	}
}
