/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-03-04 15:10:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/view/footer.jsp", Long.valueOf(1519360719206L));
    _jspx_dependants.put("jar:file:/C:/Users/JiEun/Desktop/Doit/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/classroomRental/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1517165919348L));
    _jspx_dependants.put("/WEB-INF/views/view/signUpAfter.jsp", Long.valueOf(1520175668034L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link\n");
      out.write("\thref=\"http://netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$(function() {\n");
      out.write("\t\t$(\"div.pagination a\").click(function() {\n");
      out.write("\t\t\t$(\"input[name=pg]\").val($(this).attr(\"data-page\"));\n");
      out.write("\t\t\t$(\"form\").submit();\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("#color1 {\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<h1>목록 보기</h1>\n");
      out.write("\t<form method=\"get\"> <input type=\"hidden\" name=\"pg\" value=\"1\" />\n");
      out.write("\t<table class=\"table table-striped\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td id=\"color1\">번호</td>\n");
      out.write("\t\t\t<td id=\"color1\">작성자</td>\n");
      out.write("\t\t\t<td id=\"color1\">내용</td>\n");
      out.write("\t\t\t<td id=\"color1\">삭제</td>\n");
      out.write("\t\t\t<td id=\"color1\">수정</td>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\t<div class=\"pagination pagination-small pagination-centered\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\t\t<a href=\"writeForm\">글작성</a>\n");
      out.write("\t</p>\n");
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
      out.write("\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/view/list.jsp(38,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/view/list.jsp(38,3) '${board}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${board}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/view/list.jsp(38,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("dto");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.number}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.context}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t<td><a href=\"delete?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">X</a></td>\n");
          out.write("\t\t\t\t\t<td><a href=\"update?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">누르기</a></td>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/view/list.jsp(51,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("page");
    // /WEB-INF/views/view/list.jsp(51,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/view/list.jsp(51,3) '${ pagination.pageList }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ pagination.pageList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<li class='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ page.cssClass }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("'><a data-page=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ page.number }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ page.label }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
