package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 날짜 : 2022 09 14
 * 이름 : 박진휘
 * 내용 : PreparedStatement 실습
 */
public class PreparedTest {

	public static void main(String[] args) {

		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
				
		try {
			//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계
			String sql = "INSERT INTO `User1` VALUES(?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "a201");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-1111");
			psmt.setInt(4, 30);
			
			//4단계
			psmt.executeUpdate();
			
			//5단계
			
			
			//6단계
			psmt.close();
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 완료");
		
	}

}
