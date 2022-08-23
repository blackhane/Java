package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 20
 * 이름 : 박진휘
 * 내용 : 코딩테스트 4-1 최소값과 최대값
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int [] arr = new int [num];
		
		int max = -1000001;
		int min = 1000001;
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
			
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		
		System.out.printf("%d %d",min,max);
		
		sc.close();
		
	}

}
