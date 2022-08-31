package ch10;

public class BubbleSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("BubbleSort acscedning");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("BubbleSort입니다.");
	}
	
}
