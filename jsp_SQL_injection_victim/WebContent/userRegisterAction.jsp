<%@page import="user.UserDTO"%>
<%@page import="user.UserDAO"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%

	request.setCharacterEncoding("UTF-8");

	if( session.getAttribute("userId") != null ){
		PrintWriter p = response.getWriter();
		p.println("<script>");
		p.println("alert('이미 로그인되어 있습니다.');");
		p.println("location.href='./index.jsp';");
		p.println("</script>");
		p.close();
		return;
	}
	
	String userId = null;
	String userPassword = null;
	
	if ( request.getParameter("userId") != null ){
		userId = request.getParameter("userId");
	}

	if ( request.getParameter("userPassword") != null ){
		if(request.getParameter("userPasswordAgain") != null){
			if( ((String)request.getParameter("userPassword")).equals((String)request.getParameter("userPasswordAgain")) )	{
				userPassword = request.getParameter("userPassword");
			} else {
				PrintWriter p = response.getWriter();
				p.println("<script>");
				p.println("alert('비밀번호를 다시 확인해주세요.');");
				p.println("location.href='./userRegister.jsp';");
				p.println("</script>");
				p.close();
				return;
			}
		}
		
	}
	
	if( userId == null || userPassword == null ){
		PrintWriter p = response.getWriter();
		p.println("<script>");
		p.println("alert('입력이 안된 사항이 있습니다.');");
		p.println("location.href='./userRegister.jsp';");
		p.println("</script>");
		p.close();
		return;
	} else {
		
		try{
			
			int result = new UserDAO().join(new UserDTO(userId, userPassword));

			if(result == -1){
				PrintWriter p = response.getWriter();
				p.println("<script>");
				p.println("alert('회원가입에 실패했습니다. 이미 존재하는 ID일수 있습니다.');");
				p.println("location.href='./userRegister.jsp';");
				p.println("</script>");
				p.close();
				return;
			} else {
				session.setAttribute("userId", userId);
				PrintWriter p = response.getWriter();
				p.println("<script>");
				p.println("alert('회원가입이 정상적으로 완료되었습니다..');");
				p.println("location.href='./index.jsp';");
				p.println("</script>");
				p.close();
				return;
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	

%>