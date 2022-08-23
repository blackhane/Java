package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-1 구구단 N단 출력
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
		sc.close();
	}

}
