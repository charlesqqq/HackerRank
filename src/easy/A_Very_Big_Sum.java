package easy;

import java.util.List;

public class A_Very_Big_Sum {
	
	public static long aVeryBigSum(List<Long> ar) {
		return ar.stream().mapToLong(i -> i).sum();
	}
}
