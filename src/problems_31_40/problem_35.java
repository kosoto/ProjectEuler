package problems_31_40;
/*소수 중에서 각 자리의 숫자들을 순환시켜도 여전히 소수인 것을 circular prime이라고 합니다. 
예를 들어 197은 971, 719가 모두 소수이므로 여기에 해당합니다.
이런 소수는 100 밑으로 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97 처럼 13개가 있습니다.
그러면 1,000,000 밑으로는 모두 몇 개나 있을까요?*/
public class problem_35 {
	public static void main(String[] args) {
		boolean ckprime = isPrime(14);
		System.out.println(ckprime);
	}
	
	public static boolean isPrime(int num) {
		boolean flag = true;
		Loop : for(int i=2;i<num/2;i++) {
			if(num%i == 0) {
				flag = false; break Loop;
			}
		}
		
		return flag;
	}
	public static boolean isCircularPrime(int num) {
		boolean flag = false;
		
		return flag;
	}
	public static int circular(int num) {
		int res=0;
		String no = String.valueOf(num);
		String a = "";
		if(no.length()>1) {
			for(int i=0;i<no.length()-1;i++) {
				a +=  Character.toString(no.charAt(i+1)) ;
			}
			a+=no.charAt(0);
			isPrime(Integer.parseInt(a));
		}
		
		return res;
	}
}
