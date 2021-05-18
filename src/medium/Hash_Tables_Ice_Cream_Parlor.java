package medium;

import java.util.*;

public class Hash_Tables_Ice_Cream_Parlor {
	
	public static void main(String[] args) {
		whatFlavors(Arrays.asList(4, 3, 2, 5, 7), 8);
	}
	
	public static void whatFlavors(List<Integer> cost, int money) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < cost.size(); i++) {
			int price = cost.get(i);
			if (map.containsKey(price)) {
				map.get(price).add(i + 1);
			} else {
				List<Integer> indices = new ArrayList<>();
				indices.add(i + 1);
				map.put(price, indices);
			}
		}
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < cost.size(); i++) {
			int p1 = cost.get(i);
			int p2 = money - p1;
			if (p1 == p2 && map.get(p1).size() > 1) {
				idx1 = map.get(p1).get(0);
				idx2 = map.get(p1).get(1);
				break;
			} else if (p1 != p2 && map.containsKey(p2)) {
				idx1 = map.get(p1).get(0);
				idx2 = map.get(money - p1).get(0);
				break;
			}
		}
		System.out.println(idx1 + " " + idx2);
	}
}
