package medium;

import java.util.*;

public class Climbing_the_Leaderboard {
	
	public static void main(String[] args) {
		List<Integer> result = climbingLeaderboard(
				new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10)),
				new ArrayList<>(Arrays.asList(5, 25, 50, 120)));
		System.out.println(result);
	}
	
	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		int curRank = 1;
		for (Integer score : ranked) {
			if (!treeMap.containsKey(score)) {
				treeMap.put(score, curRank++);
			}
		}
		
		List<Integer> result = new ArrayList<>();
		for (Integer score : player) {
			Integer floorScore = treeMap.floorKey(score);
			if (floorScore == null) {
				result.add(treeMap.size() + 1);
			} else {
				result.add(treeMap.get(floorScore));
			}
		}
		
		return result;
	}
}
