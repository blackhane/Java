package sub3;
/*
 * 날짜 : 2022 08 23
 * 이름 : 박진휘
 * 내용 : Java 메서드 실습하기
 *  - 클래스 안에 선언된 변수 = 전역변수
 *  - 메서드 안에서 선언된 변수 = 지역변수
 *  - 메서드 밖에서 선언된 변수 = 멤버변수
 *  - 메서드가 받는 인자값 = 매개변수
 */
public class MethodTest {

	public static void main(String[] args) {
		int z1 = f(1);
		int z2 = f(2);
		int z3 = f(3);
		System.out.printf("%s, %s, %s",z1, z2, z3);
		System.out.println();
		//메서드 스택
		int result1 = sum(1,10);
		int result2 = sum(1,100);
		System.out.println(result1);
		System.out.println(result2);
	}
	
	//메서드 정의
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	public static int sum(int start, int end) {
		int total = 0;
		for(int i = start; i <= end; i++) {
			total += i;
		}
		return total;
	}
}
