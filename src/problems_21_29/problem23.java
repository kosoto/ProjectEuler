package problems_21_29;

public class problem23 {
	public static void main(String[] args) {
	String temp ="";
	int num =0;
	int sum = 0;
	int max =0;
		for(int a=1;a<100;a++) {
		for(int b=1;b<100;b++) {
			temp = String.valueOf(Math.pow(a, b));
			System.out.println(temp);
			for(int i=0;i<temp.length();i++) {
				num = Character.getNumericValue(temp.charAt(i)); 
				sum += num;
				//System.out.println(sum);
				max = (sum>max)?sum:max;
				//System.out.println(max);
			}
		}
	}
		System.out.println(max);
	}
}
