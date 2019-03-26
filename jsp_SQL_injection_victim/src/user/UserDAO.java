package user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.DatabaseUtil;

public class UserDAO {

	public int join(UserDTO dto) {
		//DB�� ȸ���� �߰��ϴ� �Լ�
		
		Connection conn = null;
		//SQL injection�� ���� PreparedStatement �����ϰ� �Ұ���.
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
		//DB���� ȸ���� �ҷ��ͼ� �α��λ��·� ����� �Լ�
		
		Connection conn = null;
		//SQL injection�� ���� PreparedStatement �����ϰ� �Ұ���.
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
				if( res.getString(1).equals(dto.getUserPassword()) ) { //userPassword 1�� ��ȯ�ϴϱ� res���� 1��° ��
					return 1; //�α��� ����
				} else {
					return 0; //userId�� DB�� ������ ��й�ȣ�� ��ġ���� ����.
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