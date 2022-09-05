package sub1;
/*
 * 날짜 : 2022 09 05
 * 이름 : 박진휘
 * 내용 : Java Object 클래스 실습
 */
public class ObjectTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("한국", 5000);
		Apple a3 = a1;
		
		a1.show();
		a2.show();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		//equals() : 객체 비교
		if(a1 == a2) {
			System.out.println("a1과 a2는 같다.");
		}else
			System.out.println("a1과 a2는 다르다.");
		
		if(a1.equals(a2)) {
			System.out.println("a1과 a2는 같다.");
		}else
			System.out.println("a1과 a2는 다르다.");
		
		//toString() : 객체 정보
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
	}
}
