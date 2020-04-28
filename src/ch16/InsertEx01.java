package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "insert into users(id, name, email, password) values(?,?,?,?)";
			// OJDBC 문서에 해당 드라이버를 로드해라는 매뉴얼이 있음.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 스트림 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// 버퍼 달기 (?를 사용하게 해준다)
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 4);
			pstmt.setString(2, "강동원");
			pstmt.setString(3, "dongwon@nate.com");
			pstmt.setString(4, "1234");
			// 버퍼에 쓰기 (commit)
			int result = pstmt.executeUpdate(); // 리턴 : 몇건이 수행됐는지 int로 리턴
			System.out.println("인서트 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
