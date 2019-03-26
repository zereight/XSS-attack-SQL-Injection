<%@page import="posts.PostsDTO"%>
<%@page import="posts.PostsDAO"%>
<%@page import="user.UserDAO"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8");

	if( session.getAttribute("userId") == null){
		PrintWriter s = response.getWriter();
		s.println("<script>");
		s.println("alert('로그인 후 등록이 가능합니다.');");
		s.println("location.href='./userLogin.jsp';");
		s.println("</script>");
		s.close();
		return;
	}
	String userId = (String) session.getAttribute("userId");
	String postsTitle = null;
	String postsContent = null;
	
	if(request.getParameter("postsTitle") != null){
		postsTitle = request.getParameter("postsTitle");
	}
	if(request.getParameter("postsContent") != null){
		postsContent = request.getParameter("postsContent");
	}
	
	if( postsTitle==null || postsContent==null ){
		PrintWriter s = response.getWriter();
		s.println("<script>");
		s.println("alert('입력되지 않은 항목이 있습니다.');");
		s.println("location.href='./index.jsp';");
		s.println("</script>");
		s.close();
		return;
	} else{
		
		try{
			int result = new PostsDAO().registPosts(new PostsDTO(0, postsTitle, postsContent, userId));
			if( result== -1 ){
				PrintWriter s = response.getWriter();
				s.println("<script>");
				s.println("alert('등록에 실패했습니다.');");
				s.println("location.href='./index.jsp';");
				s.println("</script>");
				s.close();
				return;
			}else {
				PrintWriter s = response.getWriter();
				s.println("<script>");
				s.println("alert('등록이 완료되었습니다.');");
				s.println("location.href='./index.jsp';");
				s.println("</script>");
				s.close();
				return;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

%>