package sub5;
/*
 * 날짜 : 2022 08 29
 * 이름 : 박진휘
 * 내용 : Java 클래스 상속 실습
 * 
 * 상속
 * 기존 클래스의 속성과 기능을 그대로 자식 클래스로 물려주는 클래스 확장문법
 * 공통적인 로직 내용을 부모클래스에 두고 자식 클래스에서 상속 받아 일괄성 있는 프로그래밍 수행
 * 부모 클래스의 속성 접근권한은 protected 선언을 하여 자식 클래스만 사용할 수 있도록 수정
 */
class Parent{
	private int num1;
	private int num2;
	
	public Parent(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent{
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int n3, int n4) {
		super(num1, num2);
		this.num3 = n3;
		this.num4 = n4;
	}
	
	public int minus() {
		return num3 - num4;
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		
		Parent p = new Parent(1, 2);
		int r1 = p.plus();
	
		System.out.println(r1);
		
		Child c = new Child(1, 2, 3, 4);
		int r2 = c.plus();
		int r3 = c.minus();
		
		System.out.println(r2);
		System.out.println(r3);
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		Truck bongo = new Truck("봉고","파란색",0,0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.speedUp(100);
		bongo.load(100);
		bongo.show();

		stockAccount kb = new stockAccount("KB증권","101-11-1111","홍길동",0,"삼성전자",0,0);
		kb.deposit(1000000);
		kb.buy(10, 70000);
		kb.sell(5, 75000);
		kb.withdraw(200000);
		kb.show();
	}
}
