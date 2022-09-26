package sub05;

import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 날짜 : 2022 09 23
 * 이름 : 박진휘
 * 내용 : 자바 총정리 연습문제
 * 
 * 윤년
 * 4년마다 2월을 하루 늘린 해
 * 4로 나누어지고 100으로 나누어지지 않는 해
 * 400으로 나누어 떨어지는해
 */
public class Test06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year%4 == 0) && (!((year/100) == 0) || (year/400) == 0))
			System.out.printf("%d는 윤년입니다. \n",year);
		else
			System.out.printf("%d는 평년입니다. \n",year);
		
		GregorianCalendar greCal = new GregorianCalendar();
		
		if(greCal.isLeapYear(year))
			System.out.printf("%d는 윤년입니다. \n",year);
		else
			System.out.printf("%d는 평년입니다. \n",year);
	}

}
