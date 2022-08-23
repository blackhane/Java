package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-11 0 0이 들어올 때까지 A+B를 출력
 */
public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0)
				break;
			
			System.out.println(A+B);
		}
		sc.close();
	}

}
