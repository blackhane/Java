package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022 09 13
 * 이름 : 박진휘
 * 내용 : 직렬화/역직렬화 실습
 */
public class DeSerializeTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 가져오기
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			a1.show();
			a2.show();
			
			ois.close();
			fis.close();
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("역직렬화 완료");
	}
	
}
