<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/view/signUpAfter.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>작성하기</h1>
<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="list" method="post">
			<tr>
				<td > 작성자 </td>
				<td> <input type="text" name="id" size = "50" value="${board.id}"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <input type="text" name="context" size = "150" value="${board.context}" > </td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
		</form>
</table>
<%@ include file="/WEB-INF/views/view/footer.jsp"%>
</body>
</html>