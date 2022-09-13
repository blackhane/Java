package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			 fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally{
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("수행완료");
		}
		
		System.out.println("수행완료");
	}
}
