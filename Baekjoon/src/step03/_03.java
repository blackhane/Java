package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-3 n을 받고 1부터 n까지의 합
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
