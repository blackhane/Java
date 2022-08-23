package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 2-5 알람 시계
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M >= 45) //45분보다 클 때
			M -= 45;
		else {
			if(H == 0) // 0시면 -시가 되니깐 23시가 됨
				H = 23;
			else{
				H -= 1; // 그 이외에는 -1시
			}
			M = 60 - (45 - M); //45분보다 작을 때
		}
		System.out.println(H +" "+ M);
		
		sc.close();
	}

}
