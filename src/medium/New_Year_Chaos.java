package medium;

import java.util.Arrays;
import java.util.List;

public class New_Year_Chaos {
	
	public static void main(String[] args) {
		minimumBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
	}
	
	public static void minimumBribes(List<Integer> q) {
		int res = 0;
		Integer[] arr = q.toArray(new Integer[0]);
		for (int i = arr.length - 1; i >= 0; i--) {
			int curPos = i + 1;
			if (arr[i] != curPos) {
				if (arr[i - 1] == curPos) {
					swap(arr, i - 1, i);
					res += 1;
				} else if (arr[i - 2] == curPos) {
					swap(arr, i - 2, i - 1);
					swap(arr, i - 1, i);
					res += 2;
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(res);
	}
	
	private static void swap(Integer[] arr, int i, int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
}
