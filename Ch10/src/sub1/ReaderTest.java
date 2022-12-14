package sub1;

import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022 09 13
 * 이름 : 박진휘
 * 내용 : 문자 스트림 실습
 */
public class ReaderTest {

	public static void main(String[] args) {

		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		
		try {
			FileReader fr = new FileReader(path);
			
			while(true) {
				int value = fr.read();
				if(value == -1) {
					//파일을 모두 읽었으면 탈출
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
			}
			
			//스트림 해제
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
