package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_the_Triplets {
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> res = new ArrayList<>();
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				alice++;
			} else if (a.get(i) < b.get(i)) {
				bob++;
			}
		}
		return Arrays.asList(alice, bob);
	}
}
