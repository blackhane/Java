package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 2-6 오븐 시계
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int Cook = sc.nextInt();
		
		if(M + Cook < 60) {
			M = M + Cook; //x분 + Cook시간이 60을 안넘으면 x분에 더하고 끝
		}
		else {
			if(M + Cook >= 60) {
				H += (M + Cook) / 60; //x분에 Cook시간을 더해서 나누기 60하면 시간
				M = (M + Cook) % 60; //시간의 나머지는 자연스럽게 x분
			}
			
		}
		
		if(H >= 24)
			H -= 24; //24시를 초과하면 -24시로 0시가 됨
		
		System.out.println(H +" "+ M);
		sc.close();
	}

}
