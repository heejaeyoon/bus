/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-04 00:15:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<title>강의평가 웹 사이트</title>\r\n");
      out.write("<!--  부트스트랩 css 추가하기 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css?ver1\">\r\n");
      out.write("<!--  커스텀 css 추가하기 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/custom.css?ver1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\">강의평가 웹 사이트</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#navbar\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("			<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("				<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("					href=\"index.jsp\">메인</a></li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" id=\"dropdown\"\r\n");
      out.write("					data-toggle=\"dropdown\"> 회원관리 </a>\r\n");
      out.write("					<div class=\"dropdown-menu\" aria-labelledby=\"dropdown\">\r\n");
      out.write("						<a class=\"dropdown-item\" href=\"#\">로그인</a> <a class=\"dropdown-item\"\r\n");
      out.write("							href=\"#\">회원가입</a> <a class=\"dropdown-item\" href=\"#\">로그아웃</a>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form action=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("				<input class=\"mr-sm-2\" type=\"search\" placeholder=\"내용을 입력하세요.\"\r\n");
      out.write("					aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-outline-success my-2 my-sm-0	\" type=\"submit\">검색</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<section class=\"container\">\r\n");
      out.write("		<form method=\"get\" action=\"./index.jsp\" class=\"form-inline mt-3\">\r\n");
      out.write("			<select name=\"leecturDivide\" class=\"form-control mx-1 mt-2\">\r\n");
      out.write("				<option value=\"전체\">전체</option>\r\n");
      out.write("				<option value=\"전공\">전공</option>\r\n");
      out.write("				<option value=\"교양\">교양</option>\r\n");
      out.write("				<option value=\"기타\">기타</option>\r\n");
      out.write("				\r\n");
      out.write("			</select>\r\n");
      out.write("			<input type=\"text\" name=\"search\" class=\"form-control mx-1 mt-2\" placeholder=\"내용을 입력해주세요.\">\r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-primary mx-1 mt-2\">검색</button>\r\n");
      out.write("			<a class=\"btn btn-primary mx-1 mt-2\" data-toggle=\"modal\" href=\"#registerModal\">등록하기</a>\r\n");
      out.write("			<a class=\"btn btn-danger mx-1 mt-2\" data-toggle=\"modal\" href=\"#reportModal\">신고</a>\r\n");
      out.write("			\r\n");
      out.write("		</form>\r\n");
      out.write("	<div class=\"card bg-light mt-3\">\r\n");
      out.write("		<div class=\"card-header bg-ligth\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-8 text-left\">컴퓨터개론&nbsp;<small>윤희재</small></div>\r\n");
      out.write("				<div class=\"col-4 text-right\">\r\n");
      out.write("					종합<span style=\"color: red;\">A</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">\r\n");
      out.write("				정말 좋은 강의에요.&nbsp;<small>(2017년 가을학기)</small>	\r\n");
      out.write("			</h5>\r\n");
      out.write("			<p class=\"card-text\">강의가 많이 널널해서, 솔직히 많이 배운 건 없는 것 같지만 학점도 잘 나오고 너무 좋은 것 같습니다.</p>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-9 text-left\">\r\n");
      out.write("					성적 <span style=\"color: red;\"> A</span>\r\n");
      out.write("					널널 <span style=\"color: red;\"> A</span>\r\n");
      out.write("					강의 <span style=\"color: red;\"> B</span>\r\n");
      out.write("					<span style=\"color: green;\">(추천: 15)</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-3 text-right\">\r\n");
      out.write("					<a onclick=\"return confirm('추천하시겠습니까?')\" href=\"./likeAction.jsp?evaluationID=\">추천</a>\r\n");
      out.write("					<a onclick=\"return confirm('삭제하시겠습니까?')\" href=\"./deleteAction.jsp?evaluationID=\">삭제</a>\r\n");
      out.write("				</div>					\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"card bg-light mt-3\">\r\n");
      out.write("		<div class=\"card-header bg-ligth\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-8 text-left\">컴퓨터구조&nbsp;<small>서재원</small></div>\r\n");
      out.write("				<div class=\"col-4 text-right\">\r\n");
      out.write("					종합<span style=\"color: red;\">B+</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">\r\n");
      out.write("				흥미로운 강의입니다.&nbsp;<small>(2017년 여름학기)</small>	\r\n");
      out.write("			</h5>\r\n");
      out.write("			<p class=\"card-text\">학점도 잘 나오고 재밌습니다.</p>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-9 text-left\">\r\n");
      out.write("					성적 <span style=\"color: red;\"> A</span>\r\n");
      out.write("					널널 <span style=\"color: red;\"> A</span>\r\n");
      out.write("					강의 <span style=\"color: red;\"> B</span>\r\n");
      out.write("					<span style=\"color: green;\">(추천: 9)</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-3 text-right\">\r\n");
      out.write("					<a onclick=\"return confirm('추천하시겠습니까?')\" href=\"./likeAction.jsp?evaluationID=\">추천</a>\r\n");
      out.write("					<a onclick=\"return confirm('삭제하시겠습니까?')\" href=\"./deleteAction.jsp?evaluationID=\">삭제</a>\r\n");
      out.write("				</div>					\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("	</div><div class=\"card bg-light mt-3\">\r\n");
      out.write("		<div class=\"card-header bg-ligth\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-8 text-left\">컴퓨터그래픽스&nbsp;<small>남호용</small></div>\r\n");
      out.write("				<div class=\"col-4 text-right\">\r\n");
      out.write("					종합<span style=\"color: red;\"> B</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<h5 class=\"card-title\">\r\n");
      out.write("				나쁘지 않았습니다.&nbsp;<small>(2017년 여름학기)</small>	\r\n");
      out.write("			</h5>\r\n");
      out.write("			<p class=\"card-text\">처음 배워봤지만,나름 흥미로웠습니다다.</p>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-9 text-left\">\r\n");
      out.write("					성적 <span style=\"color: red;\"> B</span>\r\n");
      out.write("					널널 <span style=\"color: red;\"> C</span>\r\n");
      out.write("					강의 <span style=\"color: red;\"> B</span>\r\n");
      out.write("					<span style=\"color: green;\">(추천: 2)</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-3 text-right\">\r\n");
      out.write("					<a onclick=\"return confirm('추천하시겠습니까?')\" href=\"./likeAction.jsp?evaluationID=\">추천</a>\r\n");
      out.write("					<a onclick=\"return confirm('삭제하시겠습니까?')\" href=\"./deleteAction.jsp?evaluationID=\">삭제</a>\r\n");
      out.write("				</div>					\r\n");
      out.write("			</div>	\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"modal fade\" id=\"registerModal\" 	tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modal\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"modal\">평가등록</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>	\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<form action=\"./evaluationRegisterAction.jsp\" method=\"post\">\r\n");
      out.write("						<div class=\"form-row\">\r\n");
      out.write("							<div class=\"form-group col-sm-6\">\r\n");
      out.write("								<label>강의명</label>\r\n");
      out.write("								<input type=\"text\" name=\"lectureName\" class=\"form-control\" maxlength=\"20\">							\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group col-sm-6\">\r\n");
      out.write("								<label>교수명</label>\r\n");
      out.write("								<input type=\"text\" name=\"professorName\" class=\"form-control\" maxlength=\"20\">	\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-row\">\r\n");
      out.write("							<div class=\"form-group col-sm-4\">\r\n");
      out.write("								<label>수강연도</label>\r\n");
      out.write("								<select name=\"lectureYear\" class=\"form-control\">\r\n");
      out.write("									<option value=\"2011\">2011</option>\r\n");
      out.write("									<option value=\"2012\">2012</option>\r\n");
      out.write("									<option value=\"2013\">2013</option>\r\n");
      out.write("									<option value=\"2014\">2014</option>\r\n");
      out.write("									<option value=\"2015\">2015</option>\r\n");
      out.write("									<option value=\"2016\">2016</option>\r\n");
      out.write("									<option value=\"2017\">2017</option>\r\n");
      out.write("									<option value=\"2018\">2018</option>\r\n");
      out.write("									<option value=\"2019\">2019</option>\r\n");
      out.write("									<option value=\"2020\">2020</option>\r\n");
      out.write("									<option value=\"2021\">2021</option>\r\n");
      out.write("									<option value=\"2022\" selected>2022</option>\r\n");
      out.write("									<option value=\"2023\">2023</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group col-sm-4\">\r\n");
      out.write("								<label>수강 학기</label>\r\n");
      out.write("								<select name=\"semesterDivide\" class=\"form-control\">\r\n");
      out.write("									<option value=\"1학기\" selected>1학기</option>\r\n");
      out.write("									<option value=\"여름학기\" selected>여름학기</option>\r\n");
      out.write("									<option value=\"2학기\" selected>2학기</option>\r\n");
      out.write("									<option value=\"겨울학기\" selected>겨울학기</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group col-sm-4\">\r\n");
      out.write("								<label>강의 구분</label>\r\n");
      out.write("								<select name=\"lectureDivide\" class=\"form-control\">\r\n");
      out.write("									<option value=\"전공\" selected>전공</option>\r\n");
      out.write("									<option value=\"교양\">교양</option>\r\n");
      out.write("									<option value=\"기타\">기타</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>제목</label>\r\n");
      out.write("								<input type=\"text\" name=\"evaluationTime\" class=\"form-control\" maxlength=\"30\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>내용</label>\r\n");
      out.write("								<textarea name=\"evaluationContent\" class=\"form-control\" maxlength=\"2048\" style=\"height: 180px;\"></textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-row\">\r\n");
      out.write("								<div class=\"form-group col-sm-3\">\r\n");
      out.write("									<label>종합</label>\r\n");
      out.write("									<select name=\"totalScore\" class=\"form-control\">\r\n");
      out.write("										<option value=\"A\" selected>A</option>\r\n");
      out.write("										<option value=\"B\">B</option>\r\n");
      out.write("										<option value=\"C\">C</option>\r\n");
      out.write("										<option value=\"D\">D</option>\r\n");
      out.write("										<option value=\"F\">F</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-group col-sm-3\">\r\n");
      out.write("									<label>성적</label>\r\n");
      out.write("									<select name=\"creditScore\" class=\"form-control\">\r\n");
      out.write("										<option value=\"A\" selected>A</option>\r\n");
      out.write("										<option value=\"B\">B</option>\r\n");
      out.write("										<option value=\"C\">C</option>\r\n");
      out.write("										<option value=\"D\">D</option>\r\n");
      out.write("										<option value=\"F\">F</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("								\r\n");
      out.write("								<div class=\"form-group col-sm-3\">\r\n");
      out.write("									<label>널널</label>\r\n");
      out.write("									<select name=\"comfortableScore\" class=\"form-control\">\r\n");
      out.write("										<option value=\"A\" selected>A</option>\r\n");
      out.write("										<option value=\"B\">B</option>\r\n");
      out.write("										<option value=\"C\">C</option>\r\n");
      out.write("										<option value=\"D\">D</option>\r\n");
      out.write("										<option value=\"F\">F</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("									<div class=\"form-group col-sm-3\">\r\n");
      out.write("									<label>강의</label>\r\n");
      out.write("									<select name=\"lectureScore\" class=\"form-control\">\r\n");
      out.write("										<option value=\"A\" selected>A</option>\r\n");
      out.write("										<option value=\"B\">B</option>\r\n");
      out.write("										<option value=\"C\">C</option>\r\n");
      out.write("										<option value=\"D\">D</option>\r\n");
      out.write("										<option value=\"F\">F</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"modal-footer\">\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">취소</button>\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-primary\">등록하기</button>\r\n");
      out.write("							</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>		\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"modal fade\" id=\"reportModal\" 	tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modal\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"modal\">신고하기</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>	\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<form action=\"./reportAction.jsp\" method=\"post\">\r\n");
      out.write("						\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>신고 제목</label>\r\n");
      out.write("								<input type=\"text\" name=\"reportTitle\" class=\"form-control\" maxlength=\"30\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>신고 내용</label>\r\n");
      out.write("								<textarea name=\"reportContent\" class=\"form-control\" maxlength=\"2048\" style=\"height: 180px;\"></textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"modal-footer\">\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">취소</button>\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-danger\">신고하기</button>\r\n");
      out.write("							</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>		\r\n");
      out.write("	<footer class=\"bg-dark mt-4 p-5 text-center\" style=\"color: #FFFFFF\";>\r\n");
      out.write("		Copyright &copy; 2022 윤희재 All Rights Reserved.\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!-- 제이쿼리 자바스크립트 추가하기 -->\r\n");
      out.write("	<script src=\"./js/jquery.min.js\"></script>\r\n");
      out.write("	<!--파퍼 자바스크립트 추가하기 -->\r\n");
      out.write("	<script src=\"./js/pooper.js\"></script>\r\n");
      out.write("	<!-- 부스트스트랩 자바스크립트 추가하기 -->\r\n");
      out.write("	<script src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
