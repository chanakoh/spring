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
<title>�˻����</title>
</head>
<body>
	<h1>��ȸ ���</h1>
	<table border="1">
		<tbody>
		<thead>
		<tr>
			<th>����� ��ȣ</th>
			<th>����� ��ȣ</th>
			<th>����� �̸�</th>
			<th>����� ����</th>
		</tr>
		</thead>
		
		<%
			//��ȸ�� ����� ������ ��ü ���
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