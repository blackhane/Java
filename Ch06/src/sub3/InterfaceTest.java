package sub3;
/*
 * 날짜 : 2022 09 01
 * 이름 : 박진휘
 * 내용 : 인터페이스 실습
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		//인터페이스를 활용한 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}
}
