/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-03-04 15:02:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUpAfter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/view/footer.jsp", Long.valueOf(1519360719206L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"http://netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("td {\n");
      out.write("\tborder: 1px solid gray;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(1) {\n");
      out.write("\tbackground-color: #aaaaaa;\n");
      out.write("\tcolor: white;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#topMemu {\n");
      out.write("\theight: 300px;\n");
      out.write("\twidth: 850px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#topMenu ul {\n");
      out.write("\tlist-style-type: none;\n");
      out.write("\tmargin: 0px;\n");
      out.write("\tpadding: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#topMenu ul li {\n");
      out.write("\tcolor: white;\n");
      out.write("\tbackground-color: #2d2d2d;\n");
      out.write("\tfloat: left;\n");
      out.write("\tline-height: 30px;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tposition: relative;\n");
      out.write("\tleft: 17%\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menuLink, .submenuLink {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 150px;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-family: \"Trebuchet MS\", Dotum;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menuLink {\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topMenuLi:hover .menuLink {\n");
      out.write("\tcolor: red;\n");
      out.write("\tbackground-color: #4d4d4d;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".longLink {\n");
      out.write("\twidth: 190px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submenuLink {\n");
      out.write("\tcolor: #2d2d2d;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: solid 1px black;\n");
      out.write("\tmargin-right: -1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submenu {\n");
      out.write("\tposition: absolute;\n");
      out.write("\theight: 0px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\ttransition: height .2s;\n");
      out.write("\t-webkit-transition: height .2s;\n");
      out.write("\t-moz-transition: height .2s;\n");
      out.write("\t-o-transition: height .2s;\n");
      out.write("\twidth: 574px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submenu li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topMenuLi:hover .submenu {\n");
      out.write("\theight: 32px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".submenuLink:hover {\n");
      out.write("\tcolor: red;\n");
      out.write("\tbackground-color: #dddddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#dvd {\n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-right: 5px;\n");
      out.write("\twidth: 20%;\n");
      out.write("\theight: 100px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tpadding-top: 70px;\n");
      out.write("\tposition: absolute;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#dva {\n");
      out.write("\tmargin-top: 5px;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 30px;\n");
      out.write("\tborder-top: 1px;\n");
      out.write("\tpadding: 5px;\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("#abcd\n");
      out.write("{\n");
      out.write("\ttext-align:center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"abcd\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님환영합니다.\n");
      out.write("\t<input type=\"button\" class=\"btn btn-primary\" value=\"로그아웃\"\n");
      out.write("\tonclick=\"location.href='http://localhost:8080/controller/view/login'\">\n");
      out.write("\t<input type=\"button\" class=\"btn btn-primary\" value=\"수정하기\"\n");
      out.write("\tonclick=\"location.href='http://localhost:8080/controller/view/membershipModification?loginId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\n");
      out.write("\t<input type=\"button\" class=\"btn btn-success\" value=\"승인요청목록\"\n");
      out.write("\t\t\tonclick=\"location.href='http://localhost:8080/controller/view/showStaff'\">\n");
      out.write("\t<input type=\"button\" class=\"btn btn-success\" value=\"승인요청\"\n");
      out.write("\t\t\tonclick=\"location.href='http://localhost:8080/controller/view/approvalEx'\">\n");
      out.write("\t<a href=\"signUpAfter\" class=\"btn\">초기 화면으로 나가기 </a>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("<form method=\"post\">\n");
      out.write("\t<div id=\"dva\">\n");
      out.write("\t\t<nav id=\"topMenu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"topMenuLi\"><a class=\"menuLink\"\n");
      out.write("\t\t\t\t\thref=\"grade?loginId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">내 등급 확인</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>|</li>\n");
      out.write("\t\t\t\t<li class=\"topMenuLi\"><a class=\"menuLink\"\n");
      out.write("\t\t\t\t\thref=\"questionnaireInfo?loginId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">설문지 작성하기</a></li>\n");
      out.write("\t\t\t\t<li>|</li>\n");
      out.write("\t\t\t\t<li class=\"topMenuLi\"><a class=\"menuLink\" \n");
      out.write("\t\t\t\t\thref=\"classroomInfo?loginId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">강의실 대여 하기</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>|</li>\n");
      out.write("\t\t\t\t<li class=\"topMenuLi\"><a class=\"menuLink\"\n");
      out.write("\t\t\t\t\thref=\"\">강의실 교환 해요</a></li>\n");
      out.write("\t\t\t\t<li>|</li>\n");
      out.write("\t\t\t\t<li class=\"topMenuLi\"><a class=\"menuLink\"\n");
      out.write("\t\t\t\t\thref=\"list?loginId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">자유 게시판</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(" #aaa\n");
      out.write(" {\n");
      out.write("position:fixed;\n");
      out.write("left:0px;\n");
      out.write("bottom:0px;\n");
      out.write("width: 100%;\n");
      out.write("text-align: center;\n");
      out.write(" }\n");
      out.write(" .inner\n");
      out.write(" {\n");
      out.write(" color: white;\n");
      out.write("width: 400px;\n");
      out.write("padding: 15px;\n");
      out.write("display: inline-block;\n");
      out.write(" }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- 밑에 이용약관.jsp -->\n");
      out.write("<div id=\"aaa\">\n");
      out.write("\t<div class=\"inner\"\n");
      out.write("\t\tstyle=\"margin-top: 50px; border-top: 1px solid #ddd; padding: 30px; font-size: 10pt; color: #888;\">\n");
      out.write("\t\t<div style=\"float: left; padding-right: 20px;\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>152-716 서울시 구로구 연동로 320 / 지하철 1, 7호선 온수(성공회대입구)역\n");
      out.write("\t\t\tT.02-2610-4114</div>\n");
      out.write("\t\t<div style=\"margin-top: 5px;\">Copyright (c) Sung-Kong-Hoe\n");
      out.write("\t\t\tUnivisity. All rights reserved.</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
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
