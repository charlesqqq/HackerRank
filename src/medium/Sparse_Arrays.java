package medium;

import java.util.*;

public class Sparse_Arrays {
	
	public static void main(String[] args) {
		List<Integer> res = matchingStrings(Arrays.asList("aba", "baba", "aba", "xzxb"), Arrays.asList("aba", "xzxb", "ab"));
		System.out.println(res);
	}
	
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		Map<String, Integer> map = new HashMap<>();
		List<Integer> res = new ArrayList<>();
		for (String string : strings) {
			map.put(string, map.getOrDefault(string, 0) + 1);
		}
		
		for (String query : queries) {
			res.add(map.getOrDefault(query, 0));
		}
		return res;
	}
	
}
