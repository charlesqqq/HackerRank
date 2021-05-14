package medium;

import java.util.*;

public class Frequency_Queries {
	
	public static void main(String[] args) {
		List<Integer> res = freqQuery(Arrays.asList(
				Arrays.asList(1, 5),
				Arrays.asList(1, 6),
				Arrays.asList(3, 2),
				Arrays.asList(1, 10),
				Arrays.asList(1, 10),
				Arrays.asList(1, 6),
				Arrays.asList(2, 5),
				Arrays.asList(3, 2)
		));
		System.out.println(res);
	}
	
	/**
	 * 6 10 10 6
	 */
	static List<Integer> freqQuery(List<List<Integer>> queries) {
		Map<Integer, Integer> numMap = new HashMap<>();
		Map<Integer, Integer> freqMap = new HashMap<>();
		List<Integer> res = new ArrayList<>();
		for (List<Integer> query : queries) {
			Integer operation = query.get(0);
			Integer num = query.get(1);
			if (operation == 1) {
				Integer curFreq = numMap.getOrDefault(num, 0);
				Integer newFreq = curFreq + 1;
				numMap.put(num, newFreq);
				if (curFreq > 0) {
					freqMap.put(curFreq, freqMap.getOrDefault(curFreq, 0) - 1);
				}
				freqMap.put(newFreq, freqMap.getOrDefault(newFreq, 0) + 1);
			} else if (operation == 2) {
				Integer curFreq = numMap.getOrDefault(num, 0);
				Integer newFreq = curFreq - 1;
				if (curFreq > 0) {
					numMap.put(num, newFreq);
					freqMap.put(curFreq, freqMap.getOrDefault(curFreq, 0) - 1);
					freqMap.put(newFreq, freqMap.getOrDefault(newFreq, 0) + 1);
				}
			} else if (operation == 3) {
				res.add(freqMap.get(num) != null && freqMap.get(num) > 0 ? 1 : 0);
			}
		}
		return res;
	}
	
}
