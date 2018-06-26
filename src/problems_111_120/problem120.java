package problems_111_120;
import java.math.BigInteger;
/**
 * (a − 1)^n + (a + 1)^n 을 a^2으로 나누었을 때, 그 나머지를 r이라고 합시다.
예를 들어 a = 7 이고 n = 3 이라면, 6^3 + 8^3 = 728 ≡ 42 mod 49 이므로 r = 42입니다. 
  (역주: a ≡ b mod n 이라는 표기법은 a와 b를 각각 n으로 나눌 때 나머지가 같다는 뜻으로 보시면 됩니다) 
n이 바뀌면 r도 달라지겠지만, a = 7 일때 r의 최대값은 r_max = 42 임이 알려져 있습니다.
3 ≤ a ≤ 1000 이라고 할 때, ∑ r_max는 얼마입니까?*/
//???답이 안나와
public class problem120 {
	public static void main(String[] args) {
		/*long temp =0L;
		BigInteger temp1 = new BigInteger("0");
		long r=0L;
		BigInteger t1 = new BigInteger("0");
		long rMax = 0L;
		BigInteger rMax1 = new BigInteger("0");
		long sumOfrMax = 0L;
		BigInteger sumOfrMax1 = new BigInteger("0");
		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("0");
		
		for(int a=3;a<=3;a++) {
			rMax=0;
			rMax1 = new BigInteger("0");
			
			for(int n=1;n<50;n++) {
				temp=((int)(Math.pow((a-1), n))+(int)(Math.pow((a+1), n)));
				num1 = new BigInteger("a-1");
				num2 = new BigInteger("a+1");
				for(int i=0;i<n;i++) {
					num1 = num1.multiply(num1);
				}
				for(int i=0;i<n;i++) {
					num2 = num2.multiply(num2);
				}
				r=temp%(a*a);
				System.out.printf("%d %d %d %d\n",a,n,temp,r);
				rMax = (rMax<=r)?r:rMax;
				//System.out.println(rMax);
			}
			sumOfrMax+=rMax;
			
		}
		System.out.println(sumOfrMax);*/
		int count = 0;
	    for (int a = 3; a <= 1000; ++a) count += a*(a - 2 + (a & 1));
	    System.out.printf("count:%d\n", count);
	}
}
