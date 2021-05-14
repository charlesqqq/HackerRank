package easy;

public class Counting_Valleys {
	
	public static void main(String[] args) {
		int res = countingValleys(8, "DDDDUDUU");
		System.out.println(res);
	}
	
	public static int countingValleys(int steps, String path) {
		int curHeight = 0;
		int count = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'D') {
				if (curHeight == 0) {
					count++;
				}
				curHeight--;
			} else {
				curHeight++;
			}
		}
		return count;
	}
}
