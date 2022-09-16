package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022 09 15
 * 이름 : 박진휘
 * 내용 : 코딩테스트 7-1 손익분기점
 */
public class _01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//고정비 A
		int A = sc.nextInt();
		//가변비 B
		int B = sc.nextInt();
		//판매가 C
		int C = sc.nextInt();
		sc.close();
		
		if(B >= C) {
			System.out.println("-1");
		}else {
			System.out.println(A/(C-B) +1);
		}
	}

}
