package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022 09 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 7-7 설탕배달
 */

public class _07 {

	public static void main(String[] args) {

		//설탕kg
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = 0;
		
		if(n == 4 || n == 7) {
			result = -1;
		} else if(n%5 == 0){
			result = n/5;
		} else if(n%5 == 1 || n%5 ==3) {
			result = (n/5) +1;
		} else if(n%5 == 2 || n%5 ==4) {
			result = (n/5) +2;
		}
		System.out.println(result);
	}
//End
}
