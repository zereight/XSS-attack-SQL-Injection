package user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.DatabaseUtil;

public class UserDAO {

	public int join(UserDTO dto) {
		//DB에 회원을 추가하는 함수
		
		Connection conn = null;
		//SQL injection을 위해 PreparedStatement 사용안하고 할것임.
		Statement stmt = null;
		
		try {
			
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate("INSERT INTO USER VALUES(" +
			"'"+dto.getUserId()+"'" + ","+ "'"+dto.getUserPassword()+"'"+ ")");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if( conn != null ) {conn.close();}	} catch (Exception e2) {e2.printStackTrace();}
			try {if( stmt != null ) {stmt.close();}	} catch (Exception e2) {e2.printStackTrace();}
		
		}
		
		return -1;
		
	}
	
	public int login (UserDTO dto) {
		//DB에서 회원을 불러와서 로그인상태로 만드는 함수
		
		Connection conn = null;
		//SQL injection을 위해 PreparedStatement 사용안하고 할것임.
		Statement stmt = null;
		ResultSet res = null;
		
		try {
			
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();
			
			res=  stmt.executeQuery("SELECT userPassword FROM USER WHERE userId= " + "'"+dto.getUserId()+"'"
			+ "and '" + dto.getUserPassword() + "'");
			
			if(res.next()) {
				return 1;
			}else {
				return 0;
			}
			
			/*if(res.next()) {
				if( res.getString(1).equals(dto.getUserPassword()) ) { //userPassword 1개 반환하니까 res에서 1번째 값
					return 1; //로그인 성공
				} else {
					return 0; //userId가 DB에 있으나 비밀번호가 일치하지 않음.
				}
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if( conn != null ) {conn.close();}	} catch (Exception e2) {e2.printStackTrace();}
			try {if( stmt != null ) {stmt.close();}	} catch (Exception e2) {e2.printStackTrace();}
			try {if( res != null ) {res.close();}	} catch (Exception e2) {e2.printStackTrace();}
		
		}
		
		return -1;
	}
	
}
