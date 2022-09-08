package sub1;
/*
 * 날짜 : 2022 09 08
 * 이름 : 박진휘
 * 내용 : 제네릭 실습
 * 
 * 제네릭(Generic)
 * 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 * 제네릭 문법으로 클래스를 범용성을 갖도록 활용
 */
public class GenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("대만", 2500);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(a);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(b);
		
		box1.getFruit().show();
		box2.getFruit().show();
		
	}
}
