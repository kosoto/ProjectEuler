package problems_11_20;
/**
다음은 달력에 관한 몇 가지 일반적인 정보입니다 (필요한 경우 좀 더 연구를 해 보셔도 좋습니다).
1900년 1월 1일은 월요일이다.
4월, 6월, 9월, 11월은 30일까지 있고, 1월, 3월, 5월, 7월, 8월, 10월, 12월은 31일까지 있다.
2월은 28일이지만, 윤년에는 29일까지 있다.
윤년은 연도를 4로 나누어 떨어지는 해를 말한다. 하지만 400으로 나누어 떨어지지 않는 매 100년째는 윤년이 아니며, 400으로 나누어 떨어지면 윤년이다
20세기 (1901년 1월 1일 ~ 2000년 12월 31일) 에서, 매월 1일이 일요일인 경우는 총 몇 번입니까?
 * */
public class problem19 {
	public static void main(String[] args) {
		int day=1;
		int month=1;
		int count=0;
		for(int year = 1900;year<=2000;year++) {
			while(month<=12) {
				if((month<8 && month%2==1) ||(month>7 && month %2==0)) {
					day = addThirthOne(day);
				}else if(month == 4 || month == 6 || month == 9 || month == 11) {
					day = addThirth(day);
				}else if(month==2) {
					if(checkLeapYear(year)) {
						day = leapMonth(day);
					}else {
						day = addFebruary(day);
					}
				}
				count += (checkMonday(day) && year>1900)? 1:0;
				month++;
			}
			month=1;
		}
		System.out.println(count);
	}
	
	public static  int addThirthOne(int day) {
		return (day+31)%7;
	}
	
	public static int addThirth(int day) {
		return (day+30)%7;
	}
	
	public static int addFebruary(int day) {
		return (day+28)%7;
	}
	
	public static int leapMonth(int day) {
		return (day+29)%7;
	}
	
	public static boolean checkLeapYear(int year) {
		return (year %4 ==0 && year % 100 != 0 && year % 400 ==0);
	}
	
	public static boolean checkMonday(int day) {
		return (day%7==0);
	}
}