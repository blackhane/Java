package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 20
 * 이름 : 박진휘
 * 내용 : 코딩테스트 4-2 랜덤한 자연수 중에 최대값
 */
public class _02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [9];
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
				sum = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(sum);
		
		sc.close();
	}

}
