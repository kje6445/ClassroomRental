<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
label {
	margin-top: 20px;
}
</style>

 
   <!-- Meta-tags -->
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   <meta name="keywords" content="Accounts Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
   <script type="application/x-javascript">
      addEventListener("load", function () {
         setTimeout(hideURLbar, 0);
      }, false);

      function hideURLbar() {
         window.scrollTo(0, 1);
      }
   </script>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
   <!-- //Meta-tags -->
   <link href="${pageContext.request.contextPath}/resources/resources2/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" /><!-- //Bootstrap Css -->
   <link href="${pageContext.request.contextPath}/resources/resources2/css/font-awesome.css" rel="stylesheet"><!-- //Font-awesome Css -->
   <link href="${pageContext.request.contextPath}/resources/resources2/css/style.css" rel="stylesheet" type="text/css" media="all" /><!-- //Required Css -->
   <!--fonts-->
   <link href="${pageContext.request.contextPath}/resources/resources2/fonts.googleapis.com/css?family=Raleway:300,400,500,600,800" rel="stylesheet">
   <link href="${pageContext.request.contextPath}/resources/resources2/fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
   <!--//fonts-->

</head>
<body>

 <div class="header">
         <div class="container">
            <div class="w3l_header_left">
               <ul>
                  <li><p>강의실 상호 교환 시스템</p></li>
               </ul>
            </div>
            <div class="w3l_header_right">
               <div class="w3ls-social-icons">
                  <!-- <a class="facebook" href="#"><span class="fa fa-facebook"></span></a>
                  <a class="twitter" href="#"><span class="fa fa-twitter"></span></a>
                  <a class="pinterest" href="#"><span class="fa fa-pinterest-p"></span></a> -->
                  <a class="linkedin" href="http://localhost:8080/controller/view/login"><span class="fa fa-linkedin"></span></a>
               </div>
            </div>
            <div class="clearfix"> </div>
         </div>
      </div>

      <!-- //header -->
      <div class="header-bottom">
         <div class="container">
            <nav class="navbar navbar-default">
               <!-- Brand and toggle get grouped for better mobile display -->
               <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
               <span class="sr-only">Toggle navigation</span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
              </button>
                  <div class="logo">
                     <h1><a class="navbar-brand"  href="http://localhost:8081/controller/view/signUpAfter?loginId=${user.loginId}"><span>${user.loginId}님</span>환영합니다</a></h1>
                  </div>
               </div>
<from method="post">
               <!-- Collect the nav links, forms, and other content for toggling -->
               <div class="collapse navbar-collapse nav-wil" id="bs-example-navbar-collapse-1">
                  <nav class="cl-effect-1" id="cl-effect-1">
                     <ul class="nav navbar-nav">
                        <li class="active"><a href="http://localhost:8081/controller/view/signUpAfter?loginId=${user.loginId}" data-hover="Home">Home</a></li>
                        <li><a href="http://localhost:8081/controller/view/membershipModification?loginId=${user.loginId}" data-hover="정보 수정">정보 수정</a></li>
                        <c:if test="${user.userType != '관리자'}">
                        <li><a href="grade?loginId=${user.loginId}" data-hover="내 등급 확인" >내 등급 확인</a></li>
                        <li><a href="http://localhost:8081/controller/view/approvalPlease?loginId=${user.loginId}&id=${user.id}" data-hover="승인요청">승인요청</a></li>
                        <li><a href="questionnaireInfo1?loginId=${user.loginId}" data-hover="설문지 작성하기">설문지 작성하기</a></li>
                        <li><a href="rent?loginId=${user.loginId}" data-hover="강의실 빌려주기">강의실 빌려주기</a></li>
                        </c:if>
                        <c:if test="${user.userType == '관리자'}">
                        <li><a href="rent?loginId=${user.loginId}" data-hover="설문지 조사확인">설문지 조사확인</a></li>
                        </c:if>
                        <li><a href="list?loginId=${user.loginId}" data-hover="자유게시판">자유 게시판</a></li>
                     </ul>
                  </nav>
               </div>
               <!-- /.navbar-collapse -->
            </nav>
         </div>
      </div>
      
</form>
<!-- ---------------------------------------------------------------- -->
	<div class="container">
		<h1>사용자 정보 수정</h1>
		<hr />
		
		<form method="post" action="membershipModification">
			<div></div><input type="hidden" name="id" value="${user.id}">
			
			<label>로그인ID</label>
			<input type="text" name="loginId" value="${user.loginId}" />
			
			<br/>
			<br/>
			
			<label>이름</label>
			<input type="text" name="name" value="${user.name}" />
			
			<br/>
			<br/>
			
			<label>이메일</label>
			<input type="text" name="email" />
			
			<br/>
			<br/>
			
			<label>사용자 유형</label>
			<select name="userType">
				<option value="관리자" label="관리자" />
				<option value="교수" label="교수" />
				<option value="학생" label="학생"  />
			</select>
			
			<br/>
			<br/>
			
			<label>학과</label>
			<select name="departmentId">
				<option value="0" label="없음" />
				<option value="1" label="소프트웨어공학과" />
				<option value="2" label="컴퓨터공학과" />
				<option value="3" label="경영학과" />
				<option value="4" label="정보통신공학과" />
			</select>
			
			<br/>
			<br/>
			
			<hr />
			<div>
				<input type="submit" class="btn btn-primary" value="저장"/> <a
					href="signUpAfter1?loginId=${user.loginId}" class="btn btn-primary" name="loginId">초기 화면으로 나가기 </a>
			</div>
		</form>
		
		<c:if test="${ not empty error }">
			<div class="alert alert-error">${ error }</div>
		</c:if>
		<c:if test="${ not empty success }">
			<div class="alert alert-success">${ success }</div>
		</c:if>
	</div>
<!-- --------------------------------------------------------------- -->
<div class="agileinfo_copyright">
            <p>
            <div>152-716 서울시 구로구 연동로 320 / 지하철 1, 7호선 온수(성공회대입구)역 T.02-2610-4114</div>
            <div style="margin-top: 5px;">Copyright (c) Sung-Kong-HoeUnivisity. All rights reserved.</div></p>
         </div>
</body>
</html>