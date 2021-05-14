package easy;

public class Alternating_Characters {
	
	public static void main(String[] args) {
		int res = alternatingCharacters("AAABBB");
		System.out.println(res);
	}
	
	public static int alternatingCharacters(String s) {
		char[] chars = s.toCharArray();
		char cur = chars[0];
		int res = 0;
		for (int i = 1; i < chars.length; i++) {
			char c = chars[i];
			if (c == cur) {
				res++;
			} else {
				cur = c;
			}
		}
		return res;
	}
}
