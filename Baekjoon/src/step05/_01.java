package step05;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 26
 * 이름 : 박진휘
 * 내용 : 코딩테스트 5-1 정수 n개의 합
 */
public class _01 {
	
	long sum(int[] a) {
		
		long sum = 0;
			
		for(int i = 0; i < a.length; i++) {
			    sum += a[i];
			}
		
		return sum;
	}
}