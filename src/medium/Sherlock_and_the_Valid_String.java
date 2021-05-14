package medium;

import java.util.HashMap;
import java.util.Map;

public class Sherlock_and_the_Valid_String {
	
	public static void main(String[] args) {
		String res = isValid("abcdefghhgfedecba");
		System.out.println(res);
	}
	
	public static String isValid(String s) {
		int[] count = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				map.put(count[i], map.getOrDefault(count[i], 0) + 1);
			}
		}
		if (map.size() == 1) {
			return "YES";
		}
		if (map.size() > 2) {
			return "NO";
		}
		int minFreq = Integer.MAX_VALUE;
		int maxFreq = Integer.MIN_VALUE;
		for (Integer i : map.keySet()) {
			maxFreq = Math.max(maxFreq, i);
			minFreq = Math.min(minFreq, i);
		}
		int numOfMinFreq = 0;
		int numOfMaxFreq = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getKey() == minFreq) {
				numOfMinFreq = entry.getValue();
			}
			if (entry.getKey() == maxFreq) {
				numOfMaxFreq = entry.getValue();
			}
		}
		if (minFreq == 1 && numOfMinFreq == 1) {
			return "YES";
		}
		if (maxFreq - minFreq == 1 && numOfMaxFreq == 1) {
			return "YES";
		}
		return "NO";
	}
}
