package medium;

public class Common_Child {
	
	public static void main(String[] args) {
		int res = commonChild("SHINCHAN", "NOHARAAA");
		System.out.println(res);
	}
	
	/**
	 * * * S H I N C H A N
	 * * 0 0 0 0 0 0 0 0 0
	 * N 0 0 0 0 1 1 1 1 1
	 * O 0 0 0 0 1 1 1 1 1
	 * H 0 0 1 1 1 1 2 2 2
	 * A 0 0 1 1 1 1 2 3 3
	 * R 0 0 1 1 1 1 2 3 3
	 * A 0 0 1 1 1 1 2 3 3
	 * A 0 0 1 1 1 1 2 3 3
	 * A 0 0 1 1 1 1 2 3 3
	 */
	static int commonChild(String a, String b) {
		int n = a.length();
		int m = b.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a.charAt(i) == b.charAt(j)) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}
			}
		}
		return dp[n][m];
	}
	
}
