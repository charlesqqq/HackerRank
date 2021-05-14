package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Left_Rotation {
	
	public static void main(String[] args) {
		List<Integer> res = rotLeft(Arrays.asList(1, 2, 3, 4, 5), 4);
		System.out.println(res);
	}
	
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		int len = a.size();
		List<Integer> res = new ArrayList<>();
		for (int i = d; i < len; i++) {
			res.add(a.get(i));
		}
		for (int i = 0; i < d; i++) {
			res.add(a.get(i));
		}
		return res;
	}
}
