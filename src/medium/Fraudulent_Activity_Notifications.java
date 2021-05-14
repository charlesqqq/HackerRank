package medium;

import java.util.*;

public class Fraudulent_Activity_Notifications {
	
	public static void main(String[] args) {
		int res = activityNotifications(new ArrayList<>(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5)), 5);
		System.out.println(res);
	}
	
	public static int activityNotifications(List<Integer> expenditure, int d) {
		int[] freq = new int[201];
		List<Integer> subList = expenditure.subList(0, d);
		for (Integer i : subList) {
			freq[i]++;
		}
		int res = 0;
		for (int i = d; i < expenditure.size(); i++) {
			float median;
			if (d % 2 == 0) {
				int first = find(d / 2, freq);
				int second = find(d / 2 + 1, freq);
				median = (first + second) / 2f;
			} else {
				median = find(d / 2 + 1, freq);
			}
			int spend = expenditure.get(i);
			if (spend >= median * 2) {
				res++;
			}
			freq[expenditure.get(i - d)]--;
			freq[spend]++;
		}
		return res;
	}
	
	private static int find(int target, int[] freq) {
		int cur = 0;
		for (int i = 0; i < freq.length; i++) {
			int count = freq[i];
			if (cur + count >= target) {
				return i;
			} else {
				cur += count;
			}
		}
		return -1;
	}
	
}
