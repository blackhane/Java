package sub06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022 09 26
 * 이름 : 박진휘
 * 내용 : 자바 총정리 연습문제
 */
public class Test07 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0, b=0, c=0;
		
		try {
			System.out.print("첫번쨰 수 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두번쨰 수 : ");
			b = Integer.parseInt(br.readLine());
			System.out.print("세번쨰 수 : ");
			c = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("가장 큰 수는 %d입니다.", larger(a,(larger(b,c))));
		
	}
	
	public static int larger(int a, int b) {
		return(a >= b) ? a: b;
	}

}
