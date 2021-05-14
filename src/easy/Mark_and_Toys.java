package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Mark_and_Toys {
	
	public static void main(String[] args) {
		int res = maximumToys(Arrays.asList(1, 2, 3, 4), 7);
		System.out.println(res);
	}
	
	public static int maximumToys(List<Integer> prices, int k) {
		prices.sort(Comparator.naturalOrder());
		int res = 0;
		for (Integer price : prices) {
			if (k < price) {
				break;
			}
			k -= price;
			res++;
		}
		return res;
	}
}
