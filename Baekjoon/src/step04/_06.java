package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 20
 * 이름 : 박진휘
 * 내용 : 코딩테스트 4-6 평균
 */
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); //테스트 케이스
		int [] arr; //배열 선언
		
		for(int i = 0; i < C; i++) {
			
			int N = sc.nextInt(); //학생 수
			arr = new int [N];
			
			double sum = 0; //점수의 합 초기화
			
			for(int j = 0; j < N; j++) { //학생수만큼 반복해서 점수넣기
				int score = sc.nextInt();
				arr[j] = score;
				sum += score; //점수의 합
			}
			
			double result = (sum / N); //합을 학생수로 나눈 평균
			double count = 0; // 평균보다 점수 높은 학생 수
			
			for(int j = 0; j < N; j++) { //학생수만큼 반복해서 점수가 평균보다 크면 카운트
				if(arr[j] > result) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100); //평균보다 점수가 큰 학생 / 전체 학생 수 / 100
			
		}
		
		sc.close();
	}

}
