package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 3-13 더하기 사이클
 */
public class _13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int copy = N;
		int count = 0;
		
		do {
			N = ((N % 10) * 10) + (((N/10) + (N % 10)) % 10);
			//AB라는 두 자리, B는 새로운 십의 자리로, A+B의 일의 자리는 새로운 일의 자리로
			//AB가 다시 원래자리로 돌아 올 때까지 반복
			count++;
		} while(copy != N);
		
		System.out.println(count);
		
		sc.close();
	}

}
