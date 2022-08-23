package sub1;
/*
 * 날짜 : 2022 08 22
 * 이름 : 박진휘
 * 내용 : Java 배열 실습하기
 * 
 * 배열(Array)
 *  하나 이상의 데이터를 하나의 변수에 저장할 수 있는 자료구조
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		//배열
		int[]arr1 = {1,2,3,4,5};
		char[]arr2 = {'A', 'B', 'C', 'D', 'E'};
		String[]arr3 = {"봄", "여름", "가을", "겨울"};
		
		//배열 원소 출력
		System.out.println("arr1[0] : " +arr1[0]);
		System.out.println("arr1[1] : " +arr1[1]);
		System.out.println("arr1[2] : " +arr1[2]);
		System.out.println("arr2[0] : " +arr2[0]);
		System.out.println("arr2[1] : " +arr2[1]);
		System.out.println("arr3[2] : " +arr3[2]);
		System.out.println("arr3[3] : " +arr3[3]);
		
		//배열 길이
		System.out.println("arr1의 배열 길이 : " +arr1.length);
		System.out.println("arr2의 배열 길이 : " +arr2.length);
		System.out.println("arr3의 배열 길이 : " +arr3.length);
		
		//배열 반복문
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		for(char c : arr2) {
			System.out.print(c +" ");
		}
		
		System.out.println();
		
		for(String c : arr3) {
			System.out.print(c +" ");
		}
	}
}
