package ch09;

public class AutoCar extends Car {

	@Override
	public void run() {
		System.out.println("차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}

}
