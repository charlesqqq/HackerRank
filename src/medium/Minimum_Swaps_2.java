package medium;

public class Minimum_Swaps_2 {
	
	public static void main(String[] args) {
		int res = minimumSwaps(new int[]{2, 3, 4, 1, 5});
		System.out.println(res);
	}
	
	/**
	 * 2 3 4 1 5
	 * 3 2 4 1 5
	 * 4 2 3 1 5
	 * 1 2 3 4 5
	 */
	static int minimumSwaps(int[] arr) {
		int res = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != i + 1) {
				res++;
				swap(arr, i, arr[i] - 1);
			} else {
				i++;
			}
		}
		return res;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
