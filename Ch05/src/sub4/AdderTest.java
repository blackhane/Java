package sub4;
/*
 * 날짜 : 2022 08 25
 * 이름 : 박진휘
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 */
class Adder{
	public static int x;
	
	public void add(int _x) {
		x = _x;
	}
	public void add(int[] arr) {
		arr[0]++;
	}
	public static void add(Adder a1) {
		a1.x += 20;
	}
	public static Adder add(Adder a2, int value) {
		return new Adder();
	}

}

public class AdderTest {

	public static void main(String[] args) {
		
		int[]arr = new int[] {1,2,3};
		
		Adder adder = new Adder();
		
		adder.add(1);
		System.out.println(adder.x);
		
		adder.add(arr);
		System.out.println(adder.x);
		
		Adder.add(adder);
		System.out.println(adder.x);
		
		adder = Adder.add(adder,0);
		System.out.println(adder.x);
	}
}
