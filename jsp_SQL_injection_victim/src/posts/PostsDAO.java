package posts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.DatabaseUtil;


public class PostsDAO {
	
	public int registPosts(PostsDTO dto) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();
			//return stmt.executeUpdate("INSERT INTO POSTS VALUES (0" +"'"+dto.getPostsTitle()+"'"+
			//		"'"+dto.getPostsContent()+"',"+"'"+dto.getUserId()+"')" );
			return stmt.executeUpdate("INSERT INTO POSTS VALUES(" +dto.getPostsId()+
					",'"+dto.getPostsTitle()+"'" + ","+ "'"+dto.getPostsContent()+"'"+ 
					","+ "'"+dto.getUserId()+"'"+")");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {if( conn != null ) {conn.close();}	} catch (Exception e2) {e2.printStackTrace();}
			try {if( stmt != null ) {stmt.close();}	} catch (Exception e2) {e2.printStackTrace();}
		
		}
		
		return -1;
	}
	
	public ArrayList<PostsDTO> getList(){
		
		ArrayList<PostsDTO> postsList = null;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		
		try {
			postsList = new ArrayList<PostsDTO>();
			conn = DatabaseUtil.getConnection();
			stmt = conn.createStatement();

			res= stmt.executeQuery(
					"SELECT * FROM POSTS ORDER BY postsId DESC"
					);
			while(res.next()) {
				PostsDTO dto = new PostsDTO(res.getInt(1), res.getString(2),
						res.getString(3), res.getString(4));
				postsList.add(dto);
			}
			
			return postsList;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {if( conn != null ) {conn.close();}	} catch (Exception e2) {e2.printStackTrace();}
			try {if( stmt != null ) {stmt.close();}	} catch (Exception e2) {e2.printStackTrace();}
			try {if( res != null ) {res.close();}	} catch (Exception e2) {e2.printStackTrace();}
		
		}
		
		return null;
	}
	
}