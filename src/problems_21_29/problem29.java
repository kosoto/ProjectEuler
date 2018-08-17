package problems_21_29;

import java.util.HashSet;
import java.util.Set;

public class problem29 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		for(int a=2;a<=100;a++) {
			for(int b=2;b<=100;b++) {
				set.add(String.valueOf(Math.pow(a, b)));
			}
		}
		System.out.println(set.size());
	}
}
