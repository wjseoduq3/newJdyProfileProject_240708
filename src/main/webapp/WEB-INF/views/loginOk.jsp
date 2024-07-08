<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/title.css">
<link rel="stylesheet" href="/resources/css/content.css">
<title>JDY Profile</title>
</head>
<body>
	<c:if test="${loginFail == 1}">
		<script type="text/javascript">
			alert("아이디 또는 비밀번호가 잘못되었습니다. 다시 확인해 주세요.");
			history.go(-1);
		</script>
	</c:if>
		
	<%@ include file="include/header.jsp" %>

	<center>
	<table border="0" cellpadding="20" cellspacing="0">
		<tr>
			<td align="center">
				<span class="title_text01">JDY's PROFILE</span>
			</td>
		</tr>
		<tr>
			<td align="center">
				<span class="title_text02">I'm JDY, a developer who wants a development job. Please call me back.</span>
			</td>
		</tr>
		<tr>
			<td class="content_box" align="center">						
				<table border="0" cellpadding="10" cellspacing="0">
					<tr>
						<td align="center">
							<span class="content_text">
							${mname}님 로그인을 축하드립니다.<br>
							${mname}님의가입일은 ${mdate}입니다.<br>
							게시판에 글을 쓰실 수 있습니다.<br><br>							
							<input class="btn01" type="button" value="글쓰기" onclick="javascript:window.location.href='write'">
							</span>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</center>
	<%@ include file="include/footer.jsp" %>
</body>
</html>