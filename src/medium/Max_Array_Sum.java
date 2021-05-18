package medium;

public class Max_Array_Sum {
	
	public static void main(String[] args) {
		int res = maxSubsetSum(new int[]{-2, 1, 3, -4, 5});
		System.out.println(res);
	}
	
	/**
	 * -2 1 3 -4 5
	 *  0 1 3  3 8
	 */
	static int maxSubsetSum(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = Math.max(0, arr[0]);
		dp[1] = Math.max(dp[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			dp[i] = Math.max(dp[i - 2] + Math.max(0, arr[i]), dp[i - 1]);
		}
		return dp[arr.length - 1];
	}
	
}
