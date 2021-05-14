package easy;

import java.util.*;

public class Hash_Tables_Ransom_Note {
	
	public static void main(String[] args) {
		checkMagazine(new ArrayList<>(Arrays.asList("give", "me", "one", "grand", "today", "night")),
				new ArrayList<>(Arrays.asList("give", "one", "grand", "today")));
	}
	
	public static void checkMagazine(List<String> magazine, List<String> note) {
		Map<String, Integer> map = new HashMap<>();
		for (String s : magazine) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (String s : note) {
			if (map.get(s) == null || map.get(s) == 0) {
				System.out.println("No");
				return;
			} else {
				map.put(s, map.get(s) - 1);
			}
		}
		System.out.println("Yes");
	}
}
