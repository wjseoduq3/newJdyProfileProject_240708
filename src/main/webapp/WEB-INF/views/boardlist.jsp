<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/title.css">
<link rel="stylesheet" href="/resources/css/content.css">
<link rel="stylesheet" href="/resources/css/board.css">
<title>JDY Profile</title>
</head>
<body>
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
				<table border="0" cellpadding="10" cellspacing="0" width="90%">
					<tr>
						<th class="board_title" width="6%">번호</th>
						<th class="board_title" width="10%">아이디</th>
						<th class="board_title" width="10%">이름</th>
						<th class="board_title" width="60%">제목</th>
						<th class="board_title" width="14%">등록일</th>					
					</tr>
					<tr>
						<td class="board_content" align="center">1</td>
						<td class="board_content" align="center">gary</td>
						<td class="board_content" align="center">홍길동</td>
						<td class="board_content" align="left">가입인사</td>
						<td class="board_content" align="center">2024-07-08</td>
					</tr>
					<tr>
						<td class="board_content">2</td>
						<td class="board_content">gary</td>
						<td class="board_content">홍길동</td>
						<td class="board_content">가입인사</td>
						<td class="board_content">2024-07-08</td>
					</tr>
					<tr>
						<td class="board_content">3</td>
						<td class="board_content">gary</td>
						<td class="board_content">홍길동</td>
						<td class="board_content">가입인사</td>
						<td class="board_content">2024-07-08</td>
					</tr>
					<tr>
						<td colspan="5" align="right">
							<input class="btn01" type="button" value="글쓰기" onclick="javascript:window.location.href='write'">
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