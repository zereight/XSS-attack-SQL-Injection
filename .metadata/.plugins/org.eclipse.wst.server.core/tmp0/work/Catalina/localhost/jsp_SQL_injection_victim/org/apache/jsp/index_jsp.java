/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.38
 * Generated at: 2019-03-26 15:40:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import posts.PostsDAO;
import posts.PostsDTO;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("posts.PostsDTO");
    _jspx_imports_classes.add("posts.PostsDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <title>XSS와 SQL injection Test</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");
	if( session.getAttribute("userId") != null ){
		
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"./index.jsp\">21511816 김대현</a>\r\n");
      out.write("        <button class=\"navbar-toggler hidden-lg-up\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavId\" aria-controls=\"collapsibleNavId\"\r\n");
      out.write("            aria-expanded=\"false\" aria-label=\"Toggle navigation\"></button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavId\">\r\n");
      out.write("          <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdownId\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">회원관리</a>\r\n");
      out.write("              <div class=\"dropdown-menu\" aria-labelledby=\"dropdownId\">\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"./userLogin.jsp\">Login</a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"./userRegister.jsp\">Register</a>\r\n");
      out.write("                <a class=\"dropdown-item\" href=\"./logout.jsp\">Logout</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Button trigger modal -->\r\n");
      out.write("\t <div class=\"row mt-4\">\r\n");
      out.write("\t\t<div class=\"col-12 text-center\">\r\n");
      out.write("\t\t      <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#registerPosts\">\r\n");
      out.write("\t\t        \t글올리기\r\n");
      out.write("\t\t      </button>\t\r\n");
      out.write("\t      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Modal -->\r\n");
      out.write("      <div class=\"modal fade\" id=\"registerPosts\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modelTitleId\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("          <div class=\"modal-content\">\r\n");
      out.write("              <div class=\"modal-header\">\r\n");
      out.write("                  <h5 class=\"modal-title\">글올리기</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                      <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("\t                <form method=\"post\" action=\"./registerPostsAction.jsp\">\r\n");
      out.write("\t                  <div class=\"modal-body\">\r\n");
      out.write("\t                    <div class=\"form-group\">\r\n");
      out.write("\t                      <label>제목</label>\r\n");
      out.write("\t                      <input type=\"text\" class=\"form-control\" name=\"postsTitle\" id=\"\" aria-describedby=\"helpId\" placeholder=\"제목을 입력하세요.\">\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <div class=\"form-group\">\r\n");
      out.write("\t                      <label>내용</label>\r\n");
      out.write("\t                      <textarea class=\"form-control\" name=\"postsContent\" id=\"\" aria-describedby=\"helpId\" placeholder=\"내용을 입력하세요.\" style=\"height: 200px;\"></textarea>\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t                  <div class=\"modal-footer\">\r\n");
      out.write("\t                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t                    <button type=\"submit\" class=\"btn btn-primary\">Save</button>\r\n");
      out.write("\t                  </div>\r\n");
      out.write("\t            \t </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"container my-3\" style=\"height:100%;\">\r\n");
      out.write("        <h1 class=\"text-center\">XSS와 SQL injection Test 페이지 입니다.</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	ArrayList<PostsDTO> postsList = new PostsDAO().getList();
	if(postsList != null){
		for(int i=0; i< postsList.size(); i++){
			
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"card my-3\" >\r\n");
      out.write("            <div class=\"card-header\">\r\n");
      out.write("                <small>postNumber: </small>");
      out.print( postsList.get(i).getPostsId() );
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("            \t\r\n");
      out.write("                <h5 class=\"card-title\">");
      out.print( postsList.get(i).getPostsTitle() );
      out.write("</h5>\r\n");
      out.write("                <p class=\"card-text\">");
      out.print( postsList.get(i).getPostsContent() );
      out.write("</p>\r\n");
      out.write("             \t<button class=\"btn btn-info\" onclick=\"return confirm( ");
      out.print( postsList.get(i).getPostsContent() );
      out.write(" )\">자세히 보기</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("                <small>Author: </small>");
      out.print( postsList.get(i).getUserId() );
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
		
		}
	}

      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"bg-dark mt-4 p-5 text-center\" style=\"color: white; width:100%;\">\r\n");
      out.write("\r\n");
      out.write("            Copyright ⓒ 2018 김대현 All Rights Reserved.\r\n");
      out.write("      \r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
