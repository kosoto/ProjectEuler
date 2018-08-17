package problems_31_40;

import java.util.ArrayList;
import java.util.List;

/*
세 변의 길이가 모두 자연수 {a, b, c}인 직각삼각형의 둘레를 p 로 둘 때, p = 120 을 만족하는 직각삼각형은 아래와 같이 세 개가 있습니다.
{20, 48, 52}, {24, 45, 51}, {30, 40, 50}
1000 이하의 둘레 p에 대해서, 직각삼각형이 가장 많이 만들어지는 p의 값은 얼마입니까? 
 * */
public class problem_39 {
	public static void main(String[] args) {
		int p = 0;
		int a =3,b=4,c=5;
		int[]arr = {a,b,c};
		System.out.println(checkTriangle(arr));
		List<int[]> pythagoras = new ArrayList<>();
		if(checkTriangle(arr)) {
			pythagoras.add(arr);
		}
	
		
		
		
	}
	
	public static boolean checkTriangle(int[] arr) {
		int a = arr[0],b=arr[1],c=arr[2];
		return (c*c==(a*a+b*b));
		
	}
	
}
