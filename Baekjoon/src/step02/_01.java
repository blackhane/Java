package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 2-1 두 수 비교하기
 */
public class _01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("==");
		}
		else if(num1 > num2) {
			System.out.println(">");
		}
		else {
			System.out.println("<");
		}
		
		sc.close();
	}
}
