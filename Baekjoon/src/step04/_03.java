package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 20
 * 이름 : 박진휘
 * 내용 : 코딩테스트 4-3 나머지
 */
public class _03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
			//arr[i]에 입력받은 값의 42로 나눈 나머지값
		}
		
		
		for(int i = 0; i < 10; i++) {
			int temp = 0;
			for(int j = i; j >= 0; j--) {
				if(arr[i] != arr[j]) {
					temp++;
				}
				if(temp == i)
					count++;
			}
		}
		System.out.println(count);

		sc.close();
}
}
