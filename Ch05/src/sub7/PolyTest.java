package sub7;
/*
 * 날짜 : 2022 08 31
 * 이름 : 박진휘
 * 내용 : 다형성 실습하기
 * 
 * 다형성
 * 상속관계에서 부모클래스의 기능이 자식클래스에서 여러 기능으로 변하는 특성
 * 객체의 타입선언을 부모클래스 타입으로 선언하는 것
 * 다형성을 이용해서 프로그래밍의 중복을 줄이고 유연성을 높인다.
 */
public class PolyTest {

	public static void main(String[] args) {
		
		//다형성을 적용한 객체생성
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		//객체 타입 캐스팅
		//다운
		Tiger t = (Tiger)a1;
		Eagle e = (Eagle)a2;
		Shark s = (Shark)a3;
		
		t.hunt();
		e.hunt();
		s.hunt();
		
		//업
		Animal a4 = t;
		a4.move();
		
		//객체 타입 연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle입니다.");
		}
		if(a3 instanceof Shark) {
			System.out.println("a3는 Shark입니다.");
		}
		
	}
}
