package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 1-12 곱셈
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int B3 = B / 100;
		int B2 = B % 100 / 10;
		int B1 = B % 100 % 10;
		
		
		System.out.println(A * B1);
		System.out.println(A * B2);
		System.out.println(A * B3);
		System.out.println(A * B);
		
		sc.close();
	}

}
