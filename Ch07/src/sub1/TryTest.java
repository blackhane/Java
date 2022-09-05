package sub1;
/*
 * 날짜 : 2022 09 05 
 * 이름 : 박진휘
 * 내용 : 예외처리 실습
 * 
 * 예외처리
 * 예외는 프로그램 실행중에 발생하는 모든 오류
 * 실행중에 발생하는 오류를 대처하고 안정적인 프로그램 개발을 위해 예외처리 수행
 */
public class TryTest {

	  public static void main(String[] args) {
		
		  //예외상황 1: 어떤 수를 0으로 나눌 때
		 int num1 = 1;
		 int num2 = 0;
		 int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		 
		 try { 
			 //예외가 발생할 수 있는 코드
			 r1 = num1 + num2;
			 r2 = num1 - num2;
			 r3 = num1 * num2;
			 r4 = num1 / num2;
		 }catch(Exception e) { 
			 //예외가 발생 했을 때 처리할 코드
			 e.printStackTrace();
		 }
		 
		 System.out.println("r1 : " + r1);
		 System.out.println("r2 : " + r2);
		 System.out.println("r3 : " + r3);
		 System.out.println("r4 : " + r4);
		 
		  //예외상황 2: 배열의 Index값 보다 많을 때
		 int[] arr = {1,2,3,4,5};
		 
		 try {
			 for(int i = 0; i <= 5; i++) {
				 System.out.println("arr["+i+"] : " + arr[i]);
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		  //예외상황 3: Null 포인트 참조
		 Animal animal = null;
		  
		 try {
			 animal.move();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		  
		  //예외상황 4: Casting 에러
		 Animal a1 = new Tiger();
		 Animal a2 = new Eagle();
		 
		 try {
		 Eagle eagle = (Eagle) a1;
		 eagle.move();
		 }catch(Exception e) {
			 Tiger tiger = (Tiger) a1;
			 tiger.move();
			 tiger.hunt();
		 }finally {
			 //정리 코드
			 System.out.println("캐스팅 완료");
		 }
		 
		 System.out.println("프로그램 종료...");
		 System.out.println("프로그램 종료...");
		 System.out.println("프로그램 종료...");
		 
	}
}
