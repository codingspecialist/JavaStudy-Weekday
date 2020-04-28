package projectex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 회원삭제(D), 회원가입(I), 로그인(S), 회원조회(S), 회원전체조회(S), 회원수정(U)
public class UsersDAO {
	
	private UsersDAO() {}
	private static UsersDAO instance = new UsersDAO();
	
	public static UsersDAO getInstance() {
		return instance;
	}
	
	public int 회원가입(String name, String email, String password) {
		final String SQL = "INSERT INTO users(id, name, email, password) VALUES(?,?,?,?)";
		Connection conn = DBConnection.getConnection();
		
		return -1;
	}
	
	public int 회원삭제(int id) {
		
		final String SQL = "DELETE FROM users WHERE id = ?";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, id);
			int result =  pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return -1;
	}
}




