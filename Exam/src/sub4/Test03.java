package sub4;
/*
 * 날짜 : 2022 09 16
 * 이름 : 박진휘
 * 내용 : 문자열 처리 연습문제
 */
public class Test03 {

	public static void main(String[] args) {

		String fileName = "자바 프로그래밍.pdf";
		
		int idx = fileName.indexOf(".");
		//int idx = fileName.lastindexOf(".");
				
		String title = fileName.substring(0,idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : " +title);
		System.out.println("확장자 : " +ext);
	}

}