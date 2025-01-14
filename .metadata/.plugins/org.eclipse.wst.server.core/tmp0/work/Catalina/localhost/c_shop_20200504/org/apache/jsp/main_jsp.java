/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-05-12 03:53:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<title>koitt 세미 프로젝트 메인</title>\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/myg/style_main.css\">\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/myg/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/myg/prefixfree.dynamic-dom.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/myg/custom_main.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/myg/jquery-ui.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t \t<header>\r\n");
      out.write("\t \t\t<div id=\"nav_up\">\r\n");
      out.write("\t \t\t\t<ul>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"join.doj\">회원가입</a></li>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"#\">로그인</a></li>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"#\">고객행복센터</a></li>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"#\">배송정보검색</a></li>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"admin_login.html\">관리자메뉴</a></li>\r\n");
      out.write("\t \t\t\t</ul>\r\n");
      out.write("\t \t\t</div>\r\n");
      out.write("\t \t\t<nav>\r\n");
      out.write("\t \t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t<ul>\r\n");
      out.write("\t \t\t\t\t<li class=\"menu_list\"><a href=\"#\">COOKIT소개</a></li>\r\n");
      out.write("\t \t\t\t\t<li class=\"menu_list\"><a href=\"#\">COOKIT메뉴</a></li>\r\n");
      out.write("\t \t\t\t\t<li class=\"menu_list\"><a href=\"#\">리뷰</a></li>\r\n");
      out.write("\t \t\t\t\t<li class=\"menu_list\"><a href=\"event_list.doe\">이벤트</a></li>\r\n");
      out.write("\t \t\t\t\t<li class=\"menu_list\"><a href=\"notice_list.do\">공지사항</a></li>\r\n");
      out.write("\t \t\t\t</ul>\r\n");
      out.write("\t \t\t\t<ul>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"#\"><span>장바구니</span></a></li>\r\n");
      out.write("\t \t\t\t\t<li><a href=\"#\"><span>메뉴찾기</span></a></li>\r\n");
      out.write("\t \t\t\t</ul>\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t</nav>\r\n");
      out.write("\t \t</header>\r\n");
      out.write("\t \t<section>\r\n");
      out.write("\t \t\t<div id=\"top_img\">\r\n");
      out.write("\t \t\t\t<div>\r\n");
      out.write("\t \t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t<span>NEW</span>\r\n");
      out.write("\t\t \t\t\t\t<span>3/16 신메뉴 출시</span>\r\n");
      out.write("\t\t \t\t\t\t<span>따끈한 소울푸드<br>황태콩나물 해장국</span>\r\n");
      out.write("\t\t\t \t\t\t<span><span></span>3인분</span>\r\n");
      out.write("\t\t\t \t\t\t<span><span></span>조리 15분</span>\r\n");
      out.write("\t \t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t<span>16,800원 <a href=\"#\"></a></span>\r\n");
      out.write("\t \t\t\t\t<div>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t \t\t\t<span>1/5</span>\r\n");
      out.write("\t\t\t \t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</div>\r\n");
      out.write("\t \t\t\t</div>\r\n");
      out.write("\t \t\t</div>\r\n");
      out.write("\t \t\t<div id=\"recomend\">\r\n");
      out.write("\t \t\t\t<div>\r\n");
      out.write("\t \t\t\t\t<div>\r\n");
      out.write("\t\t \t\t\t\t<span>얼큰한맛 <a href=\"#\">▼</a></span>\r\n");
      out.write("\t\t \t\t\t\t<span>메뉴<br>추천드려요</span>\r\n");
      out.write("\t\t \t\t\t\t<span><a href=\"#\">로그인</a>하시면 고객님의 구매내역과<br> 맛취향에 따라 딱맞는 맛있는 메뉴를 추천드려요</span>\r\n");
      out.write("\t\t \t\t\t</div>\r\n");
      out.write("\t\t \t\t\t<div></div>\r\n");
      out.write("\t\t \t\t\t<a href=\"#\"><img alt=\"우거지탕\" src=\"img/myg/recomand_tang.png\"></a>\r\n");
      out.write("\t\t \t\t\t<div>\r\n");
      out.write("\t\t \t\t\t\t<a href=\"#\">얼큰소고기우거지탕</a>\r\n");
      out.write("\t\t \t\t\t\t<div>\r\n");
      out.write("\t\t\t \t\t\t\t<span>18,800원</span>\r\n");
      out.write("\t\t\t \t\t\t\t<span>/3인분<a href=\"#\"></a></span>\r\n");
      out.write("\t\t \t\t\t\t</div>\r\n");
      out.write("\t \t\t\t\t</div>\r\n");
      out.write("\t \t\t\t</div>\r\n");
      out.write("\t \t\t</div>\r\n");
      out.write("\t \t\t<a href=\"#\" id=\"event_banner\"></a>\r\n");
      out.write("\t \t\t<div id=\"best\">\r\n");
      out.write("\t \t\t\t<h2>실시간 베스트</h2>\r\n");
      out.write("\t \t\t\t<ul>\r\n");
      out.write("\t \t\t\t\t<li>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<img alt=\"참스테이크\" src=\"img/myg/best01.jpg\">\r\n");
      out.write("\t\t \t\t\t\t\t<span id=\"best_top\">BEST<br>01</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>부채살 찹스테이크</span>\r\n");
      out.write("\t\t \t\t\t\t\t<span>\r\n");
      out.write("\t\t \t\t\t\t\t\t20,800원\r\n");
      out.write("\t\t \t\t\t\t\t\t<span>/2인분</span>\r\n");
      out.write("\t\t \t\t\t\t\t</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t  </li>\r\n");
      out.write("\t \t\t\t\t<li>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<img alt=\"감바스 알아히오\" src=\"img/myg/best02.jpg\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>02</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>감바스 알아히오</span>\r\n");
      out.write("\t\t \t\t\t\t\t<span>\r\n");
      out.write("\t\t \t\t\t\t\t\t20,800원\r\n");
      out.write("\t\t \t\t\t\t\t\t<span>/3인분</span>\r\n");
      out.write("\t\t \t\t\t\t\t</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</li>\r\n");
      out.write("\t \t\t\t\t<li>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<img alt=\"소고기 두부전골\" src=\"img/myg/best03.jpg\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>03</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>소고기 두부전골</span>\r\n");
      out.write("\t\t \t\t\t\t\t<span>\r\n");
      out.write("\t\t \t\t\t\t\t\t24,800원\r\n");
      out.write("\t\t \t\t\t\t\t\t<span>/3인분</span>\r\n");
      out.write("\t\t \t\t\t\t\t</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</li>\r\n");
      out.write("\t \t\t\t\t<li>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<img alt=\"스키야키\" src=\"img/myg/best04.jpg\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>04</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>스키야키</span>\r\n");
      out.write("\t\t \t\t\t\t\t<span>\r\n");
      out.write("\t\t \t\t\t\t\t\t24,800원\r\n");
      out.write("\t\t \t\t\t\t\t\t<span>/3인분</span>\r\n");
      out.write("\t\t \t\t\t\t\t</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</li>\r\n");
      out.write("\t \t\t\t\t<li>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<img alt=\"빠네크림 파스타\" src=\"img/myg/best05.jpg\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>05</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>빠네크림 파스타</span>\r\n");
      out.write("\t\t \t\t\t\t\t<span>\r\n");
      out.write("\t\t \t\t\t\t\t\t20,800원\r\n");
      out.write("\t\t \t\t\t\t\t\t<span>/2인분</span>\r\n");
      out.write("\t\t \t\t\t\t\t</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</li>\r\n");
      out.write("\t \t\t\t\t<li>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<img alt=\"부추가득 오리불고기\" src=\"img/myg/best06.jpg\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>06</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t \t\t\t\t\t<span>부추가득 오리불고기</span>\r\n");
      out.write("\t\t \t\t\t\t\t<span>\r\n");
      out.write("\t\t \t\t\t\t\t\t24,800원\r\n");
      out.write("\t\t \t\t\t\t\t\t<span>/3인분</span>\r\n");
      out.write("\t\t \t\t\t\t\t</span>\r\n");
      out.write("\t \t\t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</li>\r\n");
      out.write("\t \t\t\t</ul>\r\n");
      out.write("\t \t\t</div>\r\n");
      out.write("\t \t\t<div id=\"review\">\r\n");
      out.write("\t \t\t\t<h2>생생한 리뷰</h2>\r\n");
      out.write("\t \t\t\t<div>\r\n");
      out.write("\t \t\t\t\t<a href=\"#\">\r\n");
      out.write("\t \t\t\t\t<span></span>\r\n");
      out.write("\t \t\t\t\t<span>속초식 코다리찜</span>\r\n");
      out.write("\t \t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t재료가 워낙 좋으니 생선이라도 비린내 걱정\r\n");
      out.write("\t\t\t\t\t\t<br>없이 맛있었어요.나가서 사먹는것보다\r\n");
      out.write("\t\t\t\t\t\t<br>내 집에서 믿고먹는 맛집, 쿡킷입니다!\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<span></span>\r\n");
      out.write("\t \t\t\t\t<span>by.for********</span>\r\n");
      out.write("\t \t\t\t\t</a>\r\n");
      out.write("\t \t\t\t\t<div>\r\n");
      out.write("\t \t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t \t\t\t<span>1/5</span>\r\n");
      out.write("\t\t\t \t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t \t\t\t\t</div>\r\n");
      out.write("\t \t\t\t</div>\r\n");
      out.write("\t \t\t\t<img alt=\"코다리찜1\" src=\"img/myg/review01.jpg\">\r\n");
      out.write("\t \t\t\t<img alt=\"코다리찜2\" src=\"img/myg/review02.png\">\r\n");
      out.write("\t \t\t\t<span></span>\r\n");
      out.write("\t \t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<img alt=\"메뉴상단01\" src=\"img/myg/menu_top01.jpg\">\r\n");
      out.write("\t\t\t\t\t<h2>쿡킷 메뉴보기<br>\r\n");
      out.write("\t\t\t\t\tPremium Mealkit</h2>\r\n");
      out.write("\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t장보기, 재료손질, 레시피검색 <strong>번거로움 OUT!</strong><br>\r\n");
      out.write("\t\t\t\t\t초간편함은 물론, 완벽한 맛 쿡킷이 다~ 했네\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"황태콩나물해장국\" src=\"img/myg/menu01.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>황태콩나물해장국</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>16,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"new_menu\">NEW</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"군산식 아귀찜\" src=\"img/myg/menu02.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>군산식 아귀찜</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>29,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"해물짬뽕전골\" src=\"img/myg/menu03.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>해물짬뽕전골</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>22,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"스키야키\" src=\"img/myg/menu04.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>스키야키</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>24,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"우삼겹쌀국수\" src=\"img/myg/menu05.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>우삼겹쌀국수</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>24,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"빠네크림파스타\" src=\"img/myg/menu06.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>빠네크림파스타</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>20,800원<span>/2인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"감바스알아히요\" src=\"img/myg/menu07.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>감바스알아히요</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>20,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"대만식 우육탕면\" src=\"img/myg/menu08.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>대만식 우육탕면</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>23,800원<span>/2인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"얼큰소고기우거지탕\" src=\"img/myg/menu09.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>얼큰소고기우거지탕</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>18,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"두툼 갈치조림\" src=\"img/myg/menu10.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>두툼 갈치조림</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>17,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"부추가득 오리불고기\" src=\"img/myg/menu11.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>부추가득 오리불고기</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>24,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"버섯소불고기\" src=\"img/myg/menu12.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>버섯소불고기</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>23,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"속초식 코다리찜\" src=\"img/myg/menu13.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>속초식 코다리찜</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>24,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"사천식 깐풍새우\" src=\"img/myg/menu14.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>사천식 깐풍새우</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>25,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"애호박돼지고기짜글이\" src=\"img/myg/menu15.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>애호박돼지고기짜글이</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>22,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"칠리&크림 반반새우\" src=\"img/myg/menu16.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>칠리&크림 반반새우</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>26,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"쿵팟퐁커리\" src=\"img/myg/menu17.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>쿵팟퐁커리</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>20,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"소고기두부전골\" src=\"img/myg/menu18.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>소고기두부전골</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>24,800원<span>/3인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img alt=\"부채살 찹스테이크\" src=\"img/myg/menu19.png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>부채살 찹스테이크</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>20,800원<span>/2인분</span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<img alt=\"핫딜\" src=\"img/myg/menu_hotdeal.jpg\">\r\n");
      out.write("\t\t\t\t\t<h2>놓칠 수 없는 기회 <br>\r\n");
      out.write("\t\t\t\t\t오픈 한정 핫딜</h2>\r\n");
      out.write("\t\t\t\t\t<span>파격적인 가격으로<br>\r\n");
      out.write("\t\t\t\t\t쿡킷을 경험할 수 있는 기회를 잡으세요.</span>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"쿡킷소개\" src=\"img/myg/menu_cj_intro.jpg\">\r\n");
      out.write("\t\t\t\t\t\t<h2>프리미엄 밀키트<br>\r\n");
      out.write("\t\t\t\t\t\tCOOKIT을 소개합니다.</h2>\r\n");
      out.write("\t\t\t\t\t\t<span>COOKIT은 장보기, 재료손질, 계량 등 복잡한 과정 없이도<br>\r\n");
      out.write("\t\t\t\t\t\t누구나 간편하게 특별한 집밥을 만들 수 있도록 도와드립니다.</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"main_notice\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t\t<dt>공지사항</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>미리보는 쿡킷 전체 메뉴 (3月)</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\t \t\t\r\n");
      out.write("\t \t</section>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t \t<div>\r\n");
      out.write("\t\t\t \t\t<div>\r\n");
      out.write("\t\t\t\t \t\t<a href=\"#\"></a>\r\n");
      out.write("\t\t\t\t \t\t<span>© COOKIT ALL RIGHTS RESERVED</span>\r\n");
      out.write("\t\t\t \t\t</div>\r\n");
      out.write("\t\t\t \t\t<div>\r\n");
      out.write("\t\t\t \t\t\t<ul>\r\n");
      out.write("\t\t\t\t \t\t\t<li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li class=\"foot_li\"><a href=\"#\">개인정보처리 방침</a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li><a href=\"#\">법적고지</a></li>\r\n");
      out.write("\t\t\t\t \t\t\t<li class=\"foot_end\"><a href=\"#\">사업자정보 확인</a></li>\r\n");
      out.write("\t\t\t \t\t\t</ul>\r\n");
      out.write("\t\t\t \t\t\t<div>\r\n");
      out.write("\t\t\t\t \t\t\t<p>씨제이제일제당(주)대표이사 : 손경식,강신호,신현재 ㅣ 사업자등록번호 : 104-86-09535</p> \r\n");
      out.write("\t\t\t\t \t\t\t<p>주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560 ㅣ 통신판매업신고 중구 제 07767호 ㅣ 개인정보보호책임자 : 조영민</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>이메일 : cjon@cj.net ㅣ 호스팅제공자 : CJ올리브네트웍스㈜</p> \r\n");
      out.write("\t\t\t\t\t\t\t<p>고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <a href=\"#\">가입 사실 확인</a></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t \t\t</div>\r\n");
      out.write("\t\t\t \t\t<div>\r\n");
      out.write("\t\t\t \t\t<span><a href=\"#\">CJ그룹계열사 바로가기 ▽</a></span>\r\n");
      out.write("\t\t\t \t\t<span>고객행복센터 1668-1920</span>\r\n");
      out.write("\t\t\t \t\t<a href=\"#\" id=\"qna\">1:1 문의</a>\r\n");
      out.write("\t\t\t \t\t</div>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</body>\r\n");
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
