package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022 09 15
 * 이름 : 박진휘
 * 내용 : 코딩테스트 7-2 벌집
 */
public class _02 {

	public static void main(String[] args) {

		//방번호
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int result = 0;
		int i = 1;
		int j = 7;
		int count = 1;
		//1 7 19 37
		//	6 12 24
		
		while(true) {
			if (n == 1) {
				result = 1;
				break;
			} else if (i < n && n < j) {
				result = count;
				break;
			}
			i = j +1;
			j = j +(6*count);
			count++;
		}
		
		
		System.out.println(result);
	}
//End
}
