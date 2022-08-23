package sub3;
/*
 * 날짜 : 2022/08/17
 * 이름 : 박진휘
 * 내용 : Java 조건문 실습하기
 */
public class ForTest {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		//1부터 10까지 합
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1부터 10까지 짝수합
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				sum2 += i;
			}	
		}
		System.out.println(sum2);
		
		//중첩for
		for(int a = 1; a <= 3; a++) {
			System.out.println("a : " + a);
			for(int b = 1; b <= 5; b++) {
				System.out.println("b : " + b);
			}
		}
		
		//구구단
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
		
		//별삼각형
		for(int start = 10; start >= 1; start--) {
			for(int end = 1; end <= start; end++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
