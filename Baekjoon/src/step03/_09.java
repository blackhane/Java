package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-9 별 찍기2
 */
public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			for(int j=N-i; j>=1; j--) {
			System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}