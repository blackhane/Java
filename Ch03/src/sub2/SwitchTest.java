package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/17
 * 이름 : 박진휘
 * 내용 : Java 조건문 실습하기
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		//사용자 입력
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("입력한 숫자 : " + number);

		switch(number % 2) {
		
		case 0:{
			System.out.println("입력한 값은 짝수입니다.");
			break;
		}
		
		case 1:{
			System.out.println("입력한 값은 홀수입니다.");
			break;
		}
		
		}
	}

}
