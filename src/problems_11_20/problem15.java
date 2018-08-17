package problems_11_20;

import java.math.BigInteger;

/**
2 × 2 격자의 왼쪽 위 모서리에서 출발하여 오른쪽 아래 모서리까지 도달하는 길은 모두 6가지가 있습니다 (거슬러 가지는 않기로 합니다).
그러면 20 × 20 격자에는 모두 몇 개의 경로가 있습니까?
*/
public class problem15 {
	public static void main(String[] args) {
		BigInteger n =new BigInteger("1");
		BigInteger c =new BigInteger("1");
		BigInteger result =new BigInteger("0");
		for(int i=1;i<=40;i++) {
			n=n.multiply(BigInteger.valueOf(i));
		}
		for(int i=1;i<=20;i++) {
			c=c.multiply(BigInteger.valueOf(i));
		}
		c=c.multiply(c);
		result = n.divide(c);
		System.out.println(result);
	}
}