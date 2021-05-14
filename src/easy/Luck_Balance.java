package easy;

import java.util.Arrays;
import java.util.List;

public class Luck_Balance {
	
	public static void main(String[] args) {
		int res = luckBalance(3, Arrays.asList(
				Arrays.asList(5, 1),
				Arrays.asList(2, 1),
				Arrays.asList(1, 1),
				Arrays.asList(8, 1),
				Arrays.asList(10, 0),
				Arrays.asList(5, 0)
		));
	}
	
	public static int luckBalance(int k, List<List<Integer>> contests) {
		contests.sort((o1, o2) -> {
			if (o1.get(1) < o2.get(1)) {
				return -1;
			} else if (o1.get(1) > o2.get(1)) {
				return 1;
			} else {
				return o2.get(0) - o1.get(0);
			}
		});
		
		int res = 0;
		for (int i = 0; i < contests.size(); i++) {
			List<Integer> contest = contests.get(i);
			if (contest.get(1) == 0) {
				res += contest.get(0);
			} else {
				if (k > 0) {
					res += contest.get(0);
					k--;
				} else {
					res -= contest.get(0);
				}
			}
		}
		return res;
	}
	
}
