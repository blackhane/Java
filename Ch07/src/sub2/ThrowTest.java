package sub2;
/*
 *  날짜 : 2022 09 05
 *  이름 : 박진휘
 *  내용 : 예외던지기 실습
 */
public class ThrowTest {

	public static void main(String[] args) {
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(1, 2);
		
		int r3 = 0, r4 = 0;
		try {
			r3 = cal.multi(1, 0);
			r4 = cal.div(1, 0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}
