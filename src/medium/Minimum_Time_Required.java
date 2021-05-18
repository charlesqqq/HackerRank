package medium;

import java.util.Arrays;

public class Minimum_Time_Required {
	
	public static void main(String[] args) {
		long res = minTime(new long[]{2, 3}, 5);
		System.out.println(res);
	}
	
	static long minTime(long[] machines, long goal) {
		long max = Arrays.stream(machines).max().getAsLong();
		long minDays = 0;
		long maxDays = max * goal;
		long result = -1;
		while (minDays < maxDays) {
			long mid = (minDays + maxDays) / 2;
			long unit = 0;
			for (long machine : machines) {
				unit += mid / machine;
			}
			if (unit < goal) {
				minDays = mid + 1;
			} else {
				result = mid;
				maxDays = mid;
			}
		}
		return result;
	}
}
