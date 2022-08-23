package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-10 X보다 작은 숫자
 */
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			int A = sc.nextInt();
			
			if(A < X) {
				System.out.print(A +" ");
			}
		}
		sc.close();
	}

}
