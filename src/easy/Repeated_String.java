package easy;

public class Repeated_String {
	
	public static void main(String[] args) {
		long res = repeatedString("a", 1000000000000L);
		System.out.println(res);
	}
	
	public static long repeatedString(String s, long n) {
		int aCount = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a') {
				aCount++;
			}
		}
		int len = s.length();
		long res = 0;
		res += n / len * aCount;
		for (int i = 0; i < n % len; i++) {
			if (s.charAt(i) == 'a') {
				res++;
			}
		}
		return res;
	}
}
