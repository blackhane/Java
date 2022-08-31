package sub2;
/*
 * 날짜 : 2022 08 24
 * 이름 : 박진휘
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화
 * 캡슐화는 객체의 속성을 외부에서 참조하지 못하도록 객체의 정보를 은닉하는 특성
 * 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 * 은닉한 정보를 참조하기 위해 Getter, Setter를 정의
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		//객체 생성 + 초기화
		Car sonata = new Car("소나타","흰색",0);
		sonata.setColor("은색");
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Account wb = new Account("국민은행", "101-1234", "김유신", 0);
		wb.deposit(100000);
		wb.withdraw(30000);
		wb.show();
	}
}
