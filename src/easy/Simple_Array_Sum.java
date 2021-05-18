package easy;

import java.util.List;

public class Simple_Array_Sum {
	
	public static int simpleArraySum(List<Integer> ar) {
		return ar.stream().mapToInt(i -> i).sum();
	}
}
