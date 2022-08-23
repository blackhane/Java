package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 2-3 윤년
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}

}
