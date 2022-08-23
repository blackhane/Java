package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 20
 * 이름 : 박진휘
 * 내용 : 코딩테스트 4-5 OX퀴즈
 */
public class _05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String [sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					count++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}

}
