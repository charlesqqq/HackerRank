package easy;

public class Strings_Making_Anagrams {
	
	public static void main(String[] args) {
		int res = makeAnagram("cde", "abc");
		System.out.println(res);
	}
	
	public static int makeAnagram(String a, String b) {
		int[] aChars = new int[26];
		int[] bChars = new int[26];
		for (char c : a.toCharArray()) {
			aChars[c - 'a']++;
		}
		for (char c : b.toCharArray()) {
			bChars[c - 'a']++;
		}
		for (int i = 0; i < aChars.length; i++) {
			if (bChars[i] > aChars[i]) {
				bChars[i] -= aChars[i];
				aChars[i] = 0;
			} else if (aChars[i] > bChars[i]) {
				aChars[i] -= bChars[i];
				bChars[i] = 0;
			} else {
				aChars[i] = bChars[i] = 0;
			}
		}
		
		int res = 0;
		for (int i = 0; i < aChars.length; i++) {
			res += aChars[i] + bChars[i];
		}
		return res;
	}
	
}
