package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 1-10 체스말 정리하기
 */
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ches1 = sc.nextInt();
		int ches2 = sc.nextInt();
		int ches3 = sc.nextInt();
		int ches4 = sc.nextInt();
		int ches5 = sc.nextInt();
		int ches6 = sc.nextInt();
		
		int ch1 = 1;
		int ch2 = 1;
		int ch3 = 2;
		int ch4 = 2;
		int ch5 = 2;
		int ch6 = 8;
		
		System.out.print((ches1 - ch1) * -1 +" ");
		System.out.print((ches2 - ch2) * -1 +" ");
		System.out.print((ches3 - ch3) * -1 +" ");
		System.out.print((ches4 - ch4) * -1 +" ");
		System.out.print((ches5 - ch5) * -1 +" ");
		System.out.print((ches6 - ch6) * -1 +" ");
		
		sc.close();
		
	}
}
