package sub4;
/*
 * 날짜 : 2022 09 07
 * 이름 : 박진휘
 * 내용 : Math 클래스 실습
 */
public class MathTest {

	public static void main(String[] args) {
		
		//수학관련 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(1.2));
		System.out.println("올림값 : " + Math.ceil(1.8));
		System.out.println("내림값 : " + Math.floor(1.2));
		System.out.println("내림값 : " + Math.floor(1.8));
		System.out.println("반올림 : " + Math.round(1.2));
		System.out.println("반올림 : " + Math.round(1.8));

		//random
		double num1 = Math.random();
		System.out.println(num1); //0~1 사이 랜덤 실수
		
		double num2 = num1 * 10;
		System.out.println(num2); //1~10 사이 랜덤 실수
		
		double num3 = Math.ceil(num2);
		System.out.println(num3); //1~10 사이 랜덤 정수
		
		int rnum = (int) Math.ceil(Math.random() * 10);
		System.out.println(rnum);
		
	}
}
