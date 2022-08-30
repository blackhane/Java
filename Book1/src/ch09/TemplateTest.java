package ch09;

public class TemplateTest {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Template myCar = new AiCar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Template hiscar = new ManualCar();
		hiscar.run();
	}
}
