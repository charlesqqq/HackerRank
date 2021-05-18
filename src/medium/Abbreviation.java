package medium;

public class Abbreviation {
	
	public static void main(String[] args) {
		String res = abbreviation("daBcd", "ABC");
		System.out.println(res);
	}
	
	
	/**
	 * * * A B C
	 * * 1 0 0 0
	 * d 1 0 0 0
	 * a 1 1 0 0
	 * B 0 0 1 0
	 * c 0 0 1 1
	 * d 0 0 1 1
	 */
	public static String abbreviation(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		boolean dp[][] = new boolean[aLen + 1][bLen + 1];
		dp[0][0] = true;
		for (int i = 0; i < aLen; i++) {
			for (int j = 0; j <= bLen; j++) {
				if (dp[i][j]) {
					if (j < bLen && Character.toUpperCase(a.charAt(i)) == b.charAt(j)) {
						dp[i + 1][j + 1] = true;
					}
					if (Character.isLowerCase(a.charAt(i))) {
						dp[i + 1][j] = true;
					}
				}
			}
		}
		return dp[aLen][bLen] ? "YES" : "NO";
	}
}
