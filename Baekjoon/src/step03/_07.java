package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-7 A+B 출력 업그레이드
 */
public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
		
		sc.close();
	}

}
