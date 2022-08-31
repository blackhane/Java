package ch10;

public class HeapSort implements Sort{

	@Override
	public void ascedning(int[] arr) {
		System.out.println("HeapSort acscedning");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("HeapSort입니다.");
	}

}
