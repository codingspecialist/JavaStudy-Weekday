package ch16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx01 {

	public static void main(String[] args) {
		try {
			final String SQL = "update users set password = ? where id = ?";
			// OJDBC 문서에 해당 드라이버를 로드해라는 매뉴얼이 있음.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 스트림 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssar", "bitc5600");
			// 버퍼 달기 (?를 사용하게 해준다)
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "5678");
			pstmt.setInt(2, 2);
			// 버퍼에 쓰기 (commit)
			pstmt.executeUpdate();
			System.out.println("업데이트 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
