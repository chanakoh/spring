<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="com.kh.model.vo.DTO" %>
    <%@ page impoty = "java.util.List" %>
    <%
    	List<DTO> userList = (List<DTO>) request.getAttribute("user");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>검색결과</title>
</head>
<body>
	<h1>조회 결과</h1>
	<table border="1">
		<tbody>
		<thead>
		<tr>
			<th>사용자 번호</th>
			<th>사용자 번호</th>
			<th>사용자 이름</th>
			<th>사용자 나이</th>
		</tr>
		</thead>
		
		<%
			//조회된 사용자 정보를 전체 출력
			for(DTO user : userList){
		
		%>
		<tr>
			<td><%=user.getUserNo() %></td>
			<td><%=user.getUserId() %></td>
			<td><%=user.getUserUserName() %></td>
			<td><%=user.getUserAge() %></td>
		
		
		</tr>	
	</tbody>
	</table>
</body>
</html>