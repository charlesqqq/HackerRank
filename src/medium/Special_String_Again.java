package medium;

public class Special_String_Again {
	
	public static void main(String[] args) {
		long res = substrCount(4, "abcbaba");
		System.out.println(res);
	}
	
	/**
	 * 0-5 6 7-12
	 * 0 1 2
	 * 3-6 7 8-11
	 * i=3 j=7
	 */
	static long substrCount(int n, String s) {
		long res = 0;
		for (int i = 0; i < s.length(); i++) {
			res++;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j)) {
					if (2 * j - i < s.length() && s.substring(i, j).equals(s.substring(j + 1, 2 * j - i + 1))) {
						res++;
						break;
					} else {
						break;
					}
				} else {
					res++;
				}
			}
		}
		return res;
	}
	
}
