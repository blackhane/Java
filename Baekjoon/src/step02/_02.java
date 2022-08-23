package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 2-2 시험 성적
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		if(num1 >= 90) {
			System.out.println("A");
		}
		else if(num1 >= 80) {
			System.out.println("B");
		}
		else if(num1 >= 70) {
			System.out.println("C");
		}
		else if(num1 >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		sc.close();
	}
	
}
