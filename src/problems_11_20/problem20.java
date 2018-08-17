package problems_11_20;

import java.math.BigInteger;

//100! 의 자리수를 모두 더하면 얼마입니까?
public class problem20 {
	public static void main(String[] args) {
		BigInteger num = new BigInteger("1");
		for(int i=2;i<=100;i++) {
			BigInteger temp = new BigInteger(String.valueOf(i));
			num = num.multiply(temp);
		}
		int val = 0;
		for(int j=0;j<num.toString().length();j++) {
			val += Character.getNumericValue(num.toString().charAt(j));
		}
		System.out.println("aa : "+val);
	}
}
