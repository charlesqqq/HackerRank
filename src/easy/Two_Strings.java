package easy;

import java.util.HashSet;
import java.util.Set;

public class Two_Strings {
	
	public static void main(String[] args) {
		String res = twoStrings("hello", "world");
		System.out.println(res);
		res = twoStrings("hi", "world");
		System.out.println(res);
	}
	
	public static String twoStrings(String s1, String s2) {
		Set<Character> set = new HashSet<>();
		for (char c : s1.toCharArray()) {
			set.add(c);
		}
		for (char c : s2.toCharArray()) {
			if (set.contains(c)) {
				return "YES";
			}
		}
		return "NO";
	}
}
