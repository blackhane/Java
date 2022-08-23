package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-2 주어진 횟수만큼 A+B 출력
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
			
			i++;
		}
		
		sc.close();
	}

}
