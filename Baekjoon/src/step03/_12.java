package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-12 입력이 없을 때까지 A+B를 출력
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
		sc.close();
	}

}