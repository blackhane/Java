package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2022 09 15
 * 이름 : 박진휘
 * 내용 : 트랜젝션 실습
 * 
 * 트랜잭션(Transaction)
 * 트랙잭션은 DB처리의 최소 작업단위로 하나의 작업은 소작업들로 구성
 * 트랜잭션 작업은 모두 성공하거나 모두 실패해야만 하는 특성을 가짐
 * Commit은 모든 작업 확정처리를 Rollback은 작업전으로 돌아가기 위해 실패처리
 */
public class TransactionTest {

	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1_bank";
		String user = "root";
		String pass = "1234";
				
		String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - 10000 WHERE `a_no`=?";
		String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + 10000 WHERE `a_no`=?";
		
		try {
			//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계
			Connection conn = DriverManager.getConnection(host,user,pass);
			conn.setAutoCommit(false);
			
			//3단계
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1006");
			
			//4단계
			psmt1.executeUpdate();
			psmt2.executeUpdate();
			conn.commit();
			
			//5단계
			
			//6단계
			psmt1.close();
			psmt2.close();
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
