package sub01;
/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 자바 연산자 연습문제
 */
public class test03 {
	public static void main(String[] args) {
	
		int num = 1;
		int result = 0;
		
		result = num++;
		System.out.println("result : " +result);
		
		result = ++num;
		System.out.println("result : " +result);
		
		result = num--;
		System.out.println("result : " +result);
		
		result = --num;
		System.out.println("result : " +result);
	}
}
