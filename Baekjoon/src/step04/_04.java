package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 20
 * 이름 : 박진휘
 * 내용 : 코딩테스트 4-4 평균값 / 최대값 * 100
 */
public class _04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		float [] arr = new float[num];
		float max = 0;
		float sum = 0;
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			max = arr[i] > max ? arr[i] : max;
			sum += arr[i];
		}
		float result = ((sum/num) / max) * 100;
		
		System.out.println(result);
		
		sc.close();
	}
}

