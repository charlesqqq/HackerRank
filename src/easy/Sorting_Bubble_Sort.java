package easy;

import java.util.Arrays;
import java.util.List;

public class Sorting_Bubble_Sort {
	
	public static void main(String[] args) {
		countSwaps(Arrays.asList(6, 4, 1));
	}
	
	public static void countSwaps(List<Integer> a) {
		Integer[] arr = a.toArray(new Integer[0]);
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					count++;
				}
			}
		}
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[n - 1]);
	}
	
	private static void swap(Integer[] arr, Integer i, Integer j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
}
