package sub03;
/*
 * 날짜 : 2022 09 02
 * 이름 : 박진휘
 * 내용 : 자바 클래스 연습문제
 */
abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
	
}
class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
	
}

public class Test09 {

	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(Shape obj) {
		obj.draw();
	}
}
