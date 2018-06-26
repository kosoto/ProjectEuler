package problems_10_19;

import java.math.BigInteger;

/**
2^15 = 32768 의 각 자리수를 더하면 3 + 2 + 7 + 6 + 8 = 26 입니다.
2^1000의 각 자리수를 모두 더하면 얼마입니까?*/
public class problem16 {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("1");
		String temp = "";
		int result=0;
		for(int i=0;i<1000;i++) {
			n = n.multiply(BigInteger.valueOf(2));
		}
		temp = n.toString();
		for(int i=0;i<temp.length();i++) {
			result+=Character.getNumericValue(temp.charAt(i));
		}
		System.out.println(result);
	}
}
