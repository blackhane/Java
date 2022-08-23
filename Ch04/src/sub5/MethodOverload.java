package sub5;
/*
 * 날짜 : 2022 08 23
 * 이름 : 박진휘
 * 내용 : Java 메서드 오버로드 실습하기
 *  같은 메소드 이름을 매개변수로 구분할 수 있다.
 */
public class MethodOverload {
	
	public static void main(String[] args) {
		
		System.out.println(plus(1,2));
		System.out.println(plus(1,2,3));
		System.out.println(plus(1.0,2.1));
		System.out.println(plus("대한","민국"));
	}
	
	public static int plus(int a, int b) {
		return a+b;
	}
	public static int plus(int a, int b, int c) {
		return a+b+c;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	public static String plus(String a, String b) {
		return a+b;
	}

}
