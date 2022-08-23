package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-4 영수증 금액 확인하기
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}
		
		if(X == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
