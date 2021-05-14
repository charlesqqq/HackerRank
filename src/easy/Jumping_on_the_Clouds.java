package easy;

import java.util.Arrays;
import java.util.List;

public class Jumping_on_the_Clouds {
	
	public static void main(String[] args) {
		int res = jumpingOnClouds(Arrays.asList(0, 0, 0, 0, 1, 0));
		System.out.println(res);
	}
	
	public static int jumpingOnClouds(List<Integer> c) {
		int size = c.size();
		int[] minJump = new int[size];
		minJump[0] = 0;
		minJump[1] = c.get(1) == 0 ? 1 : 0;
		for (int i = 2; i < size; i++) {
			if (c.get(i) == 0) {
				if (c.get(i - 2) == 0) {
					minJump[i] = minJump[i - 2] + 1;
				} else {
					minJump[i] = minJump[i - 1] + 1;
				}
			}
		}
		
		return minJump[size - 1];
	}
	
}
