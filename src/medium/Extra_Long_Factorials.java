package medium;

import java.math.BigInteger;

public class Extra_Long_Factorials {
	
	public static void main(String[] args) {
		extraLongFactorials(25);
	}
	
	public static void extraLongFactorials(int n) {
		BigInteger bigInteger = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bigInteger);
	}
}
