package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2022 09 07
 * 이름 : 박진휘
 * 내용 : Date 클래스 실습
 */
public class DateTest {

	public static void main(String[] args) {
		
		//Date 클래스
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String result = sdf.format(date);
		System.out.println(result);
		
		//Calender 클래스
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",y,m,d,h,mi,s);
		
	}
}
