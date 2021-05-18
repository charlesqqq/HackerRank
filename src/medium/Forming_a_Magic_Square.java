package medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Forming_a_Magic_Square {
	
	public static void main(String[] args) {
		formingMagicSquare(Arrays.asList(
				Arrays.asList(5, 3, 4),
				Arrays.asList(1, 5, 8),
				Arrays.asList(6, 4, 2)
		));
	}
	
	public static int formingMagicSquare(List<List<Integer>> s) {
		int[][] posibilities = new int[][]{
				{4, 9, 2, 3, 5, 7, 8, 1, 6},
				{4, 3, 8, 9, 5, 1, 2, 7, 6},
				{6, 7, 2, 1, 5, 9, 8, 3, 4},
				{8, 1, 6, 3, 5, 7, 4, 9, 2},
				{6, 1, 8, 7, 5, 3, 2, 9, 4},
				{2, 9, 4, 7, 5, 3, 6, 1, 8},
				{8, 3, 4, 1, 5, 9, 6, 7, 2},
				{2, 7, 6, 9, 5, 1, 4, 3, 8}
		};
		
		Integer[] arr = s.stream().flatMap(Collection::stream).toArray(Integer[]::new);
		int minCost = Integer.MAX_VALUE;
		for (int i = 0; i < posibilities.length; i++) {
			int cost = 0;
			for (int j = 0; j < arr.length; j++) {
				cost += Math.abs(posibilities[i][j] - arr[j]);
			}
			minCost = Math.min(minCost, cost);
		}
		return minCost;
	}
}
